/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslabjtable;


public class customerclass {
    private int id;
    private String name;
    private String emial;
    private String phone;
    public customerclass(int ID,String Name,String Email,String Phone){
    this.id=ID;
    this.name=Name;
    this.emial=Email;
    this.phone=Phone;
    
    }
    public int getid(){
    return id;
    }
    public String getname(){
    return name;
    }
    public String getnemail(){
    return emial;
    }
    
    public String getphone(){
    return phone;
    }
    
}
