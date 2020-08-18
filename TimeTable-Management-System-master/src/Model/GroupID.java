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
public class GroupID {
    int groupID;
    
    public GroupID(){};
    
    public GroupID(int group){
    this.groupID = group;
    };
    
    public void setGroupID(int g){
    this.groupID = g;
    }
    
    public int getGroupID(){
    return this.groupID;
    }
    
}
