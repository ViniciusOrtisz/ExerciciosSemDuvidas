/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastrocerveja;

/**
 *
 * @author aluno
 */
public class CadastroCerveja {

    public static void main(String[] args) {
        Cerveja cerveja1 = new Cerveja(12333,"Alemanha");
        cerveja1.setCategoria("Puro Malte");
        cerveja1.setNome("Brahma");
        cerveja1.setQnt(500);
        cerveja1.setValor(10);
        
        Cerveja cerveja2 = new Cerveja(345436,"Alemanha");
        cerveja2.setCategoria("Puro Malte");
        cerveja2.setNome("Petra");
        cerveja2.setQnt(500);
        cerveja2.setValor(10);
        
        Cerveja cerveja3 = new Cerveja(7134,"Alemanha");
        cerveja3.setCategoria("Puro Malte");
        cerveja3.setNome("Skol");
        cerveja3.setQnt(500);
        cerveja3.setValor(10);
        
        Cerveja cerveja4 = new Cerveja(5236,"Alemanha");
        cerveja4.setCategoria("Puro Malte");
        cerveja4.setNome("spaten");
        cerveja4.setQnt(350);
        cerveja4.setValor(10);
        
        Cerveja cerveja5 = new Cerveja(1234,"Alemanha");
        cerveja5.setCategoria("Duplo Malte");
        cerveja5.setNome("Skin");
        cerveja5.setQnt(500);
        cerveja5.setValor(10);
        
        System.out.println("Cerveja cadastrada 1 Código da cerveja 1 " + cerveja1.getCodigo());
                System.out.println("Cerveja cadastrada 2 Código da cerveja 2 " + cerveja2.getCodigo());
                        System.out.println("Cerveja cadastrada 3 Código da cerveja 3 " + cerveja3.getCodigo());
                                System.out.println("Cerveja cadastrada 4 Código da cerveja 4 " + cerveja4.getCodigo());
                                        System.out.println("Cerveja cadastrada 5 Código da cerveja 5 " + cerveja5.getCodigo());

        
    }
}
