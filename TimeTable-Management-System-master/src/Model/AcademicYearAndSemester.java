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
public class AcademicYearAndSemester {
    
    public int year;
    public int semester;
    public String name;
    public String ID;
    public AcademicYearAndSemester(){};
    
    
    public AcademicYearAndSemester(int year,int sem,String name){
    
       this.year = year;
       this.semester = sem;
       this.name = name;
    };

    public AcademicYearAndSemester(String id, int y, int s, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setYear(int year){
    this.year = year;
    };
    
    public void setSem(int sem){
        this.semester = sem;
    };
    
    public void setName(String name){
    this.name = name;
    };
    
    public void setID(String id){
    this.ID= id;
    };
    
    
     public  int getYear(){
       return this.year;
     
     };
    
    public int getSem(){
    return this.semester;
    };
    
    public String getName(){
       return this.name;
    };
    
    public String getID(){
       return this.ID;
    };
}
