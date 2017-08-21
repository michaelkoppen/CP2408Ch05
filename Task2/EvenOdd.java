/**
 * Created by jc428209 on 21/08/17.
 */
import javax.swing.*;
public class EvenOdd {
    public static void main(String[] args) {
        String input;
        int intInput;
        input = JOptionPane.showInputDialog(null,"Enter an integer");
        intInput = Integer.parseInt(input);
        if(intInput % 2 == 0){
            JOptionPane.showMessageDialog(null, "Even");
        }
        else {
            JOptionPane.showMessageDialog(null, "Odd");
        }

    }
}
