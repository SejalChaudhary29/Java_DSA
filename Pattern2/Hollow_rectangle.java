package Pattern2;

public class Hollow_rectangle {
    public static void hollow_rectangle(int row , int cols) {
        //outer loop
        for (int i = 1; i <=row; i++) {
            //inner - column
        for (int j = 1; j <=cols;j++) {
            // cell - (i , j)
            if (i == 1 || i== row || j==1 || j==cols) {
                //boundary cells
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }


    }
    public static void main(String[] args) {
       hollow_rectangle(4,5 );
    }
}
