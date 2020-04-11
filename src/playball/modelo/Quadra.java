/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playball.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Luís
 */
public class Quadra {
 private String nome;
 private String descricao;
 private String valorHora;
 private String endereco;
 private String numEndereco;
 private List esporte;
 
 /* AGUARDANDO CRICAO DA CLASSE ESPORTE
 public Quadra(){
     esporte = new ArrayList();
     
     esporte.add(new Esporte());
     
 }
 */

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quadra other = (Quadra) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
 


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    /**
     * @return the valorHora
     */
    public String getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(String valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * @return the numEndereco
     */
    public String getNumEndereco() {
        return numEndereco;
    }

    /**
     * @param numEndereco the numEndereco to set
     */
    public void setNumEndereco(String numEndereco) {
        this.numEndereco = numEndereco;
    }   
         @Override
    public String toString() {
        return "Quadra{" + "descricao=" + descricao + ", valorHora=" + valorHora + '}';
    }

}
