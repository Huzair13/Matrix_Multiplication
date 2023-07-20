import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int sizeRow=scanner.nextInt();

        System.out.println("Enter the number of columns in the array");
        int sizeColumn=scanner.nextInt();

        int array[][]=new int[sizeRow][sizeColumn];

        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }

        System.out.println("Enter the element to multiply with the matrix");
        int number=scanner.nextInt();

        int product[][]=matrixProduct(array,sizeRow,sizeColumn,number);

        for(int iterator=0;iterator<sizeRow;iterator++){
            System.out.println(Arrays.toString(product[iterator]));
        }
    }

    private static int[][] matrixProduct(int[][] array, int sizeRow, int sizeColumn, int number) {
        for(int i=0;i<sizeRow;i++){
            for(int j=0;j<sizeColumn;j++){
                array[i][j]=array[i][j]*number;
            }
        }
        return array;
    }
}