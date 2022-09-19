/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author julio.gabardo
 */
public class Motor {

    private int potencia;

    public Motor() { // metodo construtor
        potencia = 1000;//valor padrao
    }

    public Motor(int potencia) {//sobrecarga metodo
        this.potencia = potencia;//valor definido por você
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
