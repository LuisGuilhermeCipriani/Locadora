
package locadora;

/**
 *
 * @author Luis Guilherme
 */
public class Terror {
    private String nome;
    private int ano;
    private int classificacao;
    
    public Terror(){
        
    }
    
    public Terror(String nome1, int ano1, int classificacao1){
        nome = nome1;
        ano = ano1;
        classificacao = classificacao1;
    }
    
    public void setNome(String nome1){
        nome = nome1;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setAno(int ano1){
        ano = ano1;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setClassificao(int classificacao1){
        classificacao = classificacao1;
    }
    
    public int getClassificacao(){
        return classificacao;
    }
}
    

