/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playball.modelo;

/**
 *
 * @author Luís
 */
public class Quadra {
 private String nome;
 private String area;
 private String valorHora;
 private String endereco;
 private String numEndereco;

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
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
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
        return "Quadra{" + "area=" + area + ", valorHora=" + valorHora + '}';
    }

}
