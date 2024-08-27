package Strings;

 class StringLength {
    // In a String Length() is a function.
    // whereas , In Array Length is a property
    public static void main(String[] args) {
        String FullName = "Sejal Chaudhary";
        System.out.print(FullName.length());//15
    }
}
 class StringConcat{

    //Concatination
    public static void main(String[] args) {
        String Name = "Sejal";
        String LastName = "Chaudhary";
        String Fullname = Name +" "+ LastName;
        System.out.println(Fullname);
    }
}

 class StringCharAt{
//  we can also make a function of printing letter with the help of CharAt()

public  static void printLetters(String str){
    // CharAt() 
    for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i) + " ");
        
    }
} 
    public static void main(String[] args) {
        String Name = "Sejal";
        String LastName = "Chaudhary";
        String Fullname = Name +" "+ LastName;
      
        // System.out.println(Fullname.charAt(4));//l
        printLetters(Fullname);
    }
    
}

