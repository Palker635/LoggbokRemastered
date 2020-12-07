import javax.swing.*;

public class View {

    private JButton Add;
    private JTextField textField2;
    private JTextArea textArea1;
    private JPanel Panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("View");
        frame.setContentPane(new View().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}