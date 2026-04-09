#  Sistema CidadeEng

<p align="center">
  <b>Modelagem de um Sistema de Cidade baseado em Engenharia de Software</b><br>
  <i>System Modeling based on Software Engineering Principles</i>
</p>

---

## Visão Geral | Overview

**PT-BR:**
O **Sistema CidadeEng** é um projeto acadêmico que tem como objetivo modelar uma cidade utilizando conceitos de Engenharia de Software, com foco em **modularidade, reusabilidade e organização de sistemas**.

O projeto utiliza uma analogia com peças de LEGO, onde cada elemento da cidade (como casas, estradas, hospitais e pontes) representa componentes reutilizáveis e bem estruturados dentro de um sistema.

**EN:**
**Sistema CidadeEng** is an academic project focused on modeling a city using Software Engineering principles such as **modularity, reusability, and system organization**.

The project uses a LEGO analogy, where each city element (houses, roads, hospitals, bridges) represents reusable and well-structured software components.

---

## Objetivo do Projeto | Project Objective

**PT-BR:**

* Aplicar conceitos de Engenharia de Software na prática
* Desenvolver modelagem completa utilizando UML
* Demonstrar modularização e reuso de componentes
* Simular um sistema real de organização urbana

**EN:**

* Apply Software Engineering concepts in practice
* Develop complete system modeling using UML
* Demonstrate modularity and component reuse
* Simulate a real-world city system

---

##  Conceito Principal (Analogia LEGO)

**PT-BR:**
O sistema foi projetado como um conjunto de peças de LEGO:

* Cada classe é uma peça
* Cada módulo é um conjunto de peças
* Os diagramas mostram como essas peças se conectam

Isso facilita:

* Reutilização
* Organização
* Escalabilidade

**EN:**
The system is designed like LEGO blocks:

* Each class is a block
* Each module is a structure
* Diagrams show how blocks connect

This approach improves:

* Reusability
* Organization
* Scalability

---

##  Etapas de Desenvolvimento do Projeto

###  1. Diagrama de Pacotes (Estrutura Lógica)

**PT-BR:**
Nesta etapa foi feita a organização do sistema em pacotes, separando os principais módulos da cidade.

**Pacotes definidos:**

* Infraestrutura (Estradas, Pontes)
* Saúde (Hospital)
* Educação (Escola)
* Residencial (Casa)

Essa divisão permite maior organização e reutilização dos componentes.

**EN:**
The system was divided into logical packages representing major city modules, improving structure and maintainability.

---

### 2. Diagrama de Classes (Detalhamento das Peças)

**PT-BR:**
Foram definidas as classes, atributos, métodos e relacionamentos.

**Principais conceitos aplicados:**

* Associação (ex: Casa → Estrada)
* Dependência (ex: Hospital → Ponte)

**Objetivo:**
Transformar elementos da cidade em estruturas orientadas a objetos.

**EN:**
Classes, attributes, methods, and relationships were defined using object-oriented design principles.

---

###  3. Diagrama de Componentes (Arquitetura)

**PT-BR:**
Modelagem dos módulos do sistema e suas interações.

**Exemplo:**

* Componente Infraestrutura
* Componente Saúde

Foram utilizadas interfaces para representar:

* Serviços fornecidos
* Serviços requeridos

**EN:**
System components were modeled showing how modules interact through interfaces.

---

###  4. Diagrama de Sequência (Dinâmica do Sistema)

**PT-BR:**
Representa o funcionamento do sistema ao longo do tempo.

**Cenário modelado:**
Uma ambulância sai do hospital, percorre a estrada, atravessa a ponte e chega a uma casa.

**EN:**
Represents system behavior over time using interaction flow between components.

---

##  Ferramentas Utilizadas | Tools

* Astah UML → Modelagem dos diagramas
* Java → Base conceitual de orientação a objetos
* IntelliJ IDEA → Desenvolvimento
* Git & GitHub → Versionamento

##  Diagramas do Sistema

### Diagrama de Classes
![Diagrama de Classes](docs/classes.png)

---

###  Diagrama de Componentes
![Diagrama de Componentes](docs/componentes.png)

---

### Diagrama de Pacotes
![Diagrama de Pacotes](docs/pacotes.png)

---

###  Diagrama de Sequência
![Diagrama de Sequência](docs/sequencia.png)

---

## Boas Práticas Aplicadas

* Princípio da Responsabilidade Única (SRP)
* Modularização do sistema
* Separação de responsabilidades
* Reutilização de componentes

---

##  Melhorias Futuras

* Implementação completa em código
* Integração com banco de dados
* Interface gráfica ou web
* Aplicação de Design Patterns (Factory, Facade)

---

## Autor

**Raiza-Nunes** **yasmithz**

---
## Considerações Finais

**PT-BR:**
Este projeto demonstra como a modelagem bem estruturada pode facilitar o desenvolvimento de sistemas complexos, utilizando conceitos fundamentais de Engenharia de Software.

A analogia com LEGO reforça a importância da organização, reutilização e integração entre componentes.

**EN:**
This project highlights how structured modeling simplifies complex system development, emphasizing organization, reuse, and integration.

---
