import java.util.*;
public class SecondLargest{
    public static void secondLargest(int numbers[])
    {   
        int n = numbers.length;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]>numbers[j])
                {
                   int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;

                }
            }
            
        }
        System.out.println("second largest element in the array is:"+numbers[n-2]);

        

    }
    public static void main(String args[])
    {
        int numbers[]={6,1,5,4,8};
        secondLargest(numbers);
    }
}