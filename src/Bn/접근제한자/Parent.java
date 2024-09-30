package Bn.접근제한자;

public class Parent {
    protected String name; // protected 같은 패키지 이거나 상속 관계가 존재하면 접근 가능
    protected String money; // 접근제한자가 없으면 default, 같은 패키지내에서만 접근 가능
    protected String addr;
    public Parent() {
        name = "이건희";
        money = "2000억";
        addr = "서울시 강남구 역삼동";
    }

    public String getName() {
        return name;
    }

    public String getMoney() {
        return money;
    }

    public String getAddr() {
        return addr;
    }
}
