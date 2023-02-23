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
public class DataRegister {
    private String Username;
    private String Occupation;
    private String Email;
    private String Password;
    
    
    public DataRegister(String Username, String Occupation, String Email, String Password) {
        this.Username = Username;
        this.Occupation = Occupation;
        this.Email = Email;
        this.Password = Password;
    }
    
    public void displayMhs() {
        System.out.println("Username: " + Username);
        System.out.println("Occupation: " + Occupation); 
        System.out.println("Email: " + Email); 
        System.out.println("Password: " + Password); 
        
    }
    
    public String getUsername() {
        return Username;
    }
    public String getOccupation() {
        return Occupation;
    }
    public String getEmail() {
        return Email;
    }
    public String getPassword(){
        return Password;            
    }
}
