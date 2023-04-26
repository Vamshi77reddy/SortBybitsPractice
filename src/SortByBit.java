import java.util.Arrays;

public class SortByBit{
    public int countBits(int n) {
        int c = 0;
        while(n != 0) {
            if(n % 2 == 1) { 
                c++;
            }
            n /= 2; //we keep decreasing the number
        }
        return c;
    }
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) { //we simply sort the elements
            for(int j = 0; j < arr.length - 1; j++) {
                if(countBits(arr[j]) > countBits(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8};
        SortByBit ans=new SortByBit();
        int[]array=ans.sortByBits(arr);
        System.out.println(Arrays.toString(array));
    }
}
