# 람다(lambda)? 간단한 함수의 선언과 호출을 하나의 식으로 간략히 표현 한 것
# 람다는 주로 이름없는 함수를 만든 때 사용
# 람다의 장점은 코드의 간결함, 메모리 절약 등의 이점이 있음
def add(a,b):
    return a+b

print(add(1,10))

print((lambda a,b: a+b)(5,8))

# 함수의 매개변수로 함수 전달 하기
def call_times(func):
    for i in range(10):
        func()
def print_hello():
    print("Hello!!")


call_times(print_hello)

call_times(print_hello)

def power(n): # 입력 값의 제곱을 구하는 함수
    return n*n
power2= lambda n:n*n # 입력 값의 제곱을 구하는 람다식

input=map(int,input().split())
#rst=list(map(power,input))
#rst1=list(map(power2,input))
rst1=list(map(lambda n:n*n,input))
#print(rst)
print(rst1)