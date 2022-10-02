/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class Employees {
    private String Name;
    private int EmployeeID;
    private int Age;
    private String Gender;
    private String Start_Date;
    private String Level;
    private String Team_Info ;
    private String Title;
    private long Phone;
    private String Email;

   
    private String photo;
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String Start) {
        this.Start_Date = Start;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam_Info() {
        return Team_Info;
    }

    public void setTeam_Info(String Team) {
        this.Team_Info = Team;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Position) {
        this.Title = Position;
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
   
    @Override
    public String toString(){
      return Start_Date;   
    }
         
       
    
    
}
