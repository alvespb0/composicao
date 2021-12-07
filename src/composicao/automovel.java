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
    private motor motor;
    private direcao direcao;
    public automovel(){
        motor = new motor();
    }
    public automovel(int potencia){
        motor = new motor (potencia);
    }
}
