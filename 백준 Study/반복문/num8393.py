# 백준 8393번 n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
n = int(input())
i=1
sum=0
for i in range (1, n+1) :
    sum+=i
    i+=1

print(sum)    
    
