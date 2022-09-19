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
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primeira forma de chamar os metodos construtores

        /*Carro carro = new Carro();
        Carro carro2 = new Carro(2000);
         */
 /*   Carro carro3 = new Carro();//segunda forma de chamar os metodos
        carro3.ligarCarro(2000);
         */
        Carro carro4 = new Carro(0);//terceira forma de chamar os metodos
        Motor motor = new Motor();
        Motor motor2 = new Motor(2000);

        carro4.setMotor(motor);

        carro4.ImprimeDados();//objeto + metodo,chamando metodo imprime potencia da classe carro.
    }

}
