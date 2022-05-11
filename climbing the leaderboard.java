import java.util.*;
import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //long[] arr=new long[n];
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
           int s=sc.nextInt();
           if(al.size()==0||al.get(al.size()-1)!=s)
                al.add(s);
        }
        int m=sc.nextInt();
        int[] brr=new int[m];
        for(int i=0;i<m;i++)
        {
            brr[i]=sc.nextInt();
            long temp=brr[i];
            int a=0;
            int b=al.size();
            while(b>a)
            {
                int mid=(a+b)/2;
                if(al.get(mid)<=temp)
                    b=mid;
                else
                    a=mid+1;
            }
            System.out.println(a+1);
        }
    }
}
