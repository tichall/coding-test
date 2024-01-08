# 카드2

from collections import deque

n = int(input())
que = deque(range(1, n+1))

while len(que) != 1 :
    que.popleft()
    mnum = que.popleft()
    que.append(mnum)

print(que[0])

