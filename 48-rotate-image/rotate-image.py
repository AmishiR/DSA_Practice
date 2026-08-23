class Solution(object):
    def rotate(self, matrix):
        r=len(matrix)
        c=len(matrix[0])

        for i in range(0,r):
            for j in range(i+1,r):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        for i in range(r):
            matrix[i].reverse()

        return matrix
        

        
        