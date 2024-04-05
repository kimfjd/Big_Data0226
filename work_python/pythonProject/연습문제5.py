#회원정보를 입력 받아서 출력 하는 예제 진행

#- 이름 입력
#- 나이 입력 : 1 ~ 199까지 입력 받고 잘못된 값이 오면 재 입력 요청을 한다.
#- 성별 입력 : 영문자 (M과m은 남성) (F와 f는 여성)으로 입력 받고 나머지는 재 입력 요청을 한다.
#- 직업 입력 : 1(학생), 2(회사원), 3(주부), 4(무직)으로 입력 받고 나머지는 재 입력 요청 한다.
#- 결과는 마지막에 한번에 출력 한다.

name=input("이름을 입력해 주세요")
while True:
    old=int(input("나이를 입력하여 주세요"))
    if old >199 or old < 1:
        print("나이의 범위를 잘못 입력 하였습니다.")
    elif 1<=old<=199: break
while True:
    gender=input("성별을 입력해 주세요 성별은 M,m,F,f로만 입력")
    if gender=="m" or gender=="M":
        gender="남성"
        break
    elif gender=="F" or gender=="f":
        gender="여성"
        break
    else: print("성별을 잘못 입력 하였습니다 M,m,F,f로만 입력 가능")
while True:
    job=int(input("집업을 입력 하여 주세요 1(학생), 2(회사원), 3(주부), 4(무직)"))
    if job<1 or job>4:
        print("직업 범위를 잘못 입력 하였습니다.")
    elif job==1:
        job="학생"
        break
    elif job==2:
        job="회사원"
        break
    elif job==3:
        job="주부"
        break
    elif job==4:
        job="무직"
        break
    else:
        print("잘못 입력 하셨습니다.")
print(f"{name} {old} {gender} {job} ")