/**
 * Created by jc428209 on 21/08/17.
 */
import java.util.Scanner;
import java.util.Arrays;
public class AscendingAndDecending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int int1, int2, int3;
        System.out.println("Please enter integer 1");
        int1 = input.nextInt();
        System.out.println("Please enter integer 2");
        int2 = input.nextInt();
        System.out.println("Please enter integer 3");
        int3 = input.nextInt();




        int list[] = new int[3];

        list[0] = int1;
        list[1] = int2;
        list[2] = int3;
        Arrays.sort(list);
        //System.out.println(Arrays.toString(list));

        for (int i = 0; i < 3; i++) {
            System.out.print(list[i] + " ");
        }
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
}}
