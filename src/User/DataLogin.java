package User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pialogue
 */
public class DataLogin {
    private String Username;
    private String Password;
    
    public DataLogin(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }
    
    public void displayUser() {
        System.out.println("Username: " + Username);
        System.out.println("Password: " + Password);     
    }
    
    public String getUsername() {
        return Username;
    }
    public String getPassword(){
        return Password;            
    }
}
