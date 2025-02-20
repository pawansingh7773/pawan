// BUBBLE , SELECTION , INSERTION SORT;
public class main18 {
    static void printarray(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    //BUBBLE SORT METHOD 
    static void bubblesort(int []arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    } 
    static void selectionsort(int [] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            int minindex = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                minindex = j;}
                
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
            
        
    }
    static void insertionsort(int [] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            int j =i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("SORTING ARRAY THROUGH 3 METHODS OF SORTING:");
        int [] arr = {4,3,2,5,6,1};
        System.out.println("UNSORTED ARRAY;");
        printarray(arr);
        bubblesort(arr);
        System.out.println("SORTING BY BUBBLE SORT:");
        printarray(arr);
        selectionsort(arr);
        System.out.println("SORTING BY SELECTION SORT:");
        printarray(arr);
        insertionsort(arr);
        System.out.println("SORTING BY INSERTION SORT:");
        printarray(arr);

    }
}
