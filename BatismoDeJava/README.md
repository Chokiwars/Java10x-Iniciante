3# JAVA.10X
## Batismo de Java (Nível Iniciante)

---

## 📘 Tipos de Dados em Java

Em Java, os tipos de dados se dividem em **primitivos** e **não primitivos**. Entender essa diferença é fundamental para escrever códigos mais claros, eficientes e organizados.

---

### 🔹 1) Dados Primitivos

Os **dados primitivos** são tipos simples, que armazenam apenas um valor direto na variável.

**Características principais:**
- Armazenam valores básicos (números, caracteres, verdadeiro/falso)
- **Não possuem métodos**
- São mais leves e rápidos

**Exemplos:**
```java
int idade = 20;
double altura = 1.75;
boolean ativo = true;
char letra = 'A';
```

### 🔹 2) Dados Não Primitivos

Os dados **não primitivos** são objetos. Eles não guardam apenas um valor, mas também possuem métodos, que permitem manipular e trabalhar com os dados.

**Características principais:**
- São **objetos**
- Possuem métodos
- Permitem operações mais avançadas
- Geralmente armazenam referências na memória

**Exemplos:**
```java
String nome = "George";
String nomeMaiusculo = nome.toUpperCase();

int[] numeros = {1, 2, 3, 4};
```

**Exemplo de uso de métodos em ``String``:**
```java
String casa = "CASA DA BIA";
System.out.println(casa.toLowerCase());
```

## Conclusão
Os **dados primitivos** são ideais para valores simples e diretos, enquanto os **dados não primitivos** permitem trabalhar com estruturas mais complexas, oferecendo métodos e comportamentos que tornam o código mais poderoso e flexível.

Dominar essa diferença é essencial para avançar em Java e entender melhor a **Programação Orientada a Objetos**.

---

## 📘 Estruturas Condicionais em Java
Em Java, as estruturas condicionais permitem que o programa tome decisões com base em determinadas condições.  
Isso faz com que o código execute caminhos diferentes dependendo dos valores das variáveis.

---

### 🔹 1) Estrutura ``if / else``
A estrutura ``if / else`` é usada quando queremos verificar se uma condição é verdadeira ou falsa.
- Se a condição for verdadeira, o código dentro do `if` é executado
- Se for falsa, o código dentro do ``else`` é executado

```java
if (condicao) {
    // código executado se a condição for verdadeira
} else {
    // código executado se a condição for falsa
}
```

### 🔹 2) Exemplo prático com animais
No exemplo abaixo, usamos um gato chamado **George** e verificamos se ele já completou todas as vacinas necessárias.

```java
short vacinasTomadas = 2;

if (vacinasTomadas >= 4) {
        System.out.println("O gato está com as vacinas em dia");
} else {
        System.out.println("O gato precisa tomar mais vacinas");
}
```

**🔍 O que está acontecendo no código?**
- ``vacinasTomadas`` guarda a quantidade de vacinas que o gato já tomou
- A condição verifica se esse número é maior ou igual a 4
- Se for verdadeiro → o gato está vacinado
- Se for falso → o gato ainda precisa tomar mais vacinas

### 🔹 3) Comparadores usados em condições
Alguns operadores comuns em estruturas condicionais:

- ``>`` maior que
- ``<`` menor que
- ``>=`` maior ou igual
- ``<=`` menor ou igual
- ``==`` igual
- ``!=`` diferente

**Exemplo:**
```java
if (mesesDeVida >= 12) {
        System.out.println("O gato já é adulto");
}
```

**🧠 Por que usar condições?**  
As condições tornam o programa:
- Mais **inteligente**
- Mais **dinâmico**
- Capaz de reagir a diferentes situações  

Sem estruturas condicionais, o código sempre faria a mesma coisa, independentemente dos dados.

## Conclusão
A estrutura if / else é uma das bases da programação em Java.  
Ela permite criar decisões lógicas, deixando o código mais próximo da vida real.

Aprender bem condições é essencial para:

- Validar informações
- Criar regras
- Avançar para estruturas mais complexas como ``else if``, ``switch`` e laços de repetição

Dominar ``if / else`` é um passo fundamental para evoluir como programador Java 🚀🐾

---

---

---

# Desafio 1
Crie um programa que represente **três** criaturas de Creatures of Sonaria de "Roblox" e suas respectivas missões.
Cada criatura tem um **nome**, uma **idade** e uma **missão** atribuida a ela, com o **nome da missão**, **nível de dificuldade** e **status de conclusão**.

## Quer mais dificuldade?
Use condicionais para verificar se o ninja pode concluir a missão baseado na sua idade:
- Altere os status da missão para "concluída" ou "não concluída" de acordo com essa lógica e imprima o resultado
- Criaturas menores de 66 anos só podem concluir missões de nível baixo ou médio. Criaturas com 66 anos ou mais podem concluir missões de qualquer nível.
- 
Altere os status da missão para "concluída" ou "não concluída" de acordo com essa lógica e imprima o resultado.