import random
aa=[]
b=int(input("배열 길이"))
for i in range(b):
    aa.append(random.randrange(0,51))
c=int(input("찾는 숫자 입력"))
for i in range(len(aa)):
    if i==c:
        print(i)
    else: print("-1")
