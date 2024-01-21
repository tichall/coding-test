# 2525번 오븐 시계

hour, minute = map(int, input().split())
need = int(input())
time = minute + need

need_hour = time // 60
minute = time % 60
hour = need_hour + hour

if hour >= 24 :
    hour = hour - 24

print(hour, minute)