package NivelIniciante.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: criar um gato - George -
        * */

        int idade = 12;              // idade do gato em anos
        double peso = 6.5;         // peso do gato em kg
        char inicialNome = 'G';     // inicial do nome do gato
        boolean vacinado = true;    // indica se o gato está vacinado

        System.out.println("GATO: George");   // Comando para mostrar para o usuário
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Inicial do nome: " + inicialNome);
        System.out.println("Vacinado: " + vacinado);

    }
}
