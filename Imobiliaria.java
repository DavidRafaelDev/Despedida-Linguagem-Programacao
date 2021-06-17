/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessonfinal;

import java.util.List;

/**
 *
 * @author Desktop
 */
public class Imobiliaria {
    private String nome;
    private String endereco;
    private List<Corretor> corretores;
    private List<Cliente> clientes;
    private List<Casa> casas;
    private List<Apartamento> apartamentos;
    
    public void adicionarCasa(Casa casa){
      casas.add(casa);
      System.out.println("Casa adicionada ao sistema");
    }
    
     public void adicionarApartamento(Apartamento apartamento){
      apartamentos.add(apartamento);
      System.out.println("Apartamento adicionada ao sistema");
    }
    
      public void adicionarCorretor(Corretor corretor){
      corretores.add(corretor);
      System.out.println("Corretor adicionada ao sistema");
    }
     
      public void adicionarCliente(Cliente cliente){
      clientes.add(cliente);
      System.out.println("Cliente adicionada ao sistema");
    }
      
    public void marcarVisita(Corretor corretor, Cliente cliente, Imovel imovel){
        System.out.println("Corretor: "+corretor.getNome()+
                            "\nlevou o cliente "+ cliente.getNome()+
                            "\n para visitar o imovel no endereco : "+ imovel.getEndereco());
        
        cliente.setQtdVisitas(cliente.getQtdVisitas() + 1);
    }
    
    public void alugarApartamento(Apartamento apartamento, Cliente cliente, Corretor corretor){
        corretor.setQtdImoveisAlugado(corretor.getQtdImoveisAlugado() + 1);
    }
    
    public void alugarCasa(Casa Casa, Cliente cliente, Corretor corretor){
        corretor.setQtdImoveisAlugado(corretor.getQtdImoveisAlugado() + 1);
    }
    
       public void venderApartamento(Apartamento apartamento, Cliente cliente, Corretor corretor){
        corretor.setQtdImoveisVendido(corretor.getQtdImoveisVendido() + 1);
    }
    
    public void venderCasa(Casa Casa, Cliente cliente, Corretor corretor){
        corretor.setQtdImoveisVendido(corretor.getQtdImoveisVendido() + 1);
    }
}
