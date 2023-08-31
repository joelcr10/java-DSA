package OOP;

interface Car {
    public void start();
    public void engine();
}

interface Model{
    public void model();
}

class A{
    public interface NestedInterface{
        public boolean isOdd(int num);
    }
}

class CarChild implements Car,Model,A.NestedInterface{
    public void start(){
        System.out.println("start");
    }


    public void engine(){
        System.out.println("engine");
    }

    public void model(){
        System.out.println("model");
    }

    public boolean isOdd(int num){
        if(num%2==0){
            return false;
        }else{
            return true;
        }
    }

}


public class InterfaceDemo{
    public static void main(String[] args) {
        CarChild cc = new CarChild();
        cc.model();
    }
}


