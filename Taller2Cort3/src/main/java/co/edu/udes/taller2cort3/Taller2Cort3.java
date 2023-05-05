
package co.edu.udes.taller2cort3;

/**
 *
 * @author LabSispc07
 */
public class Taller2Cort3 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("| Bienvenido a la Base de datos de empleados |");
        System.out.println("--------------------------------------------");
        
        
        String Name = "Pepito";
        double uwu = 300;
        
        Empleado e = new Empleado(Name, uwu);
        e.Aumento();
        System.out.println(e.toString());
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Operario o = new Operario(Name, uwu);
        o.Aumento2();
        System.out.println(o.toString());
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Directivo d = new Directivo(Name,uwu);
        d.Aumento2();
        System.out.println(d.toString());
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Tecnico t = new Tecnico(Name, uwu);
        t.Aumento3();
        System.out.println(t.toString());
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Supervisor s = new Supervisor(Name, uwu);
        s.Aumento3();
        System.out.println(s.toString());
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Secretario sr = new Secretario(Name, uwu);
        sr.Aumento3();
        System.out.println(sr.toString());
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Gerente g = new Gerente(Name, uwu);
        g.Aumento3();
        System.out.println(g.toString());
        
    }
}
