/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.beans;

import com.brinsburyanimal.beans.Accommodation;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Liz
 */

@ManagedBean
@SessionScoped
public class UserData {
    
    private Accommodation accommodation;

    public UserData(){
        
    }
    
    public UserData(Accommodation accommodation) {
        this.accommodation = accommodation;
    }
    
    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }
    
       
}
