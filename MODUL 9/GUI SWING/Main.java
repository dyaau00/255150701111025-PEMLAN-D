package GUI_LANJUT;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        // Menjalankan GUI
        SwingUtilities.invokeLater(() -> new RegistrasiForm().setVisible(true));
    }
}