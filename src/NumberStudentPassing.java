import java.util.Scanner;

public class NumberStudentPassing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int [] array;
        System.out.println("Enter a size: ");
        size = input.nextInt();
        while (size > 30){
            System.out.println("Size should not exceed 30");
        }

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter a mark for student: " + (i+1) + "\t");
            array[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Show of mark student: ");
        for (int j = 0 ; j < array.length ; j++){
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10 ){
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is: " + count);
    }
}
