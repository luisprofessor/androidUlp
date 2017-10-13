/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio.negocio;
import recuperatorio.entidades.*;
/**
 *
 * @author Usuario
 */
public class Registro {
    
    private Ficha lista[]=new Ficha[100];
    private int pos=-1;
    
    public void agregarFicha(Ficha ficha){
        if(pos<100){
        
            pos++;
            lista[pos]=ficha;
        }
    
    }
    
    
    public void listarAulas(String dia){
    
        for(int i=0;i<pos;i++){
        
            if(lista[i].getDia().equals(dia)){
            
                System.out.println("Aula "+lista[i].getAula().getNroAula());
                System.out.println("Materia "+lista[i].getMateria().getNombre());
            }
        }
    
    }
    
}
