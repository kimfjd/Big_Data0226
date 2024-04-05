a=int(input("a 정수 입력"))
b=int(input("b 정수 입력"))
c=int(input("c 정수 입력"))
num=a*b*c
for i in range(0,10):
    print(str(num).count(str(i)))


