
import java.util.*;
import java.io.*;
import java.math.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger mul=new BigInteger("1");
        for(int i=1;i<=n;i++){
            mul=mul.multiply(BigInteger.valueOf(i));
        }
        System.out.println(mul);
    }
}
