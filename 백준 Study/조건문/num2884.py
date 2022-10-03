# 백준 2884번 알람시계 문제
H, M = map(int, input().split())
if M < 45 :
    if H == 0 :
        H = 24
    M+=15
    H-=1
    print(H, M)
elif M >= 45 :
    H==H
    M-=45
    print(H, M)
    
