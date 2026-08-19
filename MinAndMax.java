public class MinAndMax {
    public static void main(String[] args) {
        int arr[] = {9,3,5,7,5,1,6,8,2,4};
        System.out.println("Maximum number in array : " + max(arr));
        System.out.println("Minimum number in array : " + min(arr));
    }

    static int min(int arr[]){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
