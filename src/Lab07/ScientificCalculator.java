package Lab07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculator {
    public JPanel rootView;
    private JButton button1;
    private JButton a2Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a4Button;

    public ScientificCalculator() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Clicked");
            }
        });
    }

    public static void main(String[] args) {

    }
}
