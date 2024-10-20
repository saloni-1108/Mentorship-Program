import java.util.*;
public class Sorted_Rotated{
    public static boolean isSorted_Rotated(int numbers[] )
    {
        int count=0;
        int n=numbers.length;
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i-1]>numbers[i])
            {
                count++;
            }
        }
        if(numbers[n-1]>numbers[0])
        {
            count++;
        }
        return count<=1;


    }


    public static void main(String args[])
    {
        int numbers[]={1,1,1};
        //int k=2;
        boolean result=isSorted_Rotated(numbers);
        if (result) {
            System.out.println("Array is sorted and rotated");
        } else {
            System.out.println("Array is NOT sorted and rotated");
        }
        
    }
}