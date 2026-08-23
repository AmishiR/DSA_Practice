class Solution(object):
    def setZeroes(self, matrix):
        r=len(matrix)
        c=len(matrix[0])

        rows=[0]*r
        cols=[0]*c

        for i in range(0,r):
            for j in range(0,c):
                if matrix[i][j]==0:
                    rows[i]=-1
                    cols[j]=-1
        
        for i in range(0,r):
            for j in range(0,c):
                if rows[i] or cols[j]==-1:
                    matrix[i][j]=0
                
        return matrix
