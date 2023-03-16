/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pedidomesabar;

/**
 *
 * @author aluno
 */
public class PedidoMesaBar {

    public static void main(String[] args) {
        Pedidos bebida1 = new Pedidos();
        bebida1.setAlcool(true);
        bebida1.setCategoria("Cerveja");
        bebida1.setQnt(1);
        bebida1.setValor(15.50);
        bebida1.setNome("Itaipava");
        
        Pedidos bebida2 = new Pedidos();
        bebida2.setAlcool(true);
        bebida2.setCategoria("Destilado");
        bebida2.setQnt(1);
        bebida2.setValor(15.50);
        bebida2.setNome("Itaipava");
        
        Pedidos bebida3 = new Pedidos();
        bebida3.setAlcool(false);
        bebida3.setCategoria("Cerveja");
        bebida3.setQnt(1);
        bebida3.setValor(15.50);
        bebida3.setNome("Skol");
        
        Pedidos bebida4 = new Pedidos();
        bebida4.setAlcool(true);
        bebida4.setCategoria("Cerveja");
        bebida4.setQnt(1);
        bebida4.setValor(15.50);
        bebida4.setNome("Coruja");
        
        Pedidos bebida5 = new Pedidos();
        bebida5.setAlcool(true);
        bebida5.setCategoria("Cerveja");
        bebida5.setQnt(1);
        bebida5.setValor(15.50);
        bebida5.setNome("Skin");
        
        double total = bebida1.valor + bebida2.valor + bebida3.valor + bebida4.valor + bebida5.valor;
        System.out.print("Valor total dos pedidos" + total);
    }
}
