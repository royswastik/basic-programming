import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * The class returns exact square-root if the number is a perfect square or else returns the floor value of square-root
 * */
class SquareRootByBinarySearch{
    public static void main(String[] args){
        System.out.println(getSquareRoot(13));
        System.out.println(getSquareRoot(9));
        System.out.println(getSquareRoot(4));
        System.out.println(getSquareRoot(5));
        System.out.println(getSquareRoot(1));
    }
    
    public static int getSquareRoot(int num){
        int x = num;
        int y = 1;
        int sqrt = 1;
        while(true){
            if((sqrt*sqrt) <= num && ((sqrt+1)*(sqrt+1) > num))break;
            if(sqrt*sqrt == num)break;
            else if(sqrt*sqrt < num){
                int x0 = sqrt;
                sqrt = (x+y)/2;
                x = x0;
            }
            else if(sqrt*sqrt > num){
                int y0 = sqrt;
                sqrt = (x+y)/2;
                y = y0;
            }
        }
        return sqrt;
    }
}
