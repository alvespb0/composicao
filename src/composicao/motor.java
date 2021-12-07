package composicao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class motor {

    private int potencia;

    public motor() {
        potencia = 1000; //valor padrao

    }

    public motor(int potencia) {
        this.potencia = potencia;//this serve para falar sobre o atributo dentro da classe 
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
