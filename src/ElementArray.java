import java.util.Scanner;

public class ElementArray {
    public static int[] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i< size - 2; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
    public static void printArr(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static int[] insertElement(int value, int index, int[] arr) {
        for (int i = arr.length - 1; i>index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = creatArr();
        printArr(arr);
        System.out.println();
        insertElement(5,2,arr);
        printArr(arr);
    }
}
