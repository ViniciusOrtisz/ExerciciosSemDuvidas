/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Vinicius
 */
public class Bicicletas {
    public String cor;
    public String modelo;
    public int tamanho;
    private double valor;
    private double custo;
    private String fornecedor;
    private int estoque;
    
    
    public void aValor(double aValor){
    valor = aValor;
}
public void aEstoque(int aEstoque){
    estoque = aEstoque;
}

public void construtorBicicleta(int aTamanho, String aFornecedor, String aCor, String aModelo, double aCusto){
    cor = aCor;
    modelo = aModelo;
    tamanho = aTamanho;
    custo = aCusto;
    fornecedor = aFornecedor;
    
}
 public void mostrarDados() {
        System.out.println("cor: " + cor);
        System.out.println("modelo: " + modelo);
        System.out.println("tamanho: " + tamanho);
        System.out.println("valor: " + valor);
        System.out.println("custo: " + custo);
        System.out.println("fornecedor: " + fornecedor);
        System.out.println("estoque: " + estoque);
    }
}
