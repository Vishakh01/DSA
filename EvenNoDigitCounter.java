public class EvenNoDigitCounter {
    
    public static void main(String[] args) {
        int arr[] = {2,10,111,774,2345};
        System.out.println(findNumbers(arr));
    }
    
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int digits = digit(num);
        return digits%2==0;
    }

    static int digit(int num){
        int count = 0;
        if(num == 0){
            return 1;
        }
        if(num < 0){
            num = num * -1;
        }
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
}
