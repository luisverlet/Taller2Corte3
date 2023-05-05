/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller2cort3;

/**
 *
 * @author LabSispc07
 */
public class Directivo extends Empleado {
    private double Salary2;

    public Directivo(String Name, double Salary) {
        super(Name, Salary);
    }
    
    public void Aumento2(){
        Salary2 = Salary*0.40;
        Salary =  Salary2+Salary;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
    
    
    
}
