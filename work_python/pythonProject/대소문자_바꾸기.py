# 문자열을 입력 받아 대문자는 소문자로 대문자는 소문자로, 소문자는 대문자로 변경
word=input("단어 입력")
rst=""
for e in word:
    if e.islower():
        rst += e.upper()
    else:
        rst+=e.lower()
print()