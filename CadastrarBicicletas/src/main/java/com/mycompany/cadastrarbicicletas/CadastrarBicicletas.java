/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Vinicius
 */
public class CadastrarBicicletas {

    public static void main(String[] args) {
    Bicicletas bicicleta1 = new Bicicletas();
    Bicicletas bicicleta2 = new Bicicletas();
    Bicicletas bicicleta3 = new Bicicletas();
    Bicicletas bicicleta4 = new Bicicletas();
    
    bicicleta1.aEstoque(7);
    bicicleta1.aValor(1000);
    bicicleta1.construtorBicicleta(10,"Branca", "Caloi", "Dobrável", 1214);
    
    bicicleta2.aEstoque(2);
    bicicleta2.aValor(550);
    bicicleta2.construtorBicicleta(15,"Verde", "Bianchi",  "Speed", 351143);
    
    bicicleta3.aEstoque(100);
    bicicleta3.aValor(3000);
    bicicleta3.construtorBicicleta(50,"Azul", "Caloi",  "Elétrica", 215521);
    
    bicicleta4.aEstoque(15);
    bicicleta4.aValor(870);
    bicicleta4.construtorBicicleta(5,"Preta", "Totem",  "Infantil", 235232);
    
    
    bicicleta1.mostrarDados();
    bicicleta2.mostrarDados();
    bicicleta3.mostrarDados();
    bicicleta4.mostrarDados();
    
    }
}
