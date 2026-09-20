class Solution(object):
    def rotateString(self, s, goal):
        if len(s)!=len(goal):
            return False

        goal=goal+goal

        if s in goal:
            return True
        else:
            return False
            
