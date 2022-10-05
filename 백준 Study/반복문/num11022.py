# 백준 11022번두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
T = int(input())
for i in range (1, T+1) :
    A, B = map(int, input().split())
    print(f"Case #{i}: {A} + {B} = {A+B}")


'''
f-string 포맷을 이용하여 문제를 해결하였다. {}
'''
