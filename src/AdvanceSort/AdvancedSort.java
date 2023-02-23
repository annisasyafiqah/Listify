/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvanceSort;



/**
 *
 * @author User
 */
public class AdvancedSort {

    private Mahasiswa[] mhs;
    private int nElemen;

    public AdvancedSort(int size) { //container
        mhs = new Mahasiswa[size];
        nElemen = 0;
    }

    public void insert(String tanggal, String tugas) {
        mhs[nElemen] = new Mahasiswa(tanggal, tugas);
        nElemen++;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
        System.out.println("");
    }

    public void shellSort() { //mengurutkan elemen pada array 

        int in, out;
        Mahasiswa temp;
        int h = nElemen / 2; //interval sequence

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;

                while (in > h - 1 && temp.getTanggal().compareTo(mhs[in - h].getTanggal()) < 0) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = temp;
//                display();
            }
            h /= 2;
        }
    }

    public String getTanggal(int i){
        return mhs[i].getTanggal();
    }
    public String getTugas(int i){
        return mhs[i].getTugas();
    }

    public int panjang() {
        return mhs.length;
    }

}
