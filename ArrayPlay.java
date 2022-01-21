/*
Assignment 2 part  3
Maxime Sotsky 0270251
COMP 1731
2019-03-17
*/
import java.util.*;
public class ArrayPlay
{
    public static void main(String[] args)
    {
        int array1[] = new int[10];
        fillRandom(array1);
        System.out.println("Testing different Array method # 1");
        int array2[] = new int[6];
        fillRandom(array2);
        //========================================================
        int array3[] = {1,2,3,4,5,6,7,8,9};
        printArray(array3);
        System.out.println("");// stacking onto array3 printing
        System.out.println("Testing different Array method # 2");
        String[] array4 = new String[] {"dog","cat","bot","java"};
        printArray(array4);//I wasn't sure if i needed to make one for strings, so here it is.
        //=======================================================
        System.out.println("");//stacking onto array4 printing 
        int array5[] = {100,40,60,9,24,89};
        sort(array5);
        int array6[] = {10000,405,12,2,89,19};
        System.out.println("Testing different Array method # 3");
        sort(array6);

    }

    private ArrayPlay(){
    }

    public static final int MAX = 999;
    //public static final int MIN = 0;

    public static void fillRandom(int[] arr)
    {
        for(int i = arr.length; i != 0; i--)
        {
            Random ran = new Random();
            arr[i-1] = ran.nextInt(MAX);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void printArray(int[]arr) //for integers
    {
        for ( int i = 0; i != arr.length; i++)
        {
            if (i == 0)
            {
                System.out.print("[" + arr[i]+ ", ");
            }
            else if ((i + 1) == arr.length)
            {
                System.out.print(arr[i] +"]");
            }
            else{
                System.out.print(arr[i]+ ", ");
            }
        }
    }
    public static void printArray(String[]arr) //for strings
    {
        for ( int i = 0; i != arr.length; i++)
        {
            if (i == 0)
            {
                System.out.print("[" + arr[i]+ ", ");
            }
            else if ((i + 1) == arr.length)
            {
                System.out.print(arr[i] +"]");
            }
            else{
                System.out.print(arr[i]+ ", ");
            }
            
        }
    }
    public static void sort(int[] arr)
    {
        //int count = 0;
        int len = (arr.length -1);
        int position;
        int newArray[] = new int[arr.length];
        //newArray = arr;
        for (int count = 0; count != len +1 ; count++)
        { 
            //System.out.println("count" +count);
            position = findIndexOfSmallest(arr,count,len);
            //System.out.println("position" +position);
            newArray[count] = arr[position];

            int rem = arr[count];
            arr[count] = arr[position];
            arr[position] = rem;
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static int findIndexOfSmallest(int[] arr, int start, int end)
    {
        int rem = start;
        //int count = 0;
        for(int i = start;i < (end); i++)
        {
            if ((arr[i] > arr[i + 1]) && arr[i + 1] < arr[rem])
            {
                rem = i+1;
            }
            else if ((arr[i] < arr[i+1]) && arr[i] < arr[rem])
            {
                rem = i;
            }
            else{
                continue;
            }

        }
        return rem;
    }
    
}

