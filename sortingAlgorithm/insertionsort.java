public class insertionsort {
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i = 0; i<n; i++){
            //i=0
            int key = arr[i];
            int j = i-1;
            //move elements of array {0,1,.....} that are greater than key
            // to the position ahead of their current position.
            // j=2
            while(j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j =j-1;

            } 
             arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={ 1, 5, 7, 3,2,4};
        System.out.print("Array before insertion sort");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.print("Array after insertion sort");
        for(int i : arr){
            System.out.print(i + " ");
        }

        
    }
    
}
