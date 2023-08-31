package OOP;

class A{
    int num;
    protected String name;
    A(int num, String name){
        this.num = num;
        this.name = name;
    }
}

class SubA extends A{
    int age;
    SubA(int num, String name, int age){
        super(num, name);
        this.age = age;
        this.num = 0;
        this.name = "32423";
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        SubA s = new SubA(0, "Qweqweqw", 0);
        s.name = "asdasd";
    }
}
