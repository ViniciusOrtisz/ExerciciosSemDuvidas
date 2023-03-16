/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidomesabar;

/**
 *
 * @author aluno
 */
public class Pedidos {
    
    String nome;
    String categoria;
    boolean alcool;
    double valor;
    int qnt;

    public void setAlcool(boolean aAlcool) {
        alcool = aAlcool;
    }

    public void setCategoria(String aCategoria) {
        categoria = aCategoria;
    }

    public void setNome(String aNome) {
        nome = aNome;
    }

    public void setQnt(int aQnt) {
        qnt = aQnt;
    }

    public void setValor(double aValor) {
        valor = aValor;
    }


    
}
