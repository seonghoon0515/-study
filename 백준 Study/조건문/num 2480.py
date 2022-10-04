# 백준 2480번 문제 주사위 세 개 문제 
a1, a2, a3 = map(int, input().split())

if a1==a2 and a1 == a3 :
    print(10000+(a1*1000))

elif a1==a2 and a1 != a3 :
    print(1000+(a1*100))
elif a1==a3 and a1 != a2 :
    print(1000+(a1*100))
elif a2==a3 and a1 != a2 :
    print(1000+(a2*100))        

else :
    print(max(a1, a2, a3)*100)
