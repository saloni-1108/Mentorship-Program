import java.util.*;
public class MissingNumber{
    public static void missingNumber(int numbers[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n-1;j++)
            {
                if(numbers[j]==i)
                {
                    flag=1;
                    break;
                }
            }
             if(flag==0)
            {
                System.out.println(i);
            }
            
        }
        
    }
    
    
    public static void main(String args[])
    {
        int numbers[]={1,2,4,5};
        int n=5;
        missingNumber(numbers,n);
        
        
    }
}