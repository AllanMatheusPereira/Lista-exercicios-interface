/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.listainterface4;

/**
 *
 * @author allan
 */
public class Circulo implements Redimensionavel{

     private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
        
    @Override
    public void redimencionar(double fator) {
        raio = raio * fator;
    }
}
