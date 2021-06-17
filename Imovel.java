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
public class Imovel {
    protected Integer cep;
    protected String endereco;
    protected Integer metrosQuadrado;
    protected Double valormetrosQuadrados;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getmetrosQuadrado() {
        return metrosQuadrado;
    }

    public void setmetrosQuadrado(Integer metrosQuadrado) {
        this.metrosQuadrado = metrosQuadrado;
    }

    public Double getValormetrosQuadrados() {
        return valormetrosQuadrados;
    }

    public void setValormetrosQuadrados(Double valormetrosQuadrados) {
        this.valormetrosQuadrados = valormetrosQuadrados;
    }
    
    
}
