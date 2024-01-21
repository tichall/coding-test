# 2884번 알람 시계

H, M = map(int, input().split())

M = M - 45

if M < 0 : 
    H -= 1
    M = 60 + M

if H < 0 :
    H = H + 24

print(H, M)