# 표준입출력은 print() 함수 사용
print(38) #정수열
print("문자열") #문자열
print([1,2,3]) # 리스트
print("파"+"이"+"썬")
print("파""이""썬")
print('파''이'"썬") # 파이썬에서는 '' "" 모두 문자열로 간주
print('파','이','썬') # 콤마는 구분자를 의미
print("\n\n\n") # 줄바꿈 문자를 의미

print("""
dasdfdasf
sadfsdafsa
asdfasf""")

print("안녕하세요 라고 \"라르르라라란미님ㄴ\"말을해버림") #문자열 내에서 " " 사용
print('안녕하세요 라고"내가 말을"해버림')

print("서울시 \t강남구\t역삼동") # 탭만큼 간격 띄우기
print("사과 \r 바나나") #  커서를 앞으로 돌림

# end 와 sep 옵션
# end: 출력 할때 가장 마지막에 자동으로 삽입되는 문자 지정 옵션(기본은 줄바꿈)
# sep: 중간에 삽이되는 문자를 지정하는 옵션 (기본은 공백 한칸)
print("Hello", end="*")
print("World", end="*")
#콤마를 Seperator(구분자)라고 함
print(1,2,3,4,5,6,7,8,9,10, sep="-")

year=2024
month=3
day=19
print(year,month,day,sep="/")