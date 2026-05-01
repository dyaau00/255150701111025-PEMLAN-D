package GUI_LANJUT;

import javax.swing.*;
import java.awt.*;
public class JendelaData extends JFrame {
    public JendelaData(String nama, String tgl, String noDaftar, String telp, String alamat, String email) {
        setTitle("Data Mahasiswa");
        setSize(400, 450);
        setLocationRelativeTo(null);
        
        // versi macOs biar mirip kayak di laprak
        // 1. Panel Utama sebagai "Background Luar" (Beri warna manis)
        JPanel pMain = new JPanel(new BorderLayout());
        pMain.setBackground(new Color(189, 195, 199)); // Warna abu-abu seperti di contoh
        pMain.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // 2. Simulasi 3 Lingkaran macOS (Merah, Kuning, Hijau)
        JPanel pTop = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pTop.setOpaque(false); // Biar tembus pandang ke warna background utama
        pTop.add(createCircle(Color.RED));
        pTop.add(createCircle(Color.ORANGE));
        pTop.add(createCircle(Color.GREEN));
        
        // Tambah Tulisan Judul di Tengah
        JLabel title = new JLabel("Data Mahasiswa", JLabel.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 14));
        
        JPanel pHeader = new JPanel(new BorderLayout());
        pHeader.setOpaque(false);
        pHeader.add(pTop, BorderLayout.WEST);
        pHeader.add(title, BorderLayout.CENTER);
        pMain.add(pHeader, BorderLayout.NORTH);

        // 3. Kotak Putih di Dalam (Tempat Data)
        JPanel pDataBox = new JPanel(new BorderLayout());
        pDataBox.setBackground(Color.WHITE);
        pDataBox.setBorder(BorderFactory.createLineBorder(new Color(52, 152, 219), 2)); // Garis biru di pinggir kotak

        JTextArea areaData = new JTextArea();
        areaData.setEditable(false);
        areaData.setFont(new Font("Monospaced", Font.PLAIN, 13));
        areaData.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        String data = String.format(
            "Nama             : %s\n" +
            "Tanggal Lahir    : %s\n" +
            "No. Pendaftaran  : %s\n" +
            "No. Telp         : %s\n" +
            "Alamat           : %s\n" +
            "E-mail           : %s", 
            nama, tgl, noDaftar, telp, alamat, email
        );

        areaData.setText(data);
        pDataBox.add(areaData, BorderLayout.CENTER);

        pMain.add(pDataBox, BorderLayout.CENTER);
        add(pMain);
    }

    // Fungsi pembantu untuk membuat lingkaran kecil (simulasi tombol macOS)
    private JLabel createCircle(Color c) {
        JLabel circle = new JLabel("●");
        circle.setForeground(c);
        circle.setFont(new Font("Serif", Font.BOLD, 20));
        return circle;
    }
}
        
        // WINDOWS HEHEEHE
        // setLayout(new BorderLayout(10, 10));

        // JLabel title = new JLabel("Data Mahasiswa", JLabel.CENTER);
        // title.setFont(new Font("SansSerif", Font.BOLD, 16));
        // add(title, BorderLayout.NORTH);

        // // Menggunakan JTextArea untuk menampilkan data agar rapi
        // JTextArea areaData = new JTextArea();
        // areaData.setEditable(false); // Biar tidak bisa diedit di jendela ini
        // areaData.setFont(new Font("Monospaced", Font.PLAIN, 13)); // Pakai Monospaced agar tanda titik dua sejajar
        // areaData.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // String data = String.format(
        //     "Nama             : %s\n" +
        //     "Tanggal Lahir    : %s\n" +
        //     "No. Pendaftaran  : %s\n" +
        //     "No. Telp         : %s\n" +
        //     "Alamat           : %s\n" +
        //     "E-mail           : %s", 
        //     nama, tgl, noDaftar, telp, alamat, email
        // );

        // areaData.setText(data);
        // add(areaData, BorderLayout.CENTER);
    //}
//}