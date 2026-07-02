class Solution(object):
    def findSafeWalk(self, grid, health):
        if grid[0][0] == 1:
            health -= 1

        if health <= 0:
            return False

        n, m = len(grid), len(grid[0])
        dirs = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        best = [[-1] * m for _ in range(n)]
        best[0][0] = health

        q = deque([(0, 0, health)])

        while q:
            i, j, hp = q.popleft()

            if i == n - 1 and j == m - 1:
                return True
            if hp < best[i][j]:
                continue

            for dx, dy in dirs:
                ni, nj = i + dx, j + dy

                if not (0 <= ni < n and 0 <= nj < m):
                    continue

                new_hp = hp - grid[ni][nj]

                if new_hp <= 0:
                    continue

                if new_hp > best[ni][nj]:
                    best[ni][nj] = new_hp
                    q.append((ni, nj, new_hp))

        return False

        