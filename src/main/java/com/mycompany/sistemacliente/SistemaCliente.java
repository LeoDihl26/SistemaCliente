/*
 * Crie um programa que registre clientes em uma loja, o sistema precisa pedir: nome, endereço, cpf, idade, sexo e no final mostrar na tela.
 */

package com.mycompany.sistemacliente;
import java.util.Scanner;
public class SistemaCliente {

    public static void main(String[] args) {
        
    String nome;    
    String endereco;
    String cpf; 
    int idade;        
    char sexo;    
        
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);
    
    System.out.println("Digite seu Nome, Endereço, CPF, Idade, Sexo.");
    
    nome = teclado.nextLine();
    endereco = teclado.nextLine();
    cpf = teclado2.nextLine();
    idade = teclado2.nextInt();
    sexo = teclado2.next().charAt(0);
    
    //System.out.println("Dados do Cliente:");        
    System.out.println(nome);
    System.out.println(endereco);
    System.out.println(cpf);
    System.out.println(idade);
    System.out.println(sexo);
    
    teclado.close();
    
        
    }
}
