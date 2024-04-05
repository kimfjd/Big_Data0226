file_name="카페일일매출"

f = open(file_name, "r", encoding="utf-8")
# for line in f:
#     print(line, end=" ")
# f.close()

# header=f.readline() # 데이터의 첫째줄 읽음
# header_line=header.split()
# for line in f:
#     data_list=line.split()
#     print(data_list)
f.close()
espresso = []
americano = []
cafelatte = []
cappucino = []

for line in f:
    data_list=line.split()
    espresso.append(int(data_list[1]))
    americano.append(int(data_list[2]))
    cafelatte.append(int(data_list[3]))
    cappucino.append(int(data_list[4]))

f.close()
print(f"{data_list[1]} 전체 판매량 : {sum(espresso)}, 일 평균 판매량 : {sum(espresso)/len(espresso)}")
print(f"{data_list[2]} 전체 판매량 : {sum(americano)}, 일 평균 판매량 : {sum(americano)/len(americano)}")
print(f"{data_list[3]} 전체 판매량 : {sum(cafelatte)}, 일 평균 판매량 : {sum(cafelatte)/len(cafelatte)}")
print(f"{data_list[4]} 전체 판매량 : {sum(cappucino)}, 일 평균 판매량 : {sum(cappucino)/len(cappucino)}")
