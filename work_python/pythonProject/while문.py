# while문: 참인 경우 동안 반복, 반복횟수를 알 수 없을때ㅐ 사용
# 입력 받음 정수의 합 구하기
n=int(input("정수 입력"))
sum=0
while n:
    sum+=n
    n-=1 #n-- 파이썬에서는 안됨
    print(sum)

while True:
    age=int(input("나이 입력"))
    if 0 <= age < 200: break
    print("나이 범위를 벗어 났습니다")