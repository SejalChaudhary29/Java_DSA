package Function;

public class FunctionalOverloading {
    public static int sum(int a , int b){
    return a+b;
    
    }

    public static int sum(int a , int b , int c){
    return a+b+c;

    }
    // multiple function with same name but different parameter/ typeof paramter
    // it only depends on its parameter not on is return type.

    public static void main(String[] args) {
        System.out.println(sum(3,4));//7
        System.out.println(sum(3,4, 8)); //15
    }
}
