Claro, Viviane! Aqui está uma explicação bem organizada das **exceções em Java**, pronta para você colar no seu Notion 💾. Separei por tipos, exemplos e com explicação prática.

---

## 📚 Exceções em Java – Guia Completo

Em Java, **exceções (exceptions)** são eventos que ocorrem durante a execução do programa e interrompem o fluxo normal de instruções.

Todas as exceções são **objetos** que herdam da classe `Throwable`. Ela se divide em duas grandes categorias:

```
Throwable
├── Error            ← Erros graves que não devem ser tratados (ex: problemas na JVM)
└── Exception        ← Situações recuperáveis, que podem e devem ser tratadas
    ├── Checked Exceptions  ← Obrigam tratamento (compile-time)
    └── Unchecked Exceptions (RuntimeException) ← Não obrigam tratamento
```

---

### ✅ 1. **Checked Exceptions (Compiladas)**

São verificadas **em tempo de compilação**. O compilador exige que você trate com `try/catch` ou declare com `throws`.

**Exemplos comuns:**

| Exceção                     | Descrição |
|-----------------------------|-----------|
| `IOException`               | Falha em operações de I/O (arquivo, rede) |
| `SQLException`              | Erros ao acessar bancos de dados |
| `FileNotFoundException`     | Arquivo não encontrado |
| `ParseException`            | Erro ao converter texto em outro formato |
| `InterruptedException`      | Interrupção de uma thread |

📌 Exemplo:
```java
try {
    BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```

---

### ⚠️ 2. **Unchecked Exceptions (Runtime)**

Ocorrências em **tempo de execução**. O compilador **não exige tratamento**, mas você pode capturá-las com `try/catch`.

**Exemplos comuns:**

| Exceção                         | Descrição |
|---------------------------------|-----------|
| `NullPointerException`          | Acesso a método ou campo de um objeto nulo |
| `ArrayIndexOutOfBoundsException`| Acesso fora do limite de um array |
| `ArithmeticException`           | Erro em operação aritmética (ex: divisão por zero) |
| `IllegalArgumentException`      | Argumento inválido passado a um método |
| `NumberFormatException`         | Falha na conversão de `String` para número |
| `ClassCastException`            | Conversão inválida entre classes |

📌 Exemplo:
```java
int[] numeros = new int[3];
System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException
```

---

### ❌ 3. **Errors (Erros graves)**

Erros em **nível de JVM ou sistema**, geralmente **não devem ser capturados** (mas tecnicamente podem ser).

**Exemplos:**

| Erro                     | Descrição |
|--------------------------|-----------|
| `OutOfMemoryError`       | Memória heap esgotada |
| `StackOverflowError`     | Estouro de pilha (ex: recursão infinita) |
| `VirtualMachineError`    | Falha grave na JVM |
| `NoClassDefFoundError`   | Classe não encontrada em tempo de execução |

---

## 🧰 Estrutura de tratamento com try/catch/finally

```java
try {
    // código que pode lançar exceção
} catch (TipoDaExcecao e) {
    // tratamento da exceção
} finally {
    // sempre executado (opcional)
}
```

---

## 🎯 Dica: Criar sua própria exceção

Você pode criar **exceções personalizadas**:

```java
public class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
```

---

