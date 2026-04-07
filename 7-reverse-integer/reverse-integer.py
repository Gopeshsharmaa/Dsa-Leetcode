class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        INT_MIN = -2147483648
        INT_MAX = 2147483647
        s = str(x)
        if s[0] == "-":
            reversed_s = s[:0:-1]
            reversed_int = -int(reversed_s)
        else:
            reversed_s = s[::-1]
            reversed_int = int(reversed_s)
        if reversed_int < INT_MIN or reversed_int > INT_MAX:
            return 0
        else:
            return reversed_int