/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessonfinal;

/**
 *
 * @author Desktop
 */
public class Apartamento extends Imovel {
    private Double valorCondominio;
    
    
    public Double calcularSalario(){
        return (this.metrosQuadrado * this.valormetrosQuadrados) + this.valorCondominio; 
    }
    
}
