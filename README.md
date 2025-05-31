# ProjetoFinalFernandaJava

Sistema de Gerenciamento de Cinema em Java – Arquitetura MVC Completa
Introdução
Este projeto é um sistema completo e modular para o gerenciamento de sessões de cinema, desenvolvido em Java, estruturado segundo o padrão arquitetural MVC (Model-View-Controller). Ele simula a operação de um cinema onde clientes podem reservar poltronas para sessões de filmes exibidos em diferentes salas, contemplando desde o cadastro de clientes até o controle detalhado das reservas e lotação das salas.

O sistema foi idealizado para ser um exemplo didático e funcional de aplicação dos conceitos fundamentais de programação orientada a objetos, arquitetura de software e design de sistemas, ao mesmo tempo em que resolve um problema real e comum no contexto de cinemas e entretenimento.

Contexto do Problema
Gerenciar um cinema envolve múltiplas complexidades: controle das salas físicas, sessões de filmes em diferentes horários, reserva de assentos, cadastro de clientes e controle de lotação. Além disso, é importante garantir que o sistema seja intuitivo para o usuário, robusto e escalável para futuras melhorias.

Este projeto aborda essas necessidades criando um ambiente simulado onde:

As salas são definidas por suas dimensões (linhas x colunas) e número total de assentos.

Cada sala pode exibir até quatro sessões de filmes diferentes, respeitando uma duração máxima total.

Clientes podem reservar poltronas específicas para assistir a um filme em uma sessão.

Clientes comuns e estudantes são diferenciados, com dados adicionais para estudantes.

O sistema controla a ocupação das salas, impedindo reservas quando a sala está cheia.

Arquitetura do Sistema: MVC
O padrão MVC foi adotado para garantir a separação clara de responsabilidades, facilitando o desenvolvimento, manutenção e escalabilidade do sistema.

Model (Modelo)
O modelo representa as entidades do domínio do cinema, encapsulando dados e regras de negócio:

Pessoa: Classe abstrata que define atributos básicos comuns a qualquer pessoa (nome, CPF, idade).

Cliente: Extensão de Pessoa, inclui informações específicas sobre a escolha do filme, sessão e email.

ClienteEstudante: Especialização de Cliente, com atributos adicionais como instituição e matrícula.

Sala: Representa uma sala de cinema, com atributos para número de assentos, dimensões, sessões de filmes e estado das poltronas.

Filme: Enumeração ou classe que representa os filmes disponíveis no cinema, com nome e duração.

Poltrona: Representa um assento dentro da sala, com posição e status (livre ou ocupada).

O modelo contém toda a lógica para validação das dimensões das salas, alocação de filmes, reserva de poltronas e controle da lotação.

View (Visão)
A interface atual é baseada em console, permitindo interação via linha de comando. A camada View é responsável por:

Exibir listas de filmes disponíveis, com seus nomes e durações.

Mostrar o mapa visual das poltronas de uma sala, indicando quais estão livres ou ocupadas.

Solicitar entradas do usuário para escolha de filmes, posição de poltronas, dados pessoais e confirmação de reservas.

Apresentar mensagens claras de sucesso, erro ou informações durante o uso.

Controller (Controle)
A camada Controller gerencia a comunicação entre o Model e a View, controlando o fluxo da aplicação:

ClienteController e ClienteEstudanteController: Gerenciam operações sobre clientes, como cadastro, busca e remoção.

SalaController: Gerencia a criação, remoção e listagem de salas, alocação de filmes, reserva de poltronas e verificação de lotação.

Main: Responsável pelo fluxo principal da aplicação, interagindo com o usuário e utilizando os controllers para executar as operações.

Descrição Detalhada das Funcionalidades
1. Gerenciamento de Salas
Criação de Salas: O sistema permite criar salas definindo o número total de assentos e suas dimensões (linhas x colunas). Uma validação rigorosa garante que as dimensões correspondam exatamente ao número de assentos, evitando inconsistências.

Listagem e Visualização: Exibe todas as salas cadastradas, detalhando número de assentos, dimensões e os filmes alocados nas sessões.

Remoção de Salas: Possibilita a remoção de uma sala pelo número de assentos, garantindo que a operação seja segura e que a sala exista.

2. Alocação de Filmes e Sessões
Cada sala pode exibir até quatro sessões de filmes diferentes, com duração total limitada a 900 minutos para garantir a viabilidade da programação.

Os filmes são alocados manualmente para cada sessão da sala, permitindo flexibilidade na programação.

O sistema mantém o controle dos filmes exibidos em cada sessão, facilitando a busca de salas por filme.

3. Reserva e Controle de Poltronas
As poltronas são representadas por uma matriz bidimensional, onde cada posição indica se a poltrona está livre ('0') ou ocupada ('X').

O cliente escolhe o filme e o sistema localiza a sala correspondente.

O usuário informa a posição da poltrona que deseja reservar, e o sistema verifica a disponibilidade.

A reserva é confirmada atualizando o estado da poltrona e associando o cliente à posição reservada.

Quando todas as poltronas da sala estão ocupadas, a sala é considerada cheia e não aceita novas reservas.

4. Cadastro e Gestão de Clientes
Clientes comuns são cadastrados com informações básicas: nome, CPF, idade e email.

Clientes estudantes possuem informações adicionais: instituição de ensino e matrícula.

O sistema mantém listas separadas para clientes comuns e estudantes, permitindo consultas e remoções específicas.

Cada cliente está associado à sessão e poltrona reservada, facilitando o controle detalhado das reservas e histórico.

5. Fluxo Interativo do Sistema
O sistema inicia exibindo a lista de filmes disponíveis.

O usuário escolhe um filme pelo nome exato.

O sistema localiza e apresenta a sala que exibe o filme.

Exibe o mapa das poltronas da sala, indicando status.

O usuário decide se deseja reservar uma poltrona.

Caso positivo, informa a posição desejada.

O sistema realiza a reserva, solicita dados pessoais e cadastra o cliente.

O sistema verifica se todas as salas estão cheias; se sim, encerra o sistema.

