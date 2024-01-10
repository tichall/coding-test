# 좌표 정렬하기
import sys
input = sys.stdin.readline
n = int(input())
all = []
tmp = 0

for i in range(n) :
    point = list(map(int, input().split()))
    all.append(point) 

all.sort()
for i in range(n) : 
    print(all[i][0], all[i][1])

