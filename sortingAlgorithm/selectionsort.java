public class selectionsort {
    public static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            int min_idx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] <  arr[min_idx]){
                    min_idx = j;
                }
            }
            // swapping
            int temp = arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i] = temp;
        }
    }
     public static void main(String[] args){
            int arr[]={64,34,25,12,22,11,90};
            System.out.print("Array before sort:");
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
            selectionSort(arr);
            System.out.print("Array after sort:");
            for(int i : arr){
                System.out.print(i + " ");
            }

        }
    }

