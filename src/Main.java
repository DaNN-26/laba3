import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("Введите %d число массива:", i + 1);
            array[i] = input.nextInt();
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));
        int low = 0;
        int high = 3;
        quickSort(array, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int [] arr, int low, int high)
    {
        if (arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low)/2;
        int opora = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}