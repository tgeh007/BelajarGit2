package com.puturestu.belajargit;
import static com.puturestu.belajargit.Manusia.*;
public class Belajar {
    public static void main(String[] args) {
        int umur;
        String nama;
        String cita;
        String jabatan;

        System.out.println("Belajar Github");

        umur = 17;
        nama = "Beno";
        jabatan = "Coder";

        Manusia bejo = new Manusia(umur,nama,jabatan);
        System.out.println("Nama: "+bejo.getNama()+"\n" +
                            "Umur: "+bejo.getUmur()+"\n" +
                            "Cita-cita: "+bejo.getJabatan());
    }
}