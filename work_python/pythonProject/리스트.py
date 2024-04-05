# 리스트: 연속적으로 저장되는 형태의 자료형, 크기가 동적으로 변함
# 자바와 다른점은 여러가지 데이터 타입이 섞여 있을 수 있음,
# 리스트내에 리스트가 존재할 수 있음
# 리스트는 읽기/쓰기 가능, 튜플은 동일한 구조이지만 읽기만 가능
number=[1,2,3,4,5,6,7]
fruits=['apple','banana','orange']
mixed=[1,'apple',True,3.14,['Ev6','Santafe','Sorento']]

print(number[1])
print(fruits[0])
print(fruits[1][2])
print(mixed[4][2])
print(mixed[4][2][5])
#print(mixed[3][1]) # True 및 숫자는 하나의 개체로 처리 되어 추출 불가
print(len(mixed[4]))
print(mixed[4][2][-7])

list_a=[1,2,3]
list_b=[4,5,6]
list_c= list_a+list_b
print(list_c)
new_list=[1,2,3]
new_list.append(4) #뒷줄에 값을 추가
new_list.append(5)
new_list.insert(1,1000)#1번 인덱스에 값추가
print(new_list)

# 리스트에서 값제거하기 : pop,remove,clear
# pop : 인덱스가 없으면 마지막 인덱스의 값을 반환하고 삭제
print(new_list.pop(1)) # 해당 인덱스이 값을 반환하고 제거
new_list.remove(3) #해당 값을 제거, 동일한 값이 여러개 있으면 낮은 인덱스 값 제거
#new_list.clear()# 내용을 전부 제거 하지만 리스트는 제거 하지 않음
del new_list[3]# 3번 인덱스 제거
print(new_list)


# 변수와 리스트의 차이 비교
#kor, eng, mat=map(int,input('정수 입력').split())
#total= kor+mat+eng
#print(total/3)

#score=list(map(int,input('정수 입력').split()))
#print(sum(score)/len(score))

#중복 제거
my_list=["A","B","C","D","E","B","C"]
aa_list=[]
for e in my_list:
    if e not in aa_list:
        aa_list.append(e)
print(aa_list)

# 리스트 순회하기
x=["John","George","Paul","Ringo"]
#for e in x:
 #   print(e, end=" ")
for i in range(len(x)):
    print(x[i],end=" ")