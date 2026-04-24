class Solution(object):
    def judgeCircle(self, moves):
        # First principle
        #There are two blocks of contradicting movements 
        #up -> down
        #left->Right

        #count frequencies of each left,right,up,down
        #if the contradicting movements are there in equal frequency then only in origin or else false

        moves=list(moves)
        left=moves.count("L")
        right=moves.count("R")
        up=moves.count("U")
        down=moves.count("D")

        if left==right and up==down:
            return True
        else:
            return False
        