package OOP;

public class Student {
    public static void main(String[] args) {
        StudentDemo s = new StudentDemo();
        // s.rno = 1;
        // s.name = "joel";
        // s.marks = 99.9f;
        System.out.println(s.rno);
         System.out.println(s.name);
          System.out.println(s.marks);
        s.greeting();
        s.changeName("rahul");
        s.greeting();

        StudentDemo kunal = new StudentDemo(2,"kunal",23.2f);
        kunal.greeting();

        StudentDemo random = kunal;
        random.greeting();
    }
}


class StudentDemo{
    int rno;
    String name;
    float marks;

    StudentDemo(){
        this(0, "None", 0.0f);
        this.rno = 13;
        this.name = "Joel";
        this.marks = 98.8f;
    }
    StudentDemo(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    StudentDemo( StudentDemo other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting(){
        System.out.println("my name is: "+this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }
}



