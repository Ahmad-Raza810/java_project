/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mypack;

/**
 *
 * @author Ahmad Raza
 */
public interface UserDaO{
    
    boolean isValidate(String username,String password);
    
    boolean addUser(User user);
}
