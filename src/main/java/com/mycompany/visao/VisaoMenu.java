/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import java.rmi.server.ObjID;
import java.util.Scanner;

/**
 *
 * @author deusdete.2904
 */
public class VisaoMenu {
    public static int menuPrincipal() {
        System.out.println("======SISTEMA DE VENDAS 2.0=========");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - alterar produto");
        System.out.println("3 - Remover produto");
        System.out.println("4 - Listar produto");
        System.out.println("======================");
        int opcaoMenu = new Scanner(System.in).nextInt();
        
        return opcaoMenu;
                               
    }
    
     
    public static int menuEscolhaProduto(){
        System.out.println("===============CADASTRAR PRODUTO==========?");
        System.out.println("Qual categoria de produto deseja cadastrar?");
        System.out.println("1 - Video Game");
        System.out.println("2 - Computador");
        System.out.println("===========================================");
        int opcaoProduto = new Scanner(System.in).nextInt();
        
        return opcaoProduto;
                 
            
    }
    public static int menuAlteracaoProduto(){
        System.out.println("==========ALTERAR PRODUTO==================" );
        System.out.println("Qual produto deseja Alterar" );
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 +" | " + ControleSistema.produtos.get(i));
        }
        System.out.println("===============================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        return produtoAlterar;
        
    }
    
    public static Object menuAltercaoProdutoInformacoes(Object object){
        System.out.println("===========ALTERACAO DE PRODUTO==========");
        if(object instanceof VideoGame){            
            System.out.println("Novo nome: ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo Preco: ");
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova Plataforma: ");
            ((VideoGame) object).setPlataforma(new Scanner(System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            ((Computador) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo Preco: ");
            ((Computador) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova Memoria Ram: ");
            ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Novo Processador: ");
            ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
        } 
        System.out.println("================================================");
        
        return object;
    }
    
    public static int menuRemocaoProduto(){
        System.out.println("=================REMOVER PRODUTO===================");
        System.out.println("Qual produto deseja remover?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i ++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        
        }
        System.err.println("===============================================");
        int produtoRemover = new Scanner(System.in ).nextInt();
        
        return produtoRemover;
        
        
    }
}

