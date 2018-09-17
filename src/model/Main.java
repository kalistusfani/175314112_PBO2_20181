/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kalistus Fani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Pasien pasien1 = new Pasien("Ravael");
        Dokter dokter1 = new Dokter("Fani");
        AntrianPasien antri = new AntrianPasien();

        try {
            pasien1.setAlamat("Yogyakarta");
            pasien1.setTempatLahir("Muntilan");
            pasien1.setTanggalLahir(29);
            pasien1.setbulanLahir(12);
            pasien1.settahunLahir(1999);
            pasien1.setRekamMedis(pasien1.Mendaftar());

            dokter1.setNoPegawai("13245");
            dokter1.setAlamat("Yogyakarta");
            dokter1.setTempatLahir("Pontianak");
            dokter1.setTanggalLahir(29);
            dokter1.setbulanLahir(10);
            dokter1.settahunLahir(1999);

            antri.daftar(pasien1);
            antri.panggilPasien(0);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Antrian Pasien : " + antri.panggilPasien(0).getNama());
        System.out.println("");
        System.out.println("___________DATA PASIEN___________");
        System.out.println("Nama                : " + pasien1.getNama());
        System.out.println("Alamat              : " + pasien1.getAlamat());
        System.out.println("Tempat Lahir        : " + pasien1.getTempatLahir());
        System.out.println("Tanggal Lahir       : " + pasien1.getTanggalLahir() + ". " + pasien1.getbulanLahir() + ". " + pasien1.gettahunLahir());
        System.out.println("Nomor Rekam Medis   : " + pasien1.Mendaftar());
        System.out.println("");

        System.out.println("___________DOKTER___________");
        System.out.println("Nama           : " + dokter1.getNama());
        System.out.println("Nomor Pegawai  : " + dokter1.getNoPegawai());
        System.out.println("Alamat         : " + dokter1.getAlamat());
        System.out.println("Tempat Lahir   : " + dokter1.getTempatLahir());
        System.out.println("Tanggal Lahir  : " + dokter1.getTanggalLahir() + ". " + dokter1.getBulanlLahir() + ". " + dokter1.getTahunlLahir());
        System.out.println("");
    }
}
