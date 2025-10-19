public class bubblesort {
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        boolean swapped;
        for(int i =0; i< n-1;i++){
           swapped = false;
           for(int j = 0; j <n-i-1;j++){
            if(arr[j] > arr[j+1]){
                // swapping
                int temp =arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = temp;
                swapped =true;
            }
           }
           if(!swapped){
            break;
           }
        }
    }
        public static void main(String[] args){
            int arr[]={64,34,25,12,22,11,90};
            System.out.print("Array before sort:");
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
            bubbleSort(arr);
            System.out.print("Array after sort:");
            for(int i : arr){
                System.out.print(i + " ");
            }

        }
    }
    
