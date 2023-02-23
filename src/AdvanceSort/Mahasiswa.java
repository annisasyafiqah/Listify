package AdvanceSort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pialogue
 */
public class Mahasiswa {

    private String tanggal, tugas;

    public Mahasiswa(String tanggal, String tugas) {
        this.tanggal = tanggal;
        this.tugas = tugas;
    }

    public void displayMhs() {
        System.out.print(" Tugas: " + tugas);
        System.out.print(" Tanggal: " + tanggal);
        System.out.println(" ");
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getTugas() {
        return tugas;
    }
    
}
