package multiconversor;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var con = new Conversor();
            con.setVisible(true);
        });
    }
}
