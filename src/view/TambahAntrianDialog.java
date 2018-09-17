/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.*;
import java.util.logging.*;
import javax.swing.*;
import model.Pasien;

/**
 *
 * @author jarkom
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel labelJudul;
    private JLabel labelNoRM;
    private JLabel labelNama;
    private JLabel labelAlamat;
    private JLabel labelTanggalLahir;
    private JLabel labelBulanLahir;
    private JLabel labelTahunLahir;
    private JTextField textFieldNoRM;
    private JTextField namaText;
    private JTextArea alamatText;
    private JComboBox boxTanggal;
    private JComboBox boxBulan;
    private JComboBox boxTahun;
    private JButton tambahButton;

    /**
     * membuat constuctor kosong dengan nama TambahAntrianDialog()
     *
     */
    public TambahAntrianDialog() {
        // mengisi title dengan "Tambah Antrian"

        this.setTitle("Tambah Antrian");
        //menjalankan method init()

        init();
    }

    public void init() {
        this.setLayout(null);
        //membuat labelJudul dari JLabel diberi nama "Tambah Antrian" 
        labelJudul = new JLabel("Tambah Antrian");
        //mengatur ukuran labelJudul dengan ukuran 190,10,100,40
        labelJudul.setBounds(190, 10, 100, 40);
        //membuat labelNoRM dari JLabel diberi nama "NoRM" 
        labelNoRM = new JLabel("NoRM");
        //mengatur ukuran labelNoRM dengan ukuran 20,50,80,25
        labelNoRM.setBounds(20, 50, 80, 25);
        //membuat labelNama dari JLabel diberi nama "Nama"
        labelNama = new JLabel("Nama");
        //mengatur ukuran labelNama dengan ukuran 20,90,80,25
        labelNama.setBounds(20, 90, 80, 25);
        //membuat labelAlamat dari JLabel diberi nama "Alamat"
        labelAlamat = new JLabel("Alamat");
        //mengatur ukuran labelAlamat dengan ukuran 20,130,80,25
        labelAlamat.setBounds(20, 130, 80, 25);
        //membuat labelTanggalLahir dari JLabel diberi nama "Tanggal Lahir"
        labelTanggalLahir = new JLabel("Tanggal Lahir");
        //mengatur ukuran labelTanggalLahir dengan ukuran 20,170,110,25
        labelTanggalLahir.setBounds(20, 170, 110, 25);
        //membuat labelBulanLahir dari JLabel diberi nama "Bulan Lahir"
        labelBulanLahir = new JLabel("Bulan Lahir");
        //mengatur ukuran labelBulanLahir dengan ukuran 20,210,110,25
        labelBulanLahir.setBounds(20, 210, 110, 25);
        //membuat labelTanggalLahir dari JLabel diberi nama "Tahun Lahir"
        labelTahunLahir = new JLabel("Tahun Lahir");
        //mengatur ukuran labelTahunLahir dengan ukuran 20,250,110,25
        labelTahunLahir.setBounds(20, 250, 110, 25);

        //membuat textFieldNoRM dari JTextField
        textFieldNoRM = new JTextField();
        //mengatur ukuran textFieldNoRM dengan ukuran 110,50,170,25
        textFieldNoRM.setBounds(120, 50, 170, 25);
        //membuat textFieldNama dari JTextField
        namaText = new JTextField();
        //mengatur ukuran textFieldNama dengan ukuran 110,90,170,25
        namaText.setBounds(120, 90, 170, 25);
        //membuat textFieldNama dari JTextField
        alamatText = new JTextArea();
        //mengatur ukuran textFieldNama dengan ukuran 110,130,170,25
        alamatText.setBounds(120, 130, 170, 25);

        boxTanggal = new JComboBox();
        boxTanggal.setBounds(120, 170, 60, 20);
        boxBulan = new JComboBox();
        boxBulan.setBounds(120, 210, 100, 20);
        boxTahun = new JComboBox();
        boxTahun.setBounds(120, 250, 70, 20);

        //membuat buttonSave dari JButton diberi nama "Save"
        tambahButton = new JButton("Save");
        //mengatur ukuran buttonSave dengan ukuran 190,300,80,25
        tambahButton.setBounds(190, 300, 80, 25);
        tambahButton.addActionListener(this);

        this.add(labelJudul);
        this.add(labelNoRM);
        this.add(labelNama);
        this.add(labelTanggalLahir);
        this.add(labelBulanLahir);
        this.add(labelTahunLahir);
        this.add(labelAlamat);

        this.add(boxTanggal);
        boxTanggal.addItem(1);
        boxTanggal.addItem(2);
        boxTanggal.addItem(3);
        boxTanggal.addItem(4);
        boxTanggal.addItem(5);
        boxTanggal.addItem(6);
        boxTanggal.addItem(7);

        this.add(boxBulan);
        boxBulan.addItem("January");
        boxBulan.addItem("Febuary");
        boxBulan.addItem("March");
        boxBulan.addItem("April");
        boxBulan.addItem("May");
        this.add(boxTahun);
        boxTahun.addItem(1990);
        boxTahun.addItem(1991);
        boxTahun.addItem(1992);
        boxTahun.addItem(1993);
        boxTahun.addItem(1994);
        boxTahun.addItem(1995);
        boxTahun.addItem(1996);

        this.add(textFieldNoRM);
        this.add(namaText);
        this.add(alamatText);
        this.add(tambahButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AntrianPasien ant = new AntrianPasien();
        if (e.getSource() == tambahButton) {
            try {
                Pasien baru = new Pasien();
                baru.setNama(namaText.getText());
                baru.setAlamat(alamatText.getText());
                baru.setNoRM(textFieldNoRM.getText());
                ant.Mendaftar(baru);
                String txt = baru.getNoRM() + " " + baru.getNama() + " " + baru.getAlamat();
                System.out.println(baru.getNoRM());
                JOptionPane.showMessageDialog(null, "Sudah Berhasil mendaftarkan pasien\n" + txt);
            } catch (Exception ex) {
                Logger.getLogger(TambahAntrianDialog.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
