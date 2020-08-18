/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class Group {
    
    int group;
    
    public Group(){};
    
    public Group(int group){
    this.group = group;
    };
    
    public void setGroup(int g){
    this.group = g;
    }
    
    public int getGroup(){
    return this.group;
    }
}
