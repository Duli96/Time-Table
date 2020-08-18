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
public class Tag {
    
    String tag;
    
    
    public Tag(){};
    
    public Tag(String tag){
    this.tag = tag;
    };
    
     public void setTag(String t){
    this.tag = t;
    }
    
    public String getProgram(){
    return this.tag;
    }
}
