def open_account(name): #매개변수와 반환값이 있는 함수 선언
    print(f"{name}님의 계좌가 개설 되었습니다.")
    return name
def deposit(input):
    global balance
    balance+=input
    print(f"{input}이 입금 되었습니다. 잔액은 {balance}입니다")
def withdraw(input):
    global balance
    if balance>=input:
        balance-=input
        print(f"{input}이 출금 되었습니다. 잔액은 {balance}입니다.")
    else: print("출금이 실패 했습니다.")

balance=0
name = open_account("김동환")
deposit(1000)
withdraw(500)
print(f"{name}잔액은 {balance}입니다.")
