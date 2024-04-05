# 임의의 수를 연속(공백)으로 입력 받아 홀수, 짝수 리스트로 나누어 담기
# 1 2 3 4 5 6 7 8 9 10
# 홀수: 1 3 5 7 9
# 짝수: 2 4 6 8 10

import random
x=int(input("몇개의 숫자를 생성 하시겠습니까?"))
num=[]
y=[]
z=[]
for i in range(x):
    num.append(random.randint(1,100))
    if num[i] %2==0:
        y.append(num[i])
    elif num[i]%2!=0:
        z.append(num[i])

print(num)
print(y)
print(z)

#num=list(map(int,input("정수 입력 : ").strip()))
#even=list(filter(lambda x:x % 2==0,num))
#odd=list(filter(lambda x:x % 2==1,num))
#print(f"홀수: {odd}")
#print(f"짝수: {even}")