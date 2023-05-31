/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.listainterface3;

/**
 *
 * @author allan
 */
public class ArquivoCache implements Armazenavel{

    @Override
    public void salvar() {
        System.out.println("Salvar arquivos em cache!");
    }

    @Override
    public void carregar() {
        System.out.println("Carregar arquivos em cache!");
    }
    
    
    
}
