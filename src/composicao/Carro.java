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
public class Carro {

    private Motor motor;
    private Direcao direcao;

    public Carro() {
        motor = new Motor();
    }

    public Carro(int potencia) {
        motor = new Motor(potencia);//chamando potencia o segundo metodo da clase motor
    }

    public void ligarCarro(int potencia) {
        motor = new Motor(potencia);
    }

    public void ImprimeDados() {//metodo para imprimir dados
        System.out.println("Potencia do motor: " + motor.getPotencia());
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * @return the direcao
     */
    public Direcao getDirecao() {
        return direcao;
    }

    /**
     * @param direcao the direcao to set
     */
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

}
