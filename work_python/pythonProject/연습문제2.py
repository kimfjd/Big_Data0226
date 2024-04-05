hour,min=input("일어날 시간 설정").split(":")
hour=int(hour)
min=int(min)
alt=min-45
if alt<0:
    hour-1
    alt+=60
if hour>12:
    hour-=12
print(f"현재 시간은 {hour}시 {alt}분")