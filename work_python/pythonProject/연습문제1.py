wd=input("3자리 정수 입력")
wd1=int(wd[0])
wd2=int(wd[1])
wd3=int(wd[2])

if wd1>wd2 and wd1>wd3:
    print(wd1)
elif wd2>wd1 and wd2>wd3:
    print(wd2)
else:print(wd3)

주간=9860
야간=주간*1.5
근무시간=int(input("근무시간"))
print(f"주간 근무면{근무시간*주간} 야간 근무면{근무시간*야간}")