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
public class automovel {

    public motor motor;
    private direcao direcao;
    
    
    
    public void ligarPelaPrimeiraVez() {
        motor = new motor();
        direcao = new direcao();
    }

    public void ligarPelaPrimeiraVez(int potencia, String cor) {
        motor = new motor(potencia);
        direcao = new direcao(cor);
    }

    public automovel() {
        motor = new motor();
    }

    public automovel(int potencia) {
        motor = new motor(potencia);
    }
}
