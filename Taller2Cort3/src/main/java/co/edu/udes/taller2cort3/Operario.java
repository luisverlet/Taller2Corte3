
package co.edu.udes.taller2cort3;

/**
 *
 * @author LabSispc07
 */
public class Operario extends Empleado{
    
    private double Salary2;

    public Operario(String Name, double Salary) {
        super(Name, Salary);
    }
    
    public void Aumento2(){
        Salary2 = Salary*0.40;
        Salary =  Salary2+Salary;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
    
    
    
}
