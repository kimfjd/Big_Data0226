# 조건문과 반복문은 제어문이라고 함, 이는 순차적인 흐름을 제어하는 목적으로 사용됨
# 파이썬의 조건문 자바의 if문과 switch문을 결합한 형태와 유사 파이선은 switch문 없음
# 조건문의 수행은 들여쓰기 구분하고 각각의 조건은 :(클론)으로 구분
num=int(input("정수를 입력 할 것"))

if num>=0:
    print("양수")
else:
    print("음수")

if num>100:
    print("100보다 큼")
elif num<100:
    print("100보다 작아요")
else: print("100임")

season=input("지금 계절")
if season == "spring":
    print("따뜻한 봄이 왔어요")
elif season=="summer":
    print("무더운 여름 입니다")
elif season=="fall" or season=="automn":
    print("씁슬한 가을임")
else:
    print("추운겨울입니다")