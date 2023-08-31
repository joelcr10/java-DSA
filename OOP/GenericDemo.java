package OOP;

import java.util.List;

//generic type class: the data type is passed during object declaration
class CustomGenericArrayList<T>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        // <? extends Number> helps pass all the subclasses of NUmbers also
    }

    public void add(T num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    public boolean isFull(){
        if(size>=data.length){
            return true;
        }else{
            return false;
        }
    }

    public void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}

public class GenericDemo {
    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        list3.add(1);
        list3.display();
        CustomGenericArrayList<String> list4 = new CustomGenericArrayList<>();
        list4.add("123");
        list4.add("heyy");
        list4.display();

    }
}
