#회원가입을 위한 아이디/패스워드 입력 확인
user=input("아이디 입력: ")
if len(user) >= 8:
    pwd=input("비밀번호 입력: ")
    if len(pwd)<8 or len(pwd) > 16:
        print("비밀번호는 8보다 크고 16보다 작아야 합니다.")
    elif pwd.find(user)>=0: #해당 문자열의 인덱스를 반환, 없으면 -1
        print("비밀번호에 아이디를 포함 시킬수 없음")
    else:
        print("아이디",user)
        print("패스워드",pwd)
else:print("아이디는 8자리 이상이어야 합니다.")