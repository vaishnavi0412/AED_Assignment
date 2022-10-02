/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class EmployeeH {
    private ArrayList<Employees> history;
    
    public EmployeeH() {
        
        this.history= new ArrayList<Employees>();
    }

    public ArrayList<Employees> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employees> history) {
        this.history = history;
    }
            
    public Employees addNewEmployee(){
        Employees newEmployee= new Employees();
        history.add(newEmployee);
        return newEmployee;
    }
    public void deleteEmployees(Employees ee){
        history.remove(ee);
    }
}
