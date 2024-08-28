package Strings;

public class ShortestPath{

    // TC = O(n)
    public static float shortestpath(String str){
int x = 0 , y = 0;
for (int i = 0; i <str.length(); i++) {
    char dir = str.charAt(i);
    //south
    if(dir == 'S'){
        y--;
    } 
    //north
    else if( dir=='N'){
        y++;
    } 
    //east
    else if(dir=='E'){
        x++;
    }
    //west
     else{
        x--;
    }
    
}
int X2 = x*x;
int Y2 = y*y;
 return (float)Math.sqrt(X2 + Y2);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println( shortestpath(path));
       
    }
}



