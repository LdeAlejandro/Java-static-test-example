## 📋 README - Exemplo de Uso de Variáveis e Métodos `static` em Java

### 📁 Descrição do Repositório

Este repositório é um **exemplo simples** que demonstra o uso de **variáveis e métodos estáticos em Java**, utilizando duas classes: `ExameService` e `Exame`. O objetivo é mostrar como acessar e modificar variáveis estáticas entre diferentes classes e entender o comportamento dessas variáveis dentro de um contexto Java.

### 🛠️ Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **`ExameService`**: Classe responsável por executar o código principal e manipular a classe `Exame`.
- **`Exame`**: Classe que contém uma variável e um método estáticos para demonstração.

### 📂 Estrutura do Repositório

```
src/
└── com/
    └── mastersoft/
        └── clinical/
            ├── model/
            │   └── Exame.java
            └── service/
                └── ExameService.java
```

### 📄 Explicação do Código

#### 📌 Classe `Exame`
```java
package com.mastersoft.clinical.model;

public class Exame {
    public static String variable = "variable test"; 

    public static void test() {
        System.out.println("Método estático test() chamado.");
    }
}
```

- **`variable`**: Uma variável `static` que armazena um valor de texto.
- **`test()`**: Um método `static` que imprime uma mensagem no console.

#### 📌 Classe `ExameService`
```java
package com.mastersoft.clinical.service;

import com.mastersoft.clinical.model.Exame;

public class ExameService {
    public static void main(String[] args) {
        // Criando uma instância para chamar o método não estático
        ExameService service = new ExameService();
        service.salvarExame();
    }
    
    void salvarExame() {
        // Chamando o método estático da classe Exame
        Exame.test();

        // Imprimindo o valor inicial da variável estática
        System.out.println(Exame.variable);

        // Alterando o valor da variável estática
        Exame.variable = "new String";

        // Imprimindo o novo valor da variável estática
        System.out.println(Exame.variable);
    }
}
```

- O método `salvarExame()` acessa e modifica a variável `static` definida na classe `Exame`.
- O método `main()` cria uma instância da `ExameService` para chamar o método `salvarExame()`.

### ✅ Saída Esperada

Ao executar o programa, a saída no console será:

```
Método estático test() chamado.
variable test
new String
```
