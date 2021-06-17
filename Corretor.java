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
public class Corretor extends Pessoa {
    private Double valorComissao;
    private Integer qtdImoveisVendido;
    private Integer qtdImoveisAlugado;

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }

    public Integer getQtdImoveisVendido() {
        return qtdImoveisVendido;
    }

    public void setQtdImoveisVendido(Integer qtdImoveisVendido) {
        this.qtdImoveisVendido = qtdImoveisVendido;
    }

    public Integer getQtdImoveisAlugado() {
        return qtdImoveisAlugado;
    }

    public void setQtdImoveisAlugado(Integer qtdImoveisAlugado) {
        this.qtdImoveisAlugado = qtdImoveisAlugado;
    }
    
    
    public Double calcularSalario(){
        return (valorComissao * qtdImoveisVendido) + (valorComissao * qtdImoveisAlugado);
    }
}
