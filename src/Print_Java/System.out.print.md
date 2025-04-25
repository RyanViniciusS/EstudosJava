## 📚 Tipos de `print` em Java e suas Funções

### 🎯 Objetivo
Compreender a diferença entre os métodos de impressão em Java: `System.out.print()`, `System.out.println()`, e `System.out.printf()`.

---

### ✅ **`System.out.print()`**

- **Função**: Imprime o conteúdo no console **sem pular linha**.
- **Uso**: Ideal quando você deseja continuar imprimindo na mesma linha.

#### Exemplo:
```java
public class ExemploPrint {
    public static void main(String[] args) {
        System.out.print("Olá ");
        System.out.print("Mundo!");
    }
}
```

#### Saída:
```java
Olá Mundo!
```

---

### ✅ **`System.out.println()`**

- **Função**: Imprime o conteúdo no console e **pula uma linha** após a impressão.
- **Uso**: Ideal quando você deseja separar as saídas, gerando uma nova linha após cada impressão.

#### Exemplo:
```java
public class ExemploLn {
    public static void main(String[] args) {
        System.out.println("Olá");
        System.out.println("Mundo!");
    }
}
```

#### Saída:
```java
Olá
Mundo!
```

---

### ✅ **`System.out.printf()`**

- **Função**: Imprime o conteúdo de forma **formatada**. Permite controlar a aparência da saída usando especificadores de formato.
- **Uso**: Usado quando você quer controlar a **formatação** da impressão (exemplo: alinhamento, casas decimais, etc).

#### Exemplo:
```java
public class ExemploPrintf {
    public static void main(String[] args) {
        System.out.printf("Número inteiro: %d%n", 10);
        System.out.printf("Número com 2 casas decimais: %.2f%n", 3.14159);
        System.out.printf("Texto alinhado: %-10s%n", "Java");
    }
}
```

#### Saída:
```java
Número inteiro: 10
Número com 2 casas decimais: 3.14
Texto alinhado: Java      
```

- **Explicação** dos especificadores:
    - `%d`: Para imprimir um número inteiro.
    - `%.2f`: Para imprimir um número com 2 casas decimais.
    - `%-10s`: Para imprimir uma string com largura mínima de 10 caracteres, alinhada à esquerda.

---

### 📦 Comparação de Funções

| Método               | Comportamento                                      | Exemplo de Uso                 |
|----------------------|-----------------------------------------------------|--------------------------------|
| `System.out.print()`  | Imprime na mesma linha, **não pula linha**          | Ideal para continuar na mesma linha. |
| `System.out.println()`| Imprime e pula para a próxima linha                | Ideal para separar as saídas por linha. |
| `System.out.printf()` | Imprime com formatação controlada (alinhamento, casas decimais, etc.) | Ideal para saídas com formatação precisa. |

---

### 💡 Conclusão

- **`print`**: Útil para quando você deseja imprimir na mesma linha, sem interrupção.
- **`println`**: Ideal para quando você quer que cada impressão ocupe uma nova linha.
- **`printf`**: Usado quando você precisa de um formato específico para a saída, como número de casas decimais ou alinhamento de texto.

Esses métodos são fundamentais para controlar como a saída será apresentada ao usuário e são amplamente utilizados em todas as etapas da programação.

---

Se quiser explorar mais sobre como formatar saídas com `printf` ou outras formas de personalização, só avisar!
