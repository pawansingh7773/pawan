public class main46 {
static void printarray(int []arr){
 
 for(int element : arr){
    System.out.println(element);
 }
}
static int max(int [] arr){
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    for (int i = 0 ; i<n ;i++){
        if(arr[i]> max){
            max = arr[i];
        }
    }
    return max;
}
static void countsort(int [] arr ){
    int n = arr.length;
    int max = max(arr);
    int [] output = new int [n];
    int [] count = new int [max+1];
    for (int i = 0 ; i< n ; i++){
        count[arr[i]]++;
    }
    for(int i =1;i<count.length;i++){
        count[i] += count[i-1];
    }
    for(int i= n-1;i>=0;i--){
        int idx = count[arr[i]] -1;
        output[idx] = arr[i];
        count[arr[i]]--;
    }
    for (int i=0;i<n;i++){
        arr[i] = output[i];
    }
}    
public static void main(String[] args) {
    System.out.println(" RETURNING COUNT SORTING METHOD");
    int [] arr = {6,5,4,3};
    countsort(arr);
    printarray(arr);
}
}
