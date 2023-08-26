package OOP;

public class Student {
    public static void main(String[] args) {
        StudentDemo s = new StudentDemo();
  
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

        System.out.println(random.population);
    }
}


class StudentDemo{
    int rno;
    String name;
    float marks;
    static long population; //static means common to all the objects of the class
    static int a=4,b;

    //will only run once when the first obj is created
    static{
        System.out.println("I am inside static block");
        b = a*5;

    }

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
        this.population+=1;
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



