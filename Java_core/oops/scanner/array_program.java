import java.util.*;
public class array_program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int[] arra1 = new int[5];

        for(int i=0; i<5; i++){
            arra1[i] = input.nextInt();
        }

        System.out.println("Array elements are : ");
        for(int i=0; i<5; i++){
            System.out.println(arra1[i]);
        }

    }
}
