package multiconversor;

import javax.swing.*;

public class Conversor extends JFrame {

    public Conversor (){
        inicializaConversor();
    }

    private void inicializaConversor() {

        setTitle("Multi Conversor");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
