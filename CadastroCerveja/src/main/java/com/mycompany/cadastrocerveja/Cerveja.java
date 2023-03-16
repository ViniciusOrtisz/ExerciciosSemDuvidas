/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocerveja;

/**
 *
 * @author aluno
 */
public class Cerveja {
    
    public int qnt;
    public String nome;
    public String categoria;
    public double valor;
    private int codigo;
    private String origem;

    public Cerveja(int aCodigo, String aOrigem) {
        codigo = aCodigo;
        origem = aOrigem;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getOrigem() {
        return "Origem:" + origem;
    }
    
    public void setCategoria(String aCategoria) {
        categoria = aCategoria;
    }

    public void setQnt(int aQnt) {
        qnt = aQnt;
    }

    public void setValor(double aValor) {
        valor = aValor;
    }
    

    public void setNome(String aNome) {
        nome = aNome;
    }    
    
}
