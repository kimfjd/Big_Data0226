# 튜플 : 값을 변경할 수 없는 (immutable) 시퀸스 자료형
# () 소괄호를 사용해서 만듥거나 괄호가 없으면 튜플
person = 'Alice',30, '김동환', True #Packing
print(person)
a,b,c,d=person#Unpacking
print(person)
print(a)

# 튜플을 이용한 함수 반환 값 다루기
def get_person():
    name="김동환"
    age=25
    addr="경기도 이천시"
    return name, age, addr

name_card=get_person()
print(name_card)