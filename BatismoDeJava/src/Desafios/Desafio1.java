package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        // ===== Criatura 1 =====
        String nomeCriatura1 = "Sochuri";
        int idadeCriatura1 = 45;
        String missao1 = "Explorar o Deserto Ardente";
        String dificuldadeMissao1 = "Média";
        String statusMissao1;

        // ===== Criatura 2 =====
        String nomeCriatura2 = "Gramoss";
        int idadeCriatura2 = 120;
        String missao2 = "Defender o Território";
        String dificuldadeMissao2 = "Alta";
        String statusMissao2;

        // ===== Criatura 3 =====
        String nomeCriatura3 = "Aolenus";
        int idadeCriatura3 = 80;
        String missao3 = "Coletar Recursos Raros";
        String dificuldadeMissao3 = "Baixa";
        String statusMissao3;

        // ===== Lógica da missão =====

        // Criatura 1
        if (idadeCriatura1 < 66 &&
                (dificuldadeMissao1.equals("Baixa") || dificuldadeMissao1.equals("Média"))) {
            statusMissao1 = "Concluída";
        } else if (idadeCriatura1 >= 66) {
            statusMissao1 = "Concluída";
        } else {
            statusMissao1 = "Não concluída";
        }

        // Criatura 2
        if (idadeCriatura2 < 66 &&
                (dificuldadeMissao2.equals("Baixa") || dificuldadeMissao2.equals("Média"))) {
            statusMissao2 = "Concluída";
        } else if (idadeCriatura2 >= 66) {
            statusMissao2 = "Concluída";
        } else {
            statusMissao2 = "Não concluída";
        }

        // Criatura 3
        if (idadeCriatura3 < 66 &&
                (dificuldadeMissao3.equals("Baixa") || dificuldadeMissao3.equals("Média"))) {
            statusMissao3 = "Concluída";
        } else if (idadeCriatura3 >= 66) {
            statusMissao3 = "Concluída";
        } else {
            statusMissao3 = "Não concluída";
        }

        // ===== Exibição =====
        System.out.println("=== Criaturas de Creatures of Sonaria ===\n");

        System.out.println("Criatura: " + nomeCriatura1);
        System.out.println("Idade: " + idadeCriatura1);
        System.out.println("Missão: " + missao1);
        System.out.println("Dificuldade: " + dificuldadeMissao1);
        System.out.println("Status: " + statusMissao1);
        System.out.println("----------------------------------");

        System.out.println("Criatura: " + nomeCriatura2);
        System.out.println("Idade: " + idadeCriatura2);
        System.out.println("Missão: " + missao2);
        System.out.println("Dificuldade: " + dificuldadeMissao2);
        System.out.println("Status: " + statusMissao2);
        System.out.println("----------------------------------");

        System.out.println("Criatura: " + nomeCriatura3);
        System.out.println("Idade: " + idadeCriatura3);
        System.out.println("Missão: " + missao3);
        System.out.println("Dificuldade: " + dificuldadeMissao3);
        System.out.println("Status: " + statusMissao3);
    }
}
