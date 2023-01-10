/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.linda.classes;

/**
 *
 * @author mimi
 */
public interface ClienteMtds {
    //Interface para colocar metodos necessarios a todas as classes filhas
    void adicionarCliente(); 
    void removerCliente(int id);
    void atualizarCliente(Cliente cliente);
    //não entendi exatamente o que o metodo abaixo deve ser, mas o chatgpt indicou.
    List<Cliente> listarClientes();
    
    
}
