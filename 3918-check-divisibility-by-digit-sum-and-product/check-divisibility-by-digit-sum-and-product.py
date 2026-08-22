class Solution(object):
    def checkDivisibility(self, n):
        sum_value=0
        product_value=1
        num=n
        while num>0:
            digit=num%10
            sum_value+=digit
            product_value*=digit
            num=num//10

        summation = sum_value+product_value

        if n%summation==0:
            return True
        else:
            return False



        