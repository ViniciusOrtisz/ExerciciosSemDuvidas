/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroalunos;

/**
 *
 * @author aluno
 */
public class Turma {
    
  public int qntAluno;
  public String curso;
  public String periodo;
  public Alunos Aluno;

  public Turma(Alunos aAluno){
    Aluno = aAluno;
    
    if(Aluno.getNome() != "")
          System.out.println("Aluno não encontrado");
    }
}