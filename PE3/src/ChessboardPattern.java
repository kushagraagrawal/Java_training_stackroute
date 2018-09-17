

public class ChessboardPattern {
    public void printPattern(String[][] array){
        String white = "WW|";
        String black = "BB|";
        for(int i=0;i<array.length;i++){
            if(i%2==0)
                array[i][0] = white;
            else
                array[i][0] = black;
            for(int j=1;j<array[i].length;j++){
                if(array[i][j-1] == white)
                    array[i][j] = black;
                else if(array[i][j-1] == black)
                        array[i][j] = white;
            }
        }

        for(int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args){
        String[][] array = new String[8][8];
        ChessboardPattern x = new ChessboardPattern();
        x.printPattern(array);
    }
}
