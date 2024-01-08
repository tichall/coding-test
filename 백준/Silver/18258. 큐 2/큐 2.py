# 큐 2
from collections import deque
import sys
input = sys.stdin.readline

que = deque()
n = int(input())

for i in range(n) :
    option = list(input().split())
    if option[0] == "push" :
        que.append(int(option[1]))
    elif option[0] == "pop" :
        if que : 
            print(que.popleft())
        else : 
            print("-1")
    elif option[0] == "size" :
        print(len(que))
    elif option[0] == "empty" :
        if que :
            print("0")
        else :
            print("1")
    elif option[0] == "front" :
        if que :
            print(que[0])
        else :
            print("-1")
    elif option[0] == "back" :
        if que :
            print(que[-1])
        else :
            print("-1")