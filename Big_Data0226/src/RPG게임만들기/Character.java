package RPG게임만들기;

public class Character extends Unit implements GameAction{
    // name : 캐릭터 이름
    // pP : 물리 힘
    // mP : 마법 힘
    // pH : 물리 적중률
    // mH : 마법 적중률
    // ultra : 특수 기술에 대한 공격력
    // hp : 체력
    // 캐릭터가 가지는 기본적인 능력치를 생성자를 통해서 결정 함 (캐릭터간의 밸런스를 맞춤)
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
        this.name = name; // this 는 자신의 객체를 참조하는 참조 변수 임.
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hp;
    }
    @Override
    public double pAttack() {
        return 0;
    }

    @Override
    public double mAttack() {
        return 0;
    }

    @Override
    public int ultimate() {
        return 0;
    }

    @Override
    public boolean setDamage(double damage) {
        return false;
    }
}
