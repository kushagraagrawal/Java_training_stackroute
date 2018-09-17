import java.util.Scanner;

class DimensionsNotEqualException extends Exception{
    public DimensionsNotEqualException(String errormessage){
        super(errormessage);
    }
}

public class MatrixSum {
    public void getMatrixSum(int[][] a, int[][] b) throws DimensionsNotEqualException{
        int rowA = a.length;
        int rowB = b.length;
        if(rowA!=rowB)
            throw new DimensionsNotEqualException("A and B do not have same numbers of rows");
        else{
            for(int i=0;i<a.length;i++){
                if(a[i].length != b[i].length)
                    throw new DimensionsNotEqualException("Columns don't match");
                for(int j=0;j<a[i].length;j++){
                    a[i][j] = a[i][j] + b[i][j];
                }
            }

            for (int i=0;i<a.length;i++)
                for (int j=0;j<a[i].length;j++)
                    System.out.println(a[i][j]);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rowsA = input.nextInt();
        int colsA = input.nextInt();
        int[][] a = new int[rowsA][colsA];
        for(int i=0;i<rowsA;i++)
            for (int j=0;j<colsA;j++)
                a[i][j] = input.nextInt();

        int rowsB = input.nextInt();
        int colsB = input.nextInt();
        int[][] b = new int[rowsB][colsB];
        for(int i=0;i<rowsB;i++)
            for (int j=0;j<colsB;j++)
                b[i][j] = input.nextInt();

        try {
            MatrixSum x = new MatrixSum();
            x.getMatrixSum(a, b);
        }catch (DimensionsNotEqualException e){
            System.out.println(e);
        }
    }
}
