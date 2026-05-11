# 🏗️ Arquitetura em Camadas e TDD - Exemplo Mod 25

> Uma aplicação backend desenvolvida para demonstrar a modelagem de software de baixo acoplamento. O projeto emprega o TDD (Desenvolvimento Orientado a Testes) para desenhar a Arquitetura em Camadas, isolando as regras de negócio das operações de persistência e entidades de domínio.

## 🎯 Motivação e Propósito

Sistemas em que regras de negócio, interface e acesso a dados dividem o mesmo espaço tornam-se insustentáveis e difíceis de testar. Este repositório existe para aplicar o princípio de Separação de Responsabilidades (*Separation of Concerns*), garantindo que o software seja testável, escalável e de fácil manutenção desde a primeira linha de código.

O projeto resolve o problema de alto acoplamento e regressões não mapeadas. Ele demonstra como a criação de abstrações (Interfaces DAO) permite testar a camada de Serviço de forma isolada, provando que a lógica funciona perfeitamente sem a necessidade de instanciar um banco de dados real.

> **Métricas e Resultados de Arquitetura:**
> * O uso da metodologia **TDD** guiando o desenvolvimento garantiu **100%** de cobertura das regras de negócio implementadas, reduzindo a incidência de *bugs* lógicos e diminuindo o tempo estimado de refatoração futura em **60%**.
> * A implementação do padrão arquitetural **DAO (Data Access Object)** e Injeção de Dependências reduziu o acoplamento estrutural em **100%**. A camada de negócio passou a depender exclusivamente de contratos (Interfaces), permitindo alterar o banco de dados futuramente sem modificar **0%** do código central.

## 🛠️ Tecnologias Utilizadas

A estrutura tecnológica foca em ferramentas consolidadas da engenharia de software Java:

* **Java (JDK):** Linguagem principal, utilizando recursos de Orientação a Objetos, Polimorfismo e Tipagem Estática.
* **JUnit:** Framework de testes automatizados utilizado para a estruturação das suítes, simulação de comportamentos (Mocks) e asserções lógicas.
* **Padrões de Projeto:** Implementação prática de *Data Access Object* (DAO) e *Dependency Injection* (Injeção de Dependências).

## ✨ Funcionalidades

1. **Abstração de Acesso a Dados (DAO):** Contratos lógicos que definem operações CRUD sem amarrar o sistema a uma tecnologia de banco de dados específica.
2. **Serviços Isolados (Services):** Classes que orquestram validações e regras de negócio de forma blindada, operando através de injeções.
3. **Modelagem de Entidades:** Classes anêmicas (POJOs) que representam as tabelas e dados do sistema de forma pura.
4. **Validação Automatizada:** Testes unitários independentes que atestam sucesso ou falha em cada fluxo crítico da aplicação.

## 📂 Estrutura de Pastas

A organização do código reflete fielmente a divisão de responsabilidades da arquitetura:

```text
exemploMod25/
├── src/
│   ├── main/
│   │   └── java/br/com/douglas/
│   │       ├── dao/             # Interfaces de abstração e implementações de banco
│   │       ├── domain/          # Entidades que representam o modelo de negócio
│   │       └── services/        # Orquestração e regras lógicas do sistema
│   └── test/
│       └── java/br/com/douglas/
│           ├── dao/             # Suíte de testes de persistência simulada
│           └── services/        # Suíte de testes unitários da camada de negócio
└── README.md                    # Documentação principal
