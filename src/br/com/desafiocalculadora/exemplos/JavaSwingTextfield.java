package br.com.desafiocalculadora.exemplos;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JavaSwingTextfield {

    private JTextField myTextField;

    public JavaSwingTextfield() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myTextField = new JTextField("Start");
        
        // Add the label to the JFrame
        frame.add(myTextField);
        
        //pack frame to component preferred sizes
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Create UI on EDT
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JavaSwingTextfield();
            }
        });
    }
}