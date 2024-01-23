# 11866번 요세푸스 문제 0

n, k = map(int, input().split())
index = 0
que = []
res = []
for i in range(1, n+1) :
    que.append(i)

while que :
    index += (k-1)
    if index >= len(que) :
        index = index % len(que)
    res.append(str(que.pop(index)))

# 배열 한 줄 출력 *배열명
# print("<", *res, ">", sep = ",")

# join 함수는 배열 출력 시 구분자 지정 가능
# join은 리스트의 문자열 요소만을 합쳐줌
print("<", ", ".join(res), ">", sep = "")