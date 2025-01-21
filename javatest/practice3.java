package javatest;

public class practice3 {
    public static void main(String[] args) {
        int [][] arr = {
                {9,2,3},
                {4,7,6},
        };
        int [][] arr2 = new int[arr.length][arr[0].length];
        int [][] arr3 = new int[arr.length][arr[0].length];
        arrPrint(arr2);
        arr2 = arrCopy(arr, arr2);
        arr3 = arrCopy(arr);
        arrPrint(arr2);
        arrPrint(arr3);

    }
    public static int[][] arrCopy(int [][] arr, int [][] arr2){
        int [][] newarr2 = arr;
        return newarr2;
    }
    public static int [][] arrCopy(int [][] arr){
        return arr;
    }
    public static void arrPrint(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
