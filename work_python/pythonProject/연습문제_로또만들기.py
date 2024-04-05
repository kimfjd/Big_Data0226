# 중복안되는 로또 만들기
import random
lot=[]
aa=[]
for i in range(0,6):
    aa.append(random.randint(1,45))
for e in aa:
    if e not in lot:
        lot.append(e)
    elif e in aa:
        lot.append(random.randint(1,45))
print(lot)