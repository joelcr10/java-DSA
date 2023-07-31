public class ArrangeCoins {
    public static void main(String[] args){
        System.out.println(arrangeCoins(635723058));
    }
    public static int arrangeCoins(int n) {
        int sum = 0;
        int count = 0;
        while(sum<=n){
            count++;
            sum = sum+count;
            
            System.out.println(sum+" "+count);
        }

        return --count;
    }
}
