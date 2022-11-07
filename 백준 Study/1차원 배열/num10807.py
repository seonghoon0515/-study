# 백준 10807번 개수 세기
# 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
N = int(input())
list_N = list(map(int, input().split()))
cnt=0
v = int(input())
for i in range(len(list_N)) :
    if v == list_N[i] :
        cnt+=1

print(cnt)

