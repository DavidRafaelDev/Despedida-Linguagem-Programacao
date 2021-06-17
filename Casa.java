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
public class Casa extends Imovel {

    private boolean temPiscina;
    
    public Double calcularAluguel(){
        Double aluguel;        
        if(temPiscina){
            aluguel = (this.metrosQuadrado * this.valormetrosQuadrados) + 1000;
        }else{
            aluguel = this.metrosQuadrado * this.valormetrosQuadrados;
        }
        return aluguel;
    }
    
}
