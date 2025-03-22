//spiral array print;
public class main34{
    static void print(int [] arr1){
        for(int element : arr1){
            System.out.println(element);
        }
        System.out.println();
    }
    static void printarray(int[][] arr ){
        for(int[] row : arr){
            for(int element : row){
                System.out.print(element +" ");
            }
            System.out.println();
        }
    }
static int[][] spiral(int [][] arr){
 int toprow = 0 , bottomrow = arr.length-1, leftcolumn = 0 , rightcolumn = arr[0].length-1;
 int r = arr.length, c = arr[0].length;
 int [][] ans = new int [r][c];
 int total = 0;
 while(total<r*c){
    //toprow
    for(int j = leftcolumn;j<=rightcolumn && total<r*c ; j++){
        ans[][j] = arr[toprow][j];
        total++;
    }
    toprow++;
    //rightcolumn
    for(int i = toprow;i<=bottomrow && total<r*c ; i++){
        ans[i] += arr[i][rightcolumn];
        total++;
    }
    rightcolumn--;
    //bottomrow
    for(int j = rightcolumn;j>= leftcolumn && total<r*c ; j--){
        ans[j]+= arr[bottomrow][j];
        total++;
    }
    bottomrow--;
    //leftcolumn
    for(int i= bottomrow; i>= toprow && total<r*c ; i--){
        ans[i] += arr[i][leftcolumn];
        total++;
    }
    leftcolumn++;
}
return ans;
    
}
public static void main(String[] args) {
    System.out.println("CREATING A SPIRAL MATRIX:");
    int [][] arr = { { 1,2,3}, {4,5,6} , {7,8,9}};

    
    printarray(arr);
    int ans [] = spiral(arr);
    print(ans);

}
}