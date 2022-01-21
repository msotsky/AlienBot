import java.util.Random;
public class ArrayPlayMain
{
    public static void main(String[] args)
    {
        int array1[] = new int[10];
        System.out.println("Testing method 1");
        ArrayPlay.fillRandom(array1);
        System.out.println("Testing different Array method # 1");
        int array2[] = new int[6];
        ArrayPlay.fillRandom(array2);
        //========================================================
        int array3[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Testing method 2");
        ArrayPlay.printArray(array3);
        System.out.println("");// stacking onto array3 printing
        System.out.println("Testing different Array method # 2");
        String[] array4 = new String[] {"dog","cat","bot","java"};
        ArrayPlay.printArray(array4);//I wasn't sure if i needed to make one for strings, so here it is.
        //=======================================================
        System.out.println("");//stacking onto array4 printing 
        int array5[] = {100,40,60,9,24,89};
        System.out.println("Testing method 3");
        ArrayPlay.sort(array5);
        int array6[] = {10000,405,12,2,89,19};
        System.out.println("Testing different Array method # 3");
        ArrayPlay.sort(array6);

        int array7[] = new int[10];
        for (int i = 0;i < array7.length;i++)
        {
            Random random = new Random();
            array7[i]  = random.nextInt(100);
        }
        System.out.println("Test with random values range 100");
        ArrayPlay.sort(array7);

    }
}