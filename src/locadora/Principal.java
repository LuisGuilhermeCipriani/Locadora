
package locadora;

import java.util.Scanner;


/**
 *
 * @author Luis Guilherme
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int ano;
        int classificacao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do filme ");
        nome = ler.next();
        System.out.println("Digite o ano do filme ");
        ano = ler.nextInt();
        System.out.println("Digite a classificação do filme ");
        classificacao = ler.nextInt();
        Terror filme1 = new Terror(nome, ano, classificacao);
        System.out.println("Filme \"1\":");
        System.out.println("Nome: \"" + filme1.getNome() + "\"");
        System.out.println("Ano: " + filme1.getAno());
        System.out.println("Classificação: " + filme1.getClassificacao());
        if ((filme1.getClassificacao() > 18) || (filme1.getClassificacao() == 18)){
            System.out.println("O filme \"" + filme1.getNome() + 
                    "\" apresenta cenas pesadas de terror\n");
        }
        else{
            System.out.println("O filme \"" + filme1.getNome() + 
                    "\" não apresenta cenas tão fortes de terror\n");
        }
    }
}
