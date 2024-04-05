package 인터페이스;

public class NameMain {
    public static void main(String[] args) {
        animal[] animals = {new Cow()};

        /*for (animal animal : animals) {
            animal.Sound();
        }*/
        animal 시츄 = new Dog();
        System.out.println("시츄의 소리");
        시츄.Sound();

        animal 말티즈 = new Dog();
        System.out.println("말티즈 소리");
        말티즈.Sound();

        animal 페르시안 = new Cat();
        System.out.println(("페르시안 소리"));
        페르시안.Sound();

        animal 먼치킨 = new Cat();
        System.out.println("먼치킨 소리");
        먼치킨.Sound();

        animal 황소 = new Cow();
        System.out.println("황소는 음메~");
        황소.Sound();

        animal 닥스훈트=new Dog();
        닥스훈트.Sound();
        System.out.print("닥스훈트는 맛있게 사료를");
        닥스훈트.밥먹기();

    }

}


