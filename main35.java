//right spiral array++;+
import java.util.*;
public class main35 {
    static void printarray(int [][] arr){
        for(int [] row : arr){
            for(int val : row){
                System.out.println( val +"");
            }
            System.out.println();
        }
    }
    static ArrayList<Integer> spiral(int [][] arr ){
 int r = arr.length;
      int   c = arr[0].length;
        int top =0, left =0, right = c-1 , bottom =r-1;
        int total =0;
        ArrayList<Integer> l1 = new ArrayList<>();
        while(total < r*c){
            for(int j = left;j<=right && total <r*c ; j++){
                l1.add(arr[top][j]);
                total++;

            }
            top++;
            for(int i =top ; i<=bottom && total<r*c ; i++){
                l1.add(arr[i][right]);
                total++;

            }
            right--;
            for(int j =right;j>=left && total<r*c ; j--){
                l1.add(arr[bottom][j]);
                total++;
            }
            bottom--;
            for(int i =bottom;i>= top && total<r*c ; i--){
                l1.add(arr[i][left]);
                total++;
            }
            left++;
        }
        return l1;

    }
    public static void main(String[] args) {
        System.out.println("SPIRAL MATRIX THIS TIME FOR SURE :");
        int [][] arr = { { 1,2,3},{4,5,6} , {7,8,9}};
        printarray(arr);
        ArrayList<Integer> l1 = spiral(arr);
        System.out.println(l1 +" ");
    }
    
}
