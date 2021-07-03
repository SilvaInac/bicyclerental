/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.model;

/**
 *
 * @author Cap
 */
public class Acessorio {
    
       private int id_acessorio;
       private String cor_cap;
       private int tam_cap;
       private boolean protecao;

    public int getId_acessorio() {
        return id_acessorio;
    }

    public void setId_acessorio(int id_acessorio) {
        this.id_acessorio = id_acessorio;
    }

    public String getCor_cap() {
        return cor_cap;
    }

    public void setCor_cap(String cor_cap) {
        this.cor_cap = cor_cap;
    }

    public int getTam_cap() {
        return tam_cap;
    }

    public void setTam_cap(int tam_cap) {
        this.tam_cap = tam_cap;
    }

    public boolean isProtecao() {
        return protecao;
    }

    public void setProtecao(boolean protecao) {
        this.protecao = protecao;
    }

    @Override
    public String toString() {
        return "Acessorio " + Integer.toString(id_acessorio); 
    }
       
    
    
}
