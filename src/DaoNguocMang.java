import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhập chiều dài của mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Chiều dài mảng phải nhỏ hơn 20");
        } while ( size > 20);
        array = new int [size];
        int i = 0;
        while(i < array.length){
            System.out.println("Nhập vào phần " + (i+1) + " ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
