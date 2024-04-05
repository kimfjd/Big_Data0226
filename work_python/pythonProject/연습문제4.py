n = int(input())
w=0
for i in range(n):
    print(" "*w,end="")
    for j in range(n-i):
        print("*", end="")
    w+=1
    print()