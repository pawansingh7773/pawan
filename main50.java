public class main50 {
    static void merge(int [] arr1 , int [] arr2 , int m , int n){
        print(arr1, arr2);
    }
    static int[] print(int [] arr1 , int [] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int [] ans = new int [m+n];
        int i = 0, j=0, k=0;
        while(i<m && j <n){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];

            }else{
                ans[k++] = arr2[j++];
            }
            

        }
        while(i<m) ans[k++] = arr1[i++];
        while(j<n) ans[k++] = arr2[j++];
        return ans;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {2,5,6};
    merge(arr1, arr2, 3, 3);
        for(int val : ans){
            System.out.println(val);
        }
    }
    
}
