import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {

    private JButton Add;
    private JTextField textField2;
    private JTextArea textArea1;
    private JPanel Panel;

    public View() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("View");
        frame.setContentPane(new View().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getPanel() {
        return Panel;
    }

    public JButton geButton() {
        return Add;
    }


}