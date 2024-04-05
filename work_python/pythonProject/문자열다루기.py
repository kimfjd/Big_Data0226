# 문자열이 문자로 이루어진 데이터 집합, 파이썬은 문자를 별도로 다루지 않고 전부 문자열로 간주
# " " -, ' ' , """ """, ''' '''
# "한줄 문자열", '한줄 문자열',"""여러줄 문자열""",'''여러줄 문자열'''
# 인덱싱이란: 시퀸스 자료형(리스트, 튜플, 문자열)에서 특정 위치의 요소를 선택하는 작업 swq[index]
# 슬라이싱이랑: 시퀸스 자료형에서 일부분 추출 seq[start:end:step]
my_list=[0,1,2,3,4,5,6,7,8,9] # 리스트 생성[]

slice_ws=my_list[2:7]#인덱스는 0부터 시작,end는 미만
slice_ws=my_list[1:9:2]# 1,3,5,7 1~9미나까지 2칸씩
print(slice_ws)

# 인덱싱, 슬라이싱 실습
# 주민등록번호 자르기, 허유ㅏ 7자리중 첫번째 글자는 성별, 앞의 6자리는 년,월,일
jumin="991130-1234567"
print("성별 : "+jumin[7])
print("년: "+jumin[:2])#0부터 2미만
print("월: "+jumin[2:4])
print("일: "+jumin[4:6])

print("생년월일: "+jumin[:6])
print("뒤 7자리: "+jumin[7:])#7에서 끝까지
print("뒤에서 7자리: "+jumin[-7:])


python_str="Life is too short You need Python"
new_str=python_str[0]+python_str[1]+python_str[2]+python_str[3]
#python_str[0]=("1") #리터럴 상수이기 때문에 변경 안됨
#print(new_str)

#대소문자 바꾸기:upper(),lower()
print(python_str.upper())
print(python_str.lower())

#문자열 변경
a_str="Hello Python Program"
print(a_str.replace("Python","JavaScript")) #출력만 Python에서 JavaScript바뀐거지 실제 a_str에서는 안바뀜
new_str=print(a_str.replace("Python","JavaScript")) #새로 만들어서 담아야함
print(new_str)

# 문자열에 포함된 문자 갯수 세기
print(a_str.count("l")) # 해당 문자열에서 count()함수에 전달 문자가 몇개 존재하는지 반환
print(len(a_str))#문자열에 길이 반환
print(a_str.__len__()) # 문자열의 길이를 반환하는 내장 함수
# 문자열 찾기 find(), rfind(), index()
# find(): 찾은 문자열 인덱스 반환 없으면 -1
# rfind(): 뒤에서 문서 문자열 찾고 찾은 인덱스는 앞에서 계산
# index(): 찾은 문자열의 인덱스 반환, 없으면 ValueError
phrase="가장 큰 실수는 포기, 가장 어리석은 일은 남의 결점 찾기, 가장 좋은 선물은 용서"
print(phrase.find("가장"))
print(phrase.rfind("가장"))
print(phrase.index("가장"))
print(phrase.find("오우"))
print(phrase.rfind("나에게"))
# print(phrase.index("나에게")) 에러남
new_str1=phrase.replace("가장","나에게")
print(new_str1)
#문자열 연산자:"문자열"+"문자열","문자열"*3
print("집"+"가고싶다")
print("집가고싶다"*3)
# print("집"+"가고싶다") 안됨
# 문자열 양옆의 공백 제거 : strip()
input_a="""안녕하세여
문자열 함수르 알아 봅시다.
"""

print(input_a.strip)