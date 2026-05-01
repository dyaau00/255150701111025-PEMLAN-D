package GUI_LANJUT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RegistrasiForm extends JFrame {
    // Komponen Input
    JTextField txtNama, txtTglLahir, txtNoPendaftaran, txtNoTelp, txtEmail;
    JTextArea txtAlamat;
    JButton btnSubmit;

    public RegistrasiForm() {
        setTitle("Form Daftar Ulang Mahasiswa Baru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 550);
        setLocationRelativeTo(null); // Biar jendela muncul di tengah layar
        setLayout(new BorderLayout(10, 10));

        // Panel Judul
        JPanel pTitle = new JPanel();
        pTitle.add(new JLabel("FORM PENDAFTARAN ONLINE"));
        add(pTitle, BorderLayout.NORTH);

        // Panel Input (GridLayout 6 baris, 2 kolom)
        JPanel pInput = new JPanel(new GridLayout(6, 2, 10, 15));
        pInput.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        pInput.add(new JLabel("Nama Lengkap")); txtNama = new JTextField(); pInput.add(txtNama);
        pInput.add(new JLabel("Tanggal Lahir")); txtTglLahir = new JTextField(); pInput.add(txtTglLahir);
        pInput.add(new JLabel("Nomor Pendaftaran")); txtNoPendaftaran = new JTextField(); pInput.add(txtNoPendaftaran);
        pInput.add(new JLabel("No. Telp")); txtNoTelp = new JTextField(); pInput.add(txtNoTelp);
        pInput.add(new JLabel("Alamat")); 
        txtAlamat = new JTextArea(3, 20);
        pInput.add(new JScrollPane(txtAlamat)); // Pakai scroll agar alamat bisa panjang
        pInput.add(new JLabel("E-mail")); txtEmail = new JTextField(); pInput.add(txtEmail);

        add(pInput, BorderLayout.CENTER);

        // Panel Tombol
        JPanel pButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnSubmit = new JButton("Submit");
        pButton.add(btnSubmit);
        add(pButton, BorderLayout.SOUTH);

        // --- Logika Tombol Submit ---
        btnSubmit.addActionListener(e -> {
            // 1. Cek apakah ada kolom yang kosong
            if (txtNama.getText().isEmpty() || txtTglLahir.getText().isEmpty() || 
                txtNoPendaftaran.getText().isEmpty() || txtNoTelp.getText().isEmpty() || 
                txtAlamat.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "Semua kolom harus terisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                // 2. Jika terisi, munculkan panel konfirmasi[cite: 1, 2]
                int response = JOptionPane.showConfirmDialog(this, 
                    "Apakah anda yakin data yang Anda isi sudah benar?", 
                    "Konfirmasi", JOptionPane.YES_NO_OPTION);
                
                if (response == JOptionPane.YES_OPTION) {
                    // 3. Jika Oke, buka jendela baru
                    new JendelaData(
                        txtNama.getText(), 
                        txtTglLahir.getText(), 
                        txtNoPendaftaran.getText(), 
                        txtNoTelp.getText(), 
                        txtAlamat.getText(), 
                        txtEmail.getText()
                    ).setVisible(true);
                    this.dispose(); // Menutup form input
                }
            }
        });
    }
}