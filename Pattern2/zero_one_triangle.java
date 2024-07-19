package Pattern2;

public class zero_one_triangle {
    public static void zerOneTri(int n){

             for (int i = 1; i <=n; i++) {
                for (int j = 1; j <= i; j++) {
                    // ( 1,1) (1,2) (1,3) (1,4) (1,5) 
                    // (1,1)=> 2 % 2 = 0 gives 1
                    if((i+j)%2==0){ 
                        System.out.print(1); //if even print 1
                    }else{
                        System.out.print(0); //else 0
                    }
                }
                System.out.println();
             }


    }
    public static void main(String[] args) {
        zerOneTri(5);
    }
}
