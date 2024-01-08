#queuestack
from collections import deque

que = deque()

n = int(input())
alist = list(map(int, input().split()))
blist = list(map(int, input().split()))
m = int(input())
clist = list(map(int, input().split()))

for i in range(n):
    # 큐인 경우
    if alist[i] == 0 :
        que.append(blist[i])

if len(que) == 0 :
    print(*clist)
    exit()

for i in range(m) :
    que.appendleft(clist[i])
    print(que.pop(), end = " ")
