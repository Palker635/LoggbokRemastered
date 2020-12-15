import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;



    public static void main(String[] args) {
        Controller c = new Controller();

    }
    public Controller() {
        view = new View();
            JFrame frame = new JFrame("View");
            frame.setContentPane(view.getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        view.geButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        }
    }