/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.listainterface5;

/**
 *Crie uma interface chamada Registravel com um método registrar(String mensagem) que registra uma mensagem de log. Em seguida,
 * implemente essa interface em uma classe chamada RegistroConsole que exibe a mensagem de log no console.
 * @author allan
 */
public class ListaInterface5 {

    public static void main(String[] args) {
        
        RegistroConsole registro = new RegistroConsole();
        registro.registrar("\nLog gravado");
    }
}
