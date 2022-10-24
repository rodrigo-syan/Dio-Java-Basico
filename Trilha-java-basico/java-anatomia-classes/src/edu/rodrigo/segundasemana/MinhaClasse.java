package edu.rodrigo.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("Olá Mundo!\n");
        final String FIXA = "Variavel que não muda conteudo\n";
        System.out.print(FIXA);
        String primeiroNome = "Rodrigo";
        String segundoNome = "Syan";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

