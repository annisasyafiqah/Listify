/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashtable;

import Hashtable.Data;

/**
 *
 * @author User
 */
public class HashTable {

    private Data[] hashArray;
    private int size;
    private int Key;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
    }

    public void displayTable() {
        System.out.println("Table :");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | " + j + "\t | "
                        + hashArray[j].getTanggal() + "\t | "
                        + hashArray[j].getValue()+ " |");
            } else {
                System.out.println(" | " + j + "\t | -- |" + "\t | -- |");
            }
        }
        System.out.println("");
    }

    public int hasFunc1(int key) {
        return key % size;
    }

    public int hasFunc2(int key) {
        return 5 - (key % 5);
    }

    public void insert(String tugas, String dateLine, int key) {
        Data item = new Data(tugas,dateLine, key);
        Key = key;
        int hashVal = hasFunc1(key);
        int hashVal2 = hasFunc2(key);
        
        while (hashArray[hashVal] != null) {
            int hashValue = hashVal + hashVal2;
            hashVal = hashValue % size;
        }
        hashArray[hashVal] = item;
    }

    public Data delete(int key) {
        int hashVal = hasFunc1(key);
        int hashVal2 = hasFunc2(key);
        
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            int hashValue = hashVal + hashVal2;
            hashVal = hashValue % size;
        }
        return null;
    }

    public String getValue(int i){
        return hashArray[i].getValue();
    }
    public String getTanggal(int i){
        return hashArray[i].getTanggal();
    }
    
    public int length(){
        Key=+Key;
        return Key;
    }
}


