class Solution(object):
    def furthestDistanceFromOrigin(self, moves):
        #First Thought

        # we would see what is maximum in the string predominanately L or R
        # if L we would fill all '_' with L 
        # if R we would fill all '_' with R

        # To count distance

        # Take L as +1 and R as -1
        # Return distance as absolute as if in right it would be in neg
        # Start from origin 0

        moves=list(moves)
        origin=0
        left_count=0
        right_count=0
        count=0

        length=len(moves)
        for i in range(length):
            if moves[i]=='L':
                left_count+=1
            elif moves[i]=='R':
                right_count+=1
            
            
        if left_count>=right_count:
            for i in range(length):
                if moves[i]=='_':
                    moves[i]='L'
        else:
            for i in range(length):
                if moves[i]=='_':
                    moves[i]='R'
                
        for i in range(length):
            if moves[i]=='L':
                count=count+1
            else:
                count=count-1
        
        return(abs(count))




        