/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author Puspaningtyas
 */
public class DaftarPasien extends JDialog{
     private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;

    public DaftarPasien() {
        init();
    }

    public DaftarPasien(String title) {
        this.setTitle(title);
        init();
    }
    
    public void init() {
        this.setLayout(null);
        
        judulLabel = new JLabel("DAFTAR PASIEN BARU");
        judulLabel.setBounds(70, 20, 150, 10);
        this.add(judulLabel);
        
        namaLabel = new JLabel("No Rekam Medis");
        namaLabel.setBounds(15, 50, 100, 25);
        this.add(namaLabel);
        
        namaText = new JTextField(100);
        namaText.setBounds(120, 50, 150, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 100, 85, 10);
        this.add(namaLabel);
        
        namaText = new JTextField(100);
        namaText.setBounds(120, 100, 150, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Alamat");
        namaLabel.setBounds(50, 140, 100, 20);
        this.add(namaLabel);
        
        namaText = new JTextField(100);
        namaText.setBounds(120, 145, 150, 20);
        this.add(namaText);
        
        saveButton = new JButton("SAVE");
        saveButton.setBounds(35, 200, 80, 20);
        this.add(saveButton);
    }

}
