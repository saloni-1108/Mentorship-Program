import java.util.*;
public class LargestElement{
    public static void findLargest(int numbers[])
    {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>large)
            {
                large=numbers[i];
            }
        }
        System.out.println("largest element in the array is:"+large);

    }
    public static void main(String args[])
    {
        int numbers[]={2,6,10,4,8,5};
        findLargest(numbers);
    }
}