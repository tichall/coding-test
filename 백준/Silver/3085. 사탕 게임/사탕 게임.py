# 3085번 사탕 게임
# 브루트 포스 

def count(arr): 
    # maxa는 행으로 가장 긴 개수, maxb는 열 방향으로 가장 긴 개수
    maxa, maxb = 1, 1
    for i in range(n) :
        tmp = 1
        for j in range(1, n) :
            if arr[i][j] == arr[i][j - 1] :
                tmp += 1
            else :
                tmp = 1
            maxa = max(maxa, tmp)
        tmp = 1
        for j in range(1, n) :
            if arr[j][i] == arr[j-1][i] :
                tmp += 1
            else :
                tmp = 1
            maxb = max(maxb, tmp)
    return(max(maxa, maxb))

n = int(input())
result = 0

# 2차원 배열 입력받는 방법
candy = [list(input()) for _ in range(n)]

for i in range(n) :
    for j in range(n) :
        if j + 1 < n :
            # 같은 것끼리 바꿔도 결과는 같기 때문에 색깔 바꿔줄 때 사탕 색이 다른 지 확인할 필요 X
            candy[i][j], candy[i][j+1] = candy[i][j+1], candy[i][j]
            tmp = count(candy)
            result = max(result, tmp)
            candy[i][j], candy[i][j+1] = candy[i][j+1], candy[i][j]

        if i + 1 < n :
            candy[i][j], candy[i+1][j] = candy[i+1][j], candy[i][j]
            tmp = count(candy)
            result = max(result, tmp)
            candy[i][j], candy[i+1][j] = candy[i+1][j], candy[i][j]

print(result)
