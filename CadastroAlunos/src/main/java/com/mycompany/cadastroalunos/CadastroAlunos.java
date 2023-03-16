/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastroalunos;

/**
 *
 * @author aluno
 */
public class CadastroAlunos {

    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Vinicius",2231231);
        aluno1.setIdade(18);
        aluno1.setMatriculado(true);
        aluno1.setSexo('M');
        
        Alunos aluno2 = new Alunos("Pedro",1234512);
        aluno1.setIdade(18);
        aluno1.setMatriculado(true);
        aluno1.setSexo('M');
        
        Alunos aluno3 = new Alunos("Fernanda",1241222);
        aluno1.setIdade(19);
        aluno1.setMatriculado(true);
        aluno1.setSexo('F');
        
        Turma turma1 = new Turma(aluno1);
        Turma turma2 = new Turma(aluno2);
               
    }
}
