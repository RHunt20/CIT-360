/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author ryahh
 */
import java.io.Serializable;

public class Employee implements Serializable {
    
    private String firstName;   // Employee first name
    private String lastName;    // Employee last name
    
    // No parameter constructor //
    public Employee() {
        
    }
    
    // Getter and Setters //
    public String getFirstName() {
        return firstName;
  
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
  
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
}
