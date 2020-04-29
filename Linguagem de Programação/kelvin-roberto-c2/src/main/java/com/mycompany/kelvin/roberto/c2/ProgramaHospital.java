
package com.mycompany.kelvin.roberto.c2;

/**
 *
 * @author kelvi_000
 */
public class ProgramaHospital {
    
    public static void main(String[] args) {
            
        Paciente p1 = new Paciente("Rafael PP", 34, "Amil");
        Paciente p2 = new Paciente("Pedrão GG", 24, "Amil");
        Paciente p3 = new Paciente("Tonhão", 35, "Amil");
        Paciente p4 = new Paciente("Jacinto", 66, "Amil");
        Paciente p5 = new Paciente("Otavio", 12, "Amil");
        
        Hospital h1 = new Hospital("Toma", 3);
        
        h1.internarPaciente(p1);
        h1.internarPaciente(p2);
        h1.internarPaciente(p3);
        h1.internarPaciente(p4);
        h1.internarPaciente(p5);
        h1.exibeDadosPacientes();
       
       
    }
    
}
