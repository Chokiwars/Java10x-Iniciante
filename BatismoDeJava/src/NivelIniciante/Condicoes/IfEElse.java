package NivelIniciante.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        // Dados da criatura
        String criatura = "Sochuri";
        String rank;
        int idade = 70; // idade da criatura
        boolean adulto = false;
        short tempoDeVidaEmDias = 1200;

        // Verificando o rank da criatura com base na idade
        if (idade >= 0 && idade <= 32) {
            rank = "Filhote";
        } else if (idade >= 33 && idade <= 65) {
            rank = "Jovem";
        } else if (idade >= 66 && idade <= 100) {
            rank = "Adulto";
            adulto = true;
        } else {
            rank = "Ancião";
            adulto = true;
        }
    }
}