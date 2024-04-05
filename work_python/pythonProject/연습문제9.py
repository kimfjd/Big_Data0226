reg={"black":[0,1],"brown":[1,10],"red":[2,100],
     "orange":[3,1000],"yellow":[4,10000],"green":[5,100000],"blue":[6,1000000],
     "violet":[7,10000000],"grey":[8,100000000],"white":[1000000000]}

x=input("첫번째 색 입력")
y=input("두번째 색 입력")
z=input("세번째 색 입력")

print((int(str(reg[x][0])+str(reg[y][0]))*reg[z][1]))