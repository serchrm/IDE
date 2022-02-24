import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IDE extends JFrame {
    private JPanel mainPanel;
    private JTextField CelciusTextField;
    private JLabel CelciusLabel;
    private JButton BotonConvertidor;
    private JLabel FarehntheitLabel;

    public IDE (String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        BotonConvertidor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(CelciusTextField.getText()))*1.8+32);
                FarehntheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new IDE("Mi IDE");
        frame.setVisible(true);
        //frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setMaximumSize(new Dimension(500,200));
        frame.setResizable(false);
    }
}
