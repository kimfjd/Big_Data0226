#sit=[]
#while True:
 #   x=input("앉고 싶은 자리가 어디?")
  #  if x not in sit:
   #     sit.append(x)
    #    print("자리 예약 완료")
    #elif x in sit:
     #   x=input("그 자리엔 이미 손님이 있습니다. 다시 자리를 골라주세요")
k = list(map(int, input("좌석번호 : ").split()))
pc =[0]*100
cnt = 0
for e in k :
    if pc[e - 1] != 0 : cnt += 1
    else : pc[e - 1] = 1;

print(cnt)