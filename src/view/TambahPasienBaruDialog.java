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
 * @author Kalistus Fani
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel labelJudul;
    private JLabel labelNama;
    private JLabel labelAlamat;
    private JLabel labelTanggalLahir;
    private JTextField textFieldNama;
    private JTextField AlamatText;
    private JComboBox boxTanggal;
    private JComboBox boxBulan;
    private JComboBox boxTahun;
    private JButton tambahButton;

    /**
     * membuat constuctor kosong dengan nama TambahPasienBaruDialog()
     *
     */
    public TambahPasienBaruDialog() {
        // mengisi title dengan "Pasien Baru"

        this.setTitle("Pasien Baru");
        //menjalankan method init()

        init();
    }

    public void init() {
        this.setLayout(null);

        //membuat labelJudul dari JLabel diberi nama "Pasien Baru" 
        labelJudul = new JLabel("Pasien Baru");
        //mengatur ukuran labelJudul dengan ukuran 190,10,100,40
        labelJudul.setBounds(190, 10, 100, 40);
        //membuat labelNama dari JLabel diberi nama "Nama" 
        labelNama = new JLabel("Nama");
        //mengatur ukuran labelNama dengan ukuran 20,50,80,25
        labelNama.setBounds(20, 50, 80, 25);
        //membuat labelAlamat dari JLabel diberi nama "Alamat"
        labelAlamat = new JLabel("Alamat");
        //mengatur ukuran labelAlamat dengan ukuran 20,90,80,25
        labelAlamat.setBounds(20, 90, 80, 25);
        //membuat labelTanggalLahir dari JLabel diberi nama "Tanggal Lahir"
        labelTanggalLahir = new JLabel("Tanggal Lahir");
        //mengatur ukuran labelTanggalLahir dengan ukuran 20,130,110,25
        labelTanggalLahir.setBounds(20, 130, 110, 25);


        //membuat textFieldNama dari JTextField
        textFieldNama = new JTextField();
        //mengatur ukuran textFieldNama dengan ukuran 120,50,170,25
        textFieldNama.setBounds(120, 50, 170, 25);
        //membuat textFieldAlamat dari JTextField
        AlamatText = new JTextField();
        //mengatur ukuran textFieldAlamat dengan ukuran 120,90,170,25
        AlamatText.setBounds(120, 90, 170, 25);

        boxTanggal = new JComboBox();
        boxTanggal.setBounds(120, 130, 60, 20);
        boxBulan = new JComboBox();
        boxBulan.setBounds(190, 130, 100, 20);
        boxTahun = new JComboBox();
        boxTahun.setBounds(310, 130, 70, 20);

        //membuat buttonSave dari JButton diberi nama "Save"
        tambahButton = new JButton("Save");
        //mengatur ukuran buttonSave dengan ukuran 190,200,80,25
        tambahButton.setBounds(190, 200, 80, 25);
        tambahButton.addActionListener(this);

        this.add(labelJudul);
        this.add(labelNama);
        this.add(labelAlamat);
        this.add(labelTanggalLahir);

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

        this.add(textFieldNama);
        this.add(AlamatText);
        this.add(tambahButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AntrianPasien ant = new AntrianPasien();
        if (e.getSource() == tambahButton) {
            try {
                Pasien baru = new Pasien();
                baru.setNama(AlamatText.getText());
                baru.setNoRM(textFieldNama.getText());
                ant.Mendaftar(baru);
                String txt = baru.getNoRM() + " " + baru.getNama() + " " + baru.getAlamat();
                System.out.println(baru.getNoRM());
                JOptionPane.showMessageDialog(null, "Sudah Berhasil mendaftarkan pasien\n" + txt);
            } catch (Exception ex) {
                Logger.getLogger(TambahPasienBaruDialog.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
