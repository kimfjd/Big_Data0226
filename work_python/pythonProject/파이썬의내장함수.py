# 내장 함수: 별도의 import 없이 사용할 수 있도록 내장된 함수를 말함
print(max(32,45,48,57,23))
print(min(32,45,48,57,23))
# sum에는 리스트 혹은 튜플 형태로 전달
print(sum([26,34,45,69,67]))
value=0,1,2,3,4,5,6,7,8,9,10 #튜플
print(sum(value))
print(f"평균 : {sum(value)/len(value)}")
# 몫과 나머지
print(divmod(sum(value),5))

# 외장함수: 파이썬의 표준 모듈이지만 import 해야 사용가능
import random
for i in range(10):
    #rand = random.randint(0,4) #0~4사이의 임의의 정수 반환(4가 포함)
    #rand=random.randrange(0,4) # 0~4미만
    rand=random.randrange(4) # 0~4 미만
    print(rand)


# 날짜 및시간 관련 처리 모듈
from datetime import datetime # datetime 모듈에서 datetime 함수만 모듈
datetime.today() # 현재 날짜 가져오기
print(datetime.today().year) # 현재 년도 가져오기
print(datetime.today().month)
print(datetime.today().day)
print(datetime.today().hour)
print(datetime.today().minute)
print(datetime.today().second)

#달력 생성
import calendar
print(calendar.calendar(20210))
print(calendar.calendar(2024,m=5))
print(calendar.month(2024,5))

# math 모듈
import math

print(math.sin(100))
print(math.cos(100))
print(math.tan(100))
print(math.ceil(1.00000001))
print(math.floor(1.00000001))
