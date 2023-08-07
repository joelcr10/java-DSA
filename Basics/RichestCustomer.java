public class RichestCustomer {
    public static void main(String[] args){
        int[][] accounts = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for(int[] person: accounts){
            int sum = 0;
            for(int account: person){
                sum+=account;
            }   

            if(ans<sum)
                ans = sum;
        }

        return ans;
    }
}
