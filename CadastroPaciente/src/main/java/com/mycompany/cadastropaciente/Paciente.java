/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastropaciente;

/**
 *
 * @author aluno
 */
public class Paciente {
    
    public String nomePaciente;
    public String cpfPaciente;
    public int idadePaciente;
    public double pesoPaciente;
    public boolean problemSaude;
    
    public Paciente(String aNome, String aCpf, int aIdade,double aPeso, boolean aProblemSaude){
        nomePaciente = aNome;
        cpfPaciente = aCpf;
        idadePaciente = aIdade;
        pesoPaciente = aPeso;
        problemSaude = aProblemSaude;
    }
    public String getPaciente(){
        return "Nome do paciente: " + nomePaciente + " CPF do paciente: "+ cpfPaciente+ "idade do paciente: " +
                idadePaciente + "peso do paciente: " + pesoPaciente + "Problema de saude? " + problemSaude;
    }
}
