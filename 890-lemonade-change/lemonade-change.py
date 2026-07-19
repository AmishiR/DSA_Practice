class Solution(object):
    def lemonadeChange(self, bills):
        count_5s=0
        count_10s = 0
        change=True
        for num in bills:
            if num==5:
                count_5s+=1

            elif num==10:
                if count_5s==0:
                    return False
                else:
                    count_10s+=1
                    count_5s-=1

            elif num==20:
                if count_10s >= 1 and count_5s >= 1:
                    count_10s -= 1
                    count_5s -= 1
                elif count_5s >= 3:
                    count_5s -= 3
                else:
                    return False
        return True


        