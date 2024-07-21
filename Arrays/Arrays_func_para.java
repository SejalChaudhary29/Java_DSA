package Arrays;
/* passing arrays as a parameter(paasing by reference) - in functions changes takes place that reflects in main func */
public class Arrays_func_para {
    public static void update(int marks[] ,int nonChange ) {
        nonChange = 5; //passing by value
        for (int i = 0; i < marks.length; i++) { //call by refernece
           marks[i] = marks[i]+1; 
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,99,56};
       int nonChange = 10;
        update(marks , nonChange);
        System.out.println(nonChange);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
