/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.listainterface3;

/**
 *Crie uma interface chamada Armazenavel com dois métodos: salvar() e carregar(). Em seguida, implemente essa interface em uma classe chamada 
 * ArquivoCache que salva e carrega dados de um arquivo no sistema de arquivos.
 * @author allan
 */
public class ListaInterface3 {

    public static void main(String[] args) {
     
        ArquivoCache cache = new ArquivoCache();
        cache.salvar();
        cache.carregar();
    }
}
