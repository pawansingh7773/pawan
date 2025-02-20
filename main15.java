//SELECTION SORTING ALGORITHM;
public class main15 {
    static void selectionsort(int []arr){
        int n = arr.length;
        
        
        for(int i=0;i<n;i++){
              int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index =j;
                

                }
                
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

            
        
    }
    public static void main(String[] args) {
        System.out.println("SORTING ALGORITHM OF SELECTION SORT");
        int [] arr = {4,3,5,6,1,2};
        selectionsort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
