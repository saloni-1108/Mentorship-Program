import java.util.*;
public class RemoveDuplicate{
    public static int removeDuplicate(int numbers[],int n)
    {
       if(n==0 || n==1)
       {
        return n;
       }
       int temp[]=new int[n];
       int j=0;
       for(int i=0;i<n-1;i++)
       {
        if(numbers[i]!=numbers[i+1])
        {
            temp[j++]=numbers[i];
        }
       }
       temp[j++]=numbers[n-1];
       for(int i=0;i<j;i++)
       {
            numbers[i]=temp[i];
       }
       return j;


    }
    
    public static void main(String args[])
    {
       
       int numbers[]={1,1,2,2,3,3};
       int length=numbers.length;

       length=removeDuplicate(numbers,length);
       for(int i=0;i<length;i++)
       {
        System.out.print(numbers[i]+" ");
       }
       
    }
}