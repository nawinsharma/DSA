public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,9,8,7,6};

        for (int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }

}
