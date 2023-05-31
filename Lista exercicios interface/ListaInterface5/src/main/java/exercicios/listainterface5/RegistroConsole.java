/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.listainterface5;

/**
 *
 * @author allan
 */
public class RegistroConsole implements Registravel{

    @Override
    public void registrar(String mensagem) {
        System.out.println("Log gerado com sucesso!!!" + mensagem);
    }
    
}
