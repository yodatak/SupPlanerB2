import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new Login();
        frame.setLocationRelativeTo(null); //ici on centre la fenetre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);// Ici  on affiche la fenetre de login
    }

}
