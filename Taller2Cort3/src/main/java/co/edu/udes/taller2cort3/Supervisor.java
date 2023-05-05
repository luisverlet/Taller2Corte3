/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller2cort3;

/**
 *
 * @author LabSispc07
 */
public class Supervisor extends Operario {
    private double Salary2;

    public Supervisor(String Name, double Salary) {
        super(Name, Salary);
    }
    
    public void Aumento3(){
        Salary2 = Salary*0.60;
        Salary =  Salary2+Salary;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Supervisor";
    }
    
}
