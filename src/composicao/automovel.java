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
    public direcao direcao;
    
    
    
    public void ligarPelaPrimeiraVez() {
        motor = new motor();
        
    }

    public void ligarPelaPrimeiraVez(int potencia) {
        motor = new motor(potencia);
        
    }

    public automovel() {
        motor = new motor();
        direcao = new direcao();
    }

    public automovel(int potencia, String cor) {
        motor = new motor(potencia);
        direcao = new direcao(cor);
    }
    void imprimeautomovel (){
        System.out.println("cor: "+direcao.getCor());
        System.out.println("potencia do motor: "+motor.getPotencia());
        
    }
}
