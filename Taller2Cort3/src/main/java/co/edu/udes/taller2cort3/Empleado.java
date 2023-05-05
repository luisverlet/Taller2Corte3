/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller2cort3;

/**
 *
 * @author LabSispc07
 */
public class Empleado {
    public String Name;
    public double Salary;
    private double Salary2;

    public Empleado(String Name, double Salary) {
        this.Name = Name;
        this.Salary = Salary;
        
    }

    public Empleado() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void Aumento(){
        
        Salary2 = Salary*0.20;
        Salary =  Salary2+Salary;
}

    @Override
    public String toString() {
        return "Salario: " + Salary + " /// " + Name + " -> Empleado";
    }
    
    
}
