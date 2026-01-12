package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um gato, e atribuir métodos a ele.
        * */

        String nome = "George";
        String nomeEmCaixaAlta = nome.toUpperCase();  //toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK: "+nomeEmCaixaAlta);
        System.out.println("Esse texto está normal: "+nome);

        String casa = "CASA DA BIA";
        String casaEmCaixaBaixa = casa.toLowerCase();   //toLowerCase vai colocar tudo em caixa baixa/minúscula
        System.out.println(casaEmCaixaBaixa);
    }

}
