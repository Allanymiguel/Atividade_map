# Atividade_map

Projeto simples em Java para cadastrar e gerenciar jogadores com posições e habilidades. A aplicação é baseada em console e organiza o código em dois pacotes principais: modelo (entidades e atributos) e app (a lógica).

## Funcionalidades
- Adicionar jogador (nome, time, idade, altura, habilidades, posição)
- Editar jogador (substitui os dados do jogador selecionado)
- Imprimir jogadores cadastrados
- Remover jogador
- Menu interativo via console

## Requisitos
- Java 8+ (ou versão mais recente)
- Um terminal/console ou IDE (Eclipse, IntelliJ, VS Code)

## Estrutura do projeto
- src/
  - modelo/
    - Jogador.java
    - Habilidade.java
    - Posicao.java
    - TipoHabilidade.java
  - app/
    - Principal.java
    - JogadorServicos.java
