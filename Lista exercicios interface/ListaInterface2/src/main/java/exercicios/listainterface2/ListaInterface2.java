/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package exercicios.listainterface2;

/**
 * Crie uma interface chamada Ordenavel com um método ordenar() que recebe um array de inteiros e o ordena em ordem crescente.Em seguida,
 * implemente essa interface em uma classe chamada BubbleSort que implementa o algoritmo de ordenação Bubble Sort.
 * @author allan
 */
public class ListaInterface2 {

    public static void main(String[] args) {
        
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.ordenar();
    }
}
