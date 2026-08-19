public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int arr[] = {9,3,5,7,5,1,6,8,2,4};
        int target = 1;
        System.out.println("target : "+ arr[ls.LS(arr, target)] + "\n" + "index : " + ls.LS(arr, target));
    }
    public int LS(int arr[], int target){
        for(int index = 0; index<arr.length; index++){
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }
}
