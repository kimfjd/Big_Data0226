# 3개의 정수를 입력 맏아 최대값/최소값 구하기

# 주민등록번호를 입력받아 생년월일,성별,나이 출력하기

# 2개의 문자열을 변수 s와 k에, 양의 정수를 변수n에 각각 전달 받아 s문자열의 뒤 부분의 n개 문자를 k문자열 앞에 끼워 넣는 코드 작성
# 예) s:seoul
#     k: korea
#     n: 2
#     result: ulkorea

from datetime import datetime
a = input("정수a 입력 하세요")
b = input("정수b 입력 하세요")
c = input("정수c 입력 하세요")

if a>b and a>c: print("최대값은"+a)
elif b>a and b>c: print("최대 값은"+b)
elif c>a and c>b:print("최대값은"+c)

if a<b and a<c: print("최소값은"+a)
elif b<a and b<c:print("최소값은"+b)
elif c<a and c<b:print("최소값은"+b)

num=input("주민등록 번호 입력 할 것 : ")

print(f"당신의 생년월일은{num[0:2]} 년 {num[2:4]}월 {num[4:6]}일")
if num[7]=="1" or num[7]=="3": print("남성")
elif num[7]=="2" or num[7]=="4": print("여성")
else: print("남자도 여자도 아님")
year = datetime.today().year
num1=int(num[0:2])
if num1>80: youYear="19"+str(num1)
else: youYear="20"+str(num1)
youYear1=int(youYear)
print((year-int(youYear1))+"살")

s=input("문자열 s를 입력해주세요: ")
k=input("문자열 k를 입력해주세요: ")
n=int(input("문자열 s에서 추출할 n개를 입력해주세요"))
sn=s[len(s)-n:len(s)+1]
print(sn+k)

lis=list(map(int,input("정수 여러개").split("/")))
print(f"합계:{sum(lis)}")
print(f"평균{sum(lis)/len(lis)}")