class Solution(object):
    def doesAliceWin(self, s):
        for c in s:
            if c in "aeiou":
                return True
        return False
        """
        :type s: str
        :rtype: bool
        """
        