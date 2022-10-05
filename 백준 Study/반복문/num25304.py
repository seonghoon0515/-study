# 백준 25304번 영수증 문제
X = int(input())
N = int(input())
sum=0
for i in range(N) :
  A, B = map(int, input().split())
  sum+=(A*B)

if X == sum :
    print('Yes')
else :
    print('No')
