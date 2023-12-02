import sys
input = sys.stdin.readline

t = int(input().rstrip())
for i in range(t):
    a, b = map(int, input().split())
    print(a + b)