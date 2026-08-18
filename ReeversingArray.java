public class ReeversingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int num : arr){
            System.out.print(num + " ");
        }
        revArr(arr);
        System.out.println();
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void revArr(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end ){
            swap(arr, start, end);
            start ++;
            end--;
        }
    }

    static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
