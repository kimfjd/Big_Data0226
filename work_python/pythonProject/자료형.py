#파이썬은 변수 선언 시 데이터 타입을 지정하지 않으며, 변수에 값이 애입 될때 형이 결정 됨
number=200
number2=3.14
str1=""
bool1=True
print(type(number))#type(): 변수의 데이터형을 확인
print(type(str1))
print(type(bool1))
print(type(number2))


#형변환 : 선언된 변수에 값이 활당되는 순간 형이 결정, 이 후 다른 데이터 형으로 변결 할 때 사용
print(10 + int("10"))
print("나이 : ", str(30))
print(0.1*float("512.34"))

var=""#공백은 거짓
number1=0#0은 거짓
num=None #이것도 거직
print(bool(number1)) #boolean 값의 거짓: "",0,false,None