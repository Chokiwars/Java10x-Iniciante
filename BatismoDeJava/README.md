
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

**Exemplo de uso de métodos em `String`:**
```java
String casa = "CASA DA BIA";
System.out.println(casa.toLowerCase());
```

## Conclusão
Os **dados primitivos** são ideais para valores simples e diretos, enquanto os **dados não primitivos** permitem trabalhar com estruturas mais complexas, oferecendo métodos e comportamentos que tornam o código mais poderoso e flexível.

Dominar essa diferença é essencial para avançar em Java e entender melhor a **Programação Orientada a Objetos**.
