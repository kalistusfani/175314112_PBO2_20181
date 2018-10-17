/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {

    private String nama;
    private int tanggalLahir;
    private String alamat;
    private String tempatLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String noRekamMedis;
    private String nik;
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    /**
     * *
     * membuat konstruktor kosong di kelas Pasien
     */
    public Pasien() {

    }

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;

    }

    /**
     * *
     * membuat konstruktor dengan parameter nama dengan tipe String
     *
     * @param nama
     */
    public Pasien(String nama) {
        this.nama = nama;
    }

    /**
     * *
     * membuat method getNama bertipe String dan mengembalikan nilai menggunakan
     *
     * @return nama
     */
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * *
     * membuat methodgetAlamat bertipe String dan mengembalikan nilai
     * menggunakan
     *
     * @return alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * *
     * membuat method setAlamat bertipe void dan menyamakan nilai variabel
     * global alamat dengan variabel lokal alamat
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * *
     * membuat method getTempatLahir bertipe String dan mengembalikan nilai
     * menggunakan
     *
     * @return tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * *
     * membuat method setTempatLahir bertipe voiddan menyamakan nilai variabel
     * global tempatLahir dengan variabel lokal tempatLahir
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * *
     * membuat method getRekamMedis bertipe String dan mengembalikan nilai
     * menggunakan
     *
     * @return RekamMedis
     */
    public String getRekamMedis() {
        return noRekamMedis;
    }

    /**
     * *
     * method ini digunakan untuk mengatur panjang nomor rekam medis dengan
     * menggunakan fungsi exception
     *
     * @param RekamMedis
     * @throws Exception
     */
    public void setNoRekamMedis(String RekamMedis) throws Exception {
        //panjang rekam medis yang harus dimasukan lebih dari 6
        if (this.noRekamMedis.length() > 6) {
            this.noRekamMedis = RekamMedis;
            //jika panjang rekam medis yang dimasukan kurang dari dari 6
        } else {
            throw new Exception("Nomor Yang Anda Masukan Salah");
        }
    }

    /**
     * *
     * mengembalikan nilai getTanggalLahir yang bertipe integer menggunakan
     *
     * @return tanggalLahir
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * *
     * method ini digunkan untuk mengatur tanggal lahir dari pasien
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        //tanggal lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if (tanggalLahir > 0) {
            //tanggal lahir yang dimasukan tidak boleh lebih dari 31
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
                //jika tanggal lahir yang dimasukan lebih dari 31
            } else {
                throw new Exception("Tanggal yang Anda masukan melebihi batas yang ditentukan");
            }
            //jika tanggal lahir yang dimasukan kurang dari 1
        } else {
            throw new Exception("Tanggal yang Anda masukan kurang dari batas yang ditentukan ");

        }
    }

    /**
     * *
     * mengembalikan nilai getbulanLahir yang bertipe integer menggunakan
     *
     * @return bulanLahir
     */
    public int getbulanLahir() {
        return bulanLahir;
    }

    /**
     * *
     * method ini digunakan untuk mengatur bulan lahir dari pasien
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setbulanLahir(int bulanLahir) throws Exception {
        //bulan lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if (bulanLahir > 0) {
            //bulan lahir yang dimasukan tidak boleh lebih dari 12
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
                //jika bulan lahir yang dimasukan lebih dari 12
            } else {
                throw new Exception("Bulan yang Anda masukan melebihi batas yang ditentukan");

            }//jika bulan lahir yang dimasukan kurang dari 1
        } else {
            throw new Exception("Bulan yang Anda masukan kurang dari batas yang ditentukan ");
        }
    }

    /**
     * *
     * mengembalikan nilai gettahunLahir yang bertipe integer menggunakan
     *
     * @return tahunLahir
     */
    public int gettahunLahir() {
        return tahunLahir;
    }

    /**
     * *
     * method ini digunakan untuk mengatur tahun lahir pasien
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void settahunLahir(int tahunLahir) throws Exception {
        //tahun lahir yang dimasukan tidak boleh kurang dari 1 atau harus lebih dari 0
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
            //jika tahun lahir yang dimasukan kurang dari 1
        } else {
            throw new Exception("Tahun yang diinputkan salah");
        }
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        nik = Mendaftar();
    }

    public static ArrayList<Pasien> getDaftarPasienKlinik() {
        return daftarPasienKlinik;
    }

    public static void setDaftarpasienKlinik(ArrayList<Pasien> daftarPasienKlinik) {
        Pasien.daftarPasienKlinik = daftarPasienKlinik;
    }

    /**
     * *
     * method ini digunakan untuk mengatur foramat rekam medis pasien dengan
     * menggunakan tanggal mendaftar dan 3 huruf pertama dari nama pasien
     *
     * @return
     */
    public String Mendaftar() {
        //deklarasi objek baru bernama date dengan tipe Date
        Date date = new Date();
        //deklarasi variabel RekamMedis dengan format yyyyMMdd (tahun-bulan-tanggal)
        noRekamMedis = "yyyyMMdd";
        //deklarasi objek baru bernama ft dengan tipe SimpleDateFormat
        SimpleDateFormat ft
                = new SimpleDateFormat(noRekamMedis);

        //deklarasi nilai sub_nama dengan 3 huruf pertama dari variabel nama menggunakan subString
        String sub_nama = nama.substring(0, 3);
        //mengembalikan nilai RekamMedis
        return noRekamMedis = ft.format(date).concat(sub_nama);
    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String NoRM) {
        Pasien result = null;
        boolean found = false;
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).getNik().equals(NoRM)) {
                found = true;
                result = daftarPasienKlinik.get(i);
            }
        }
        return result;
    }

    public static void simpanDaftarPasien(File file) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Nama : " + nama + ", Alamat : " + alamat;
    }
}
