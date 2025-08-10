# 📚 Biblioteca Simples em Java

Este é um projeto **básico** de uma biblioteca feito em **Java**, criado para demonstrar conceitos fundamentais de **Programação Orientada a Objetos (POO)** de forma prática.

## 🎯 Objetivo
O projeto serve como exemplo para alunos entenderem como aplicar:
- **Encapsulamento**
- **Herança**
- **Polimorfismo**
- **Composição**

--- 

### 📄 Descrição das Classes
- **Livro** → Representa um livro com título, autor e status de empréstimo.
- **Pessoa** → Classe abstrata para pessoas da biblioteca.
- **Usuario** → Representa um cliente/usuário da biblioteca.
- **Funcionario** → Representa um funcionário da biblioteca.
- **Biblioteca** → Armazena e gerencia os livros.
- **Main** → Contém o método `main` para execução e testes.

## 🚀 Funcionalidades
- Adicionar livros à biblioteca.
- Listar livros disponíveis ou emprestados.
- Buscar livro pelo título.
- Emprestar e devolver livros.
- Apresentar informações sobre usuários e funcionários.

---

## 💡 Conceitos de POO Utilizados
- **Encapsulamento:** atributos privados e getters/setters.
- **Herança:** `Usuario` e `Funcionario` herdam de `Pessoa`.
- **Polimorfismo:** `apresentar()` é sobrescrito nas subclasses.
- **Composição:** `Biblioteca` contém uma lista de `Livro`.
