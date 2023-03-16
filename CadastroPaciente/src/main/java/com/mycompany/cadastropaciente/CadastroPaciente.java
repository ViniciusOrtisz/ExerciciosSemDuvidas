/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastropaciente;

/**
 *
 * @author aluno
 */
public class CadastroPaciente {

    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente("Vinicius", "12343242432",27,77,true);
        Paciente paciente2 = new Paciente("Maria", "213423142142314",32,11,true);
        Paciente paciente3 = new Paciente("Willyan", "21342314243",34,34,true);
        Paciente paciente4 = new Paciente("Lucas", "2343214214",11,24,false);
        Paciente paciente5 = new Paciente("Matheus", "123421412",14,66,false);
        Paciente paciente6 = new Paciente("Ricardo", "1231233212",22,55,false);

        
        System.out.println(paciente1.getPaciente());
        System.out.println(paciente2.getPaciente());
        System.out.println(paciente3.getPaciente());
        System.out.println(paciente4.getPaciente());
        System.out.println(paciente5.getPaciente());
        
        Sintomas sintoma1 = new Sintomas("dor cabeca", true,15,95.3,'a');
        Sintomas sintoma2 = new Sintomas("colera", false,11,23.7,'a');
        Sintomas sintoma3 = new Sintomas("ucera", true,12,23.1,'o');
        Sintomas sintoma4 = new Sintomas("nausea", true,63,21.2,'a');
        Sintomas sintoma5 = new Sintomas("carea", false,22,55.3,'e');
        Sintomas sintoma6 = new Sintomas("lea", true,25,22.3,'o');
        
        
        System.out.println(sintoma1.getInfoCadastro());
        System.out.println(sintoma2.getInfoCadastro());
        System.out.println(sintoma3.getInfoCadastro());
        System.out.println(sintoma4.getInfoCadastro());
        System.out.println(sintoma5.getInfoCadastro());
        System.out.println(sintoma6.getInfoCadastro());
               
    }
}
