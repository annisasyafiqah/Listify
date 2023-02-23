/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashtable;

/**
 *
 * @author User
 */
public class Data {
    private String tugas;
    private String dateLine;
    private int key;
    
    public Data(String tugas, String dateLine, int key){
        this.tugas = tugas;
        this.dateLine = dateLine;
        this.key = key;
    }

    Data() {
        }
    public int getKey(){
        return key;
    }

    String getValue() {
        return tugas;
    }
    String getTanggal() {
        return dateLine;
    }
}
