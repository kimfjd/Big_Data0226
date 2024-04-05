# 성적에 맞는 학점 출력
# 국어, 영어, 수학 성적을 입력 받아 평균을 구해 등급 출력
# 평균 90이상 A 80 이상 B 70이상 C 60이상 D 나머지 F
kor , eng , math  =map(int,input("성적을 입력하세요 국어 영어 수학 점수 사이에 '/' 넣을것 ").split("/"))
score=kor+eng+math
avg=score/3
if avg>=90:
    print("학점 A")
elif avg>=80:
    print("학점 B")
elif avg>= 70:
    print("학점 C")
elif avg>=60:
    print("학점 D")
else: print("학점 F")