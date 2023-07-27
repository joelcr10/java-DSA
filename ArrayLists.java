import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String[] args){
        //It dynamically allocated memory to create an array
        //no need to specify the size of the array during declaration
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(67);
        list.add(10);
        list.add(12);

        System.out.println(list.contains(12));

        list.set(0,99);

        list.remove(2);


        System.out.println(list);

        Scanner in = new Scanner(System.in);
        for(int i=0; i<3;i++){
            list.add(in.nextInt());
        }

        for(int i=0; i<3;i++){
            System.out.println(list.get(i));
        }
    }
}
