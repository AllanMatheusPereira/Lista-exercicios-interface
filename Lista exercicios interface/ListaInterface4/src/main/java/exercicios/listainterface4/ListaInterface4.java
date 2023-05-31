/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.listainterface4;

/**
 *Crie uma interface chamada Redimensionavel com um método redimensionar(double fator) que redimensiona um objeto geométrico. Em seguida, 
 * implemente essa interface em uma classe chamada Circulo para redimensionar o raio do círculo pelo fator fornecido.
 * @author allan
 */
public class ListaInterface4 {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(1.5);
        System.out.println("Raio do círculo antes da redimensionar: " + circulo.getRaio());

        double fator = 4.0;
        circulo.redimencionar(fator);

        System.out.println("Raio do círculo depois da redimensionar: " + circulo.getRaio());
    }
}
