menu_dic = {
    "Americano": ["Coffee", 2000, "기본 커피 입니다."],
    "Esspresso": ["Coffee", 2500, "진한 커피 입니다."],
    "Latte": ["Coffee", 4000, "우유가 들어 있는 커피 입니다."],
    "ColdBrew": ["Coffee", 4500, "연유가 들어 있는 커피 입니다."],
    "GreenTea": ["Tea", 4500, "녹차 입니다."],
    "BlackTea": ["Tea", 4500, "홍차 입니다."],
    "MlilTea" : ["Tea", 4000, "우유가 포함된 차 입니다."],
    "PeachAde": ["Ade", 5000, "복숭아 에이드 입니다."],
    "GreenAde": ["Ade", 5000, "포도 에이드 입니다."],
    "LemonAde": ["Ade", 4500, "레몬 에이드 입니다."]
}

while True:
    print("메뉴를 선택하세요")
    meun=int(input("[1] 메뉴 보기, [2] 메뉴 조회, [3] 추가 하기, [4] 삭제 하기, [5] 종료 하기 : "))
    if meun ==1:
        for key in menu_dic: #키와 키에 해당하는 값을 출력
            print(key,":",menu_dic[key]) # 키와 해당하는 값 출력
    elif meun ==2:
        read_name= input("조회할 메뉴")
        if read_name in menu_dic:
            print(menu_dic[read_name])
        else: print("찾는 메뉴가 없음")
    elif meun ==3:
        add_meun = input("추가할 메뉴 입력")
        if add_meun not in menu_dic:
            cata= input("카테고리 입력")
            price=int(input(("가격 입력")))
            desc=input("메뉴 설명 : ")
            menu_dic[add_meun]=[cata,price,desc] #해당 키에 값을 대입
        else: print("메뉴가 이미 존재 합니다")
    elif meun==4:
        del_meun = input("삭제할 메뉴 입력")
        if del_meun in menu_dic:
            del menu_dic[del_meun]
        else: print("삭제할 메뉴가 없습니다")

        for key in menu_dic:
            print(key,":",menu_dic[key])
    elif meun==5:
        print("영업을 종료 합니다")
        break