/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author Luis Guilherme
 */
public class Comedia {
    private String nome;
    private String atorOuAtriz;
    private int ano;
    
    public Comedia(){
        
    }
    
    public Comedia(String nome1, String atorOuAtriz1, int ano1){
        nome = nome1;
        atorOuAtriz = atorOuAtriz1;
        ano = ano1;
    }
    
    public void setNome(String nome1){
        nome = nome1;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setAtorOuAtriz(String atorOuAtriz1){
        atorOuAtriz = atorOuAtriz1;
    }
    
    public String getAtorOuAtriz(){
    return atorOuAtriz;
    }
    
    public void setAno(int ano1){
        ano = ano1;
    }
    
    public int getAno(){
        return ano;
    }
}
