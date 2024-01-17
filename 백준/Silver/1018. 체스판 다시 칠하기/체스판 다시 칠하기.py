# 1018번 체스판 다시 칠하기 

n, m = map(int, input().split())
board = []
result = []
for i in range(n):
    board.append(input())

# 첫 번째 칸에 맞추는 방법이 최소 횟수가 아닐 수 있음
# 첫 칸에 맞춰 바꾸는 방법과 반대 방법을 모두 카운트해 비교해줘야 한다! 
# 즉, 첫 칸의 색깔이 중요하지 않다!
for i in range(n - 7) :
    for j in range(m - 7) :
        cntW = 0
        cntB = 0
        for a in range(i, i + 8) :
            for b in range(j, j + 8) :
                if (a + b) % 2 == 0 :
                    if board[a][b] != 'W' :
                        cntW += 1
                    if board[a][b] != 'B' :
                        cntB += 1
                else :
                    if board[a][b] != 'W' :
                        cntB += 1
                    if board[a][b] != 'B' :
                        cntW += 1
        result.append(min(cntW, cntB))

print(min(result))
