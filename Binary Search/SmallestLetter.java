
public class SmallestLetter {
    public static void main(String[] args){
        char[] letters = {'c','f','z'};
        System.out.println(findSmallestLetter(letters,'c'));
    }

    public static char findSmallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return letters[start%letters.length];
    }
}
