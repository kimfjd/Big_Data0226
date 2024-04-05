# 파이썬의 객체지향 언어 특징
# 1. 다중 상속 지원
# 2. 캡슐화(접근제한다)는 제대로 지원 되지 않음
# 3. 다형성에서 오버라이딩은 지원, 오버로딩은 지원하지 않음(데이터 타입이 없고, 디폴트
# 4. 생성자 키워드 : __init__
# 5. 자바에서 말하는 인스턴스 필드는 생성자 내에 존재해야 함
# 6. 자신의 객체를 가리키는 포인터는 생성자 또는 메소드의 첫번째 인자임(주로 관례상 salf이름 사용)
class TV:
    def __init__(self, name, isOn, channel, volume):
        self.name = name
        self.isOn = isOn
        self.channel = channel
        self.volume = volume

    def set_on(self, isOn):
        self.isOn = isOn

    def set_channel(self, cnl):
        self.channel = cnl

    def set_volume(self, vol):
        self.volume = vol

    def get_on(self):
        return self.isOn

    def get_channel(self):
        return self.channel

    def get_volume(self):
        return self.volume

    def view_tv(self):
        power = ("OFF", "ON")
        print(f"이름 : {self.name}")
        print(f"전원 : {power[self.isOn]}")
        print(f"채널 : {self.channel}")
        print(f"볼륨 : {self.volume}")


lg_tv = TV("LG", False,  10, 10)
samsung_tv = TV("SAMSUNG", False, 20, 20)
samsung_tv.view_tv()
lg_tv.view_tv()