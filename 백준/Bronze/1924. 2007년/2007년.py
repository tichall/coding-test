# 2007년
month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
day = 0
date = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]

x, y = map(int, input().split())

for i in range(x - 1):
    day += month[i]
day = (day + y) % 7
print(date[day])
month[x-1]