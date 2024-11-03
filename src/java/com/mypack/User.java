
package com.mypack;

/**
 *
 * @author Ahmad Raza
 */
public class User {
private String Username;
private String Password;
private String Email;

//settler Methods
public void  setUsername(String Username){
    this.Username=Username;
}

public void  setPassword(String Password){
    this.Password=Password;
}

public void  setEmail(String Email){
    this.Email=Email;
}

//gettler Methods
public String  getUsername(){
    return Username;
}

public String getPassword(){
    return Password;
}

public String  getEmail(){
    return Email;
}

}
