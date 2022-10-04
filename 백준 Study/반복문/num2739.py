# 백준 2739번 구구단 문제
num= int(input())

for i in range(1, 10) :
    print(num, "*", i, "=", num*i)
    i+=1
