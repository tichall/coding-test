n = int(input())
min = -1
m = n // 5

if (n % 5 == 0) :
    min = m

else : 
    for i in range(m, -1, -1):
        if (n - (5 * i)) % 3 == 0:
            j = (n - (5 * i)) // 3
            min = i + j
            break

print(min)