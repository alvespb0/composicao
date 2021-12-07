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
public class composicao {

    public static void main(String[] args) {
        automovel carro = new automovel ();
        automovel carro2 = new automovel(1600, "verde");
        carro2.imprimeautomovel();
        carro.imprimeautomovel();
        
    }
}
