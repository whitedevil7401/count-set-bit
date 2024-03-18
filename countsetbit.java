//import java.io.*;
public class countsetbit {
    static int countbitset(int n ){
    int count =0;      //
    while (n>0){
        count += n & 1;
            n >>= 1;
    }
    return count;
}
public static void main (String args []){
    int i =13;
    System.out.println(countbitset(i));
}
}
/*Algorithm
 * 1.initialize the count to 0.
 * 2.while the integer in not equal to zero 0 ,do that 
 * - check the last significant bit of the integer is 1, if its is increment the counter 
 * - right the counter.
 * 3. return the count 0.
 */