//BUBBLE SORT ALGORITHM NOT INCLUDING BEST CASE;
public class main14 {
    static void bubblesort(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) return;
        }
    }
    public static void main(String[] args) {
        System.out.println("SORTING AN ARRAY USING BUBBLE  SORT ALGO:");
         int [] arr = {4,3,5,6,7,8};
          bubblesort(arr);
          for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
          }
             
         
    }

}
