package User;

import ListifyUI.Login;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pialogue
 */
public class DataArray  {

    private DataLogin[] userLogin;
    private DataRegister[] userRegist;
    private int nElemen;
    
    public DataArray(int max) {
        userLogin = new DataLogin[max];
        userRegist = new DataRegister[max];
        nElemen = 0;
   
        insert("annisa02", "sa1212");
        insert("alfiah18", "ar1818");
        insert("lila22", "sederhana12");
        insert("nisa", "anis23");
        insert("alifa12", "lifalif");
        insert("annisaa", "nisannis");
    }
    
    public boolean findUsername(String Username) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (userLogin[i].getUsername().equalsIgnoreCase(Username)) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean findPassword(String Password) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (userLogin[i].getPassword().equalsIgnoreCase(Password)) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(String Username, String password) {
        userLogin[nElemen] = new DataLogin(Username, password);
        nElemen++;
    }
    
    public void Regist(String Username, String Occupation, String Email, String Password) {
        userRegist[nElemen] = new DataRegister(Username, Occupation, Email, Password);
        nElemen++;
    }

    
    public void displayArray() {
        for (int i = 0; i < nElemen+1; i++) {
            userLogin[i].displayUser();
        }
    }



    public boolean delete(String searchUsername) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (userLogin[i].getUsername().equalsIgnoreCase(searchUsername)) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                userLogin[j] = userLogin[j + 1];
            }
            nElemen--;
            return true;
        }
    }
}