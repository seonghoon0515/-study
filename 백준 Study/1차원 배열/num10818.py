# 백준 10818번 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
N = int(input())
list_N = list(map(int, input().split()))

list_N.sort()

print(min(list_N), end=" ")
print(max(list_N))
