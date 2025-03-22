

public class gavicode {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 2;
        k = k%n;
        int j =0;
        int [] arr2 = new int[n];
        for(int i = k ; i<n ; i++){
            arr2[j++] = arr[i];

        }
        for(int i =0 ; i<k ; i++){
            arr2[j++] = arr[i];
        }
        for(int i =0; i<n ; i++){
            System.out.print(arr2[i] +" ");
        }
        System.out.println(); 


    }
    
}
