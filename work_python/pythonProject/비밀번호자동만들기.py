# 각 사이트의 비밀 번호를 자동으로 만들기
# 규칙1 : http://naver.comdptj dkvdml http://잘라내기
# 규칙2 : 처음 만나는 점(.) 이후는 제거
# 규칙3 : 남은 글자 중 처음 세자리 + 글자 갯수 + 글자에 포함된 'o'의 갯수 + 글자에 포함된 'k' 개수 + "!" + 자신의 이니셜
file_name="pwd.txt"
f = open(file_name,"wt")

while True:
    url=input("사이트: ")
    if url=="exit":break
    my_str=url.replace("http://","")# 잘라내기
    my_str=my_str[:my_str.index(".")]#0번 인덱스 부터 . 미만 까지 잘라냄(슬라이싱)
    pwd=my_str[:3] + str(len(my_str))+str(my_str.count("o"))+str(my_str.count("k"))+"!"+"kdh"
    print("생성된 비밀 번호",pwd)
    f.write(pwd+"\n")
f.close()