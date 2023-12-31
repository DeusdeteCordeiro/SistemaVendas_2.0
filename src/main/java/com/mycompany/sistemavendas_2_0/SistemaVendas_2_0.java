/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavendas_2_0;

import com.mycompany.controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author deusdete.2904
 */
public class SistemaVendas_2_0 {

    public static void main(String[] args) {
        int opcaoMenu;
        
        while(true){
            opcaoMenu = VisaoMenu.menuPrincipal();
        
            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
            }else if(opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());
                
            }else if(opcaoMenu == Constantes.LISTAR){
                ControleSistema.Listar(ControleSistema.produtos);
                
            }      
        }
    }
}
