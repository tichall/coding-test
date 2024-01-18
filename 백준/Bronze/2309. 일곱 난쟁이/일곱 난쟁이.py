# 2309번 일곱 난쟁이
# 브루트포스 알고리즘

height = []
for _ in range(9) :
    height.append(int(input()))

for i in range(9) :
    for j in range(i + 1, 9) :
        if sum(height) - (height[i] + height[j]) == 100 :
            tmp1 = height[i]
            tmp2 = height[j]

height.remove(tmp1)
height.remove(tmp2)
height.sort()
print(*height, sep = "\n")
    