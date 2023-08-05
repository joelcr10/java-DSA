public class Pattern {
    public static void main(String[] args){
        // pattern1(160);
        // pattern2(162);
        // pattern3(80);
        pattern4(20);
    }

    public static void pattern4(int n){
        n = 2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex = Math.min(Math.min(i,j), Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=0;i<=2*n;i++){
            int totalColsInRow = i > n ? 2*n-i: i;
            int noOfSpaces = n - totalColsInRow;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int j=0;j<totalColsInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=0;i<=2*n;i++){
            int totalColsInRow = i > n ? 2*n-i: i;
            for(int j=1;j<totalColsInRow;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
