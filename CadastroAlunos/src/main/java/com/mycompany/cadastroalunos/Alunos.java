/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroalunos;

/**
 *
 * @author aluno
 */
public class Alunos {
    
    private int idade;
    private boolean matriculado;
    private char sexo;
    private String nome;
    private int ra; 

    public Alunos(String aNome,int aRa) {
        nome = aNome;
        ra = aRa;
    }

    public String getNome() {
        return "Nome:" + nome;
    }

    public String getRa() {
        return "RA:" + ra;
    }   

    public void setMatriculado(boolean aMatriculado) {
        matriculado = aMatriculado;
    }

    public void setSexo(char aSexo) {
        sexo = aSexo;
    }

    public void setIdade(int aIdade) {
        idade = aIdade;
    }
    
    
}
