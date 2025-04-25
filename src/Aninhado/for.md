## 🧪 Exercício: Triângulo de Números com `for` Aninhado

### 🎯 Objetivo
Praticar laços de repetição aninhados e saída formatada no console.

---

### ✅ Conceitos aplicados

- `for` externo: controla o número de linhas.
- `for` interno: imprime os números de 1 até o valor atual do `for` externo.
- Uso de `System.out.print()` para manter na mesma linha.
- Uso de `System.out.println()` para quebrar linha após cada linha do triângulo.
- Controle dinâmico do laço interno (`j <= i`).

---

### 💻 Código

```java
public class Triangulo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }
}
```

---

### 📦 Saída

```java
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10
```
