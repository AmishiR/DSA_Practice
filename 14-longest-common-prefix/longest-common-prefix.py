class Solution(object):
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""

        result = ""

        for chars in zip(*strs):
            if len(set(chars)) != 1:
                break
            result += chars[0]

        return result