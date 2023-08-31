package OOP;



class CustomArray {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArray(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
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
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public int get(int index){
        if(index<0 || index>size){
            return -1;
        }
        return data[index];
    }


}

public class CustomArrayList{
    public static void main(String[] args) {
        CustomArray list = new CustomArray();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        System.out.println(list.remove());
        System.out.println(list.get(0));
        list.display();  
       
        
    }
}
