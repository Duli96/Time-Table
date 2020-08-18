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
public class SubGroupID {
    int subGroupID;
    
    public SubGroupID(){};
    
    public SubGroupID(int group){
    this.subGroupID = group;
    };
    
    public void setGroup(int g){
    this.subGroupID = g;
    }
    
    public int getGroup(){
    return this.subGroupID;
    }
}
