# **ORIENTAÇÃO A OBJETOS**

1\. Introdução à Orientação a Objetos

A Programação Orientada a Objetos (POO) busca aproximar o mundo real do mundo da programação. Em vez de focarmos apenas em funções isoladas, trabalhamos com "coisas" que possuem características e comportamentos.



2\. Classe e Objeto

Classe: É o "projeto", o "molde" ou a "planta baixa". Ela define quais atributos e comportamentos algo terá. Ex: A classe Carro.



Objeto: É a instância física da classe. É o carro que está na sua garagem. É a memória alocada para aquele molde.



3\. Anatomia de uma Classe

Variáveis de Instância (Atributos): São as características do objeto. Chamamos de "instância" porque cada objeto criado terá sua própria cópia dessas variáveis (um carro pode ser azul, o outro vermelho).



Métodos de Instância: São os comportamentos ou ações que o objeto pode realizar (acelerar, ligar, frear). Eles operam sobre as variáveis de instância.



4\. Métodos Construtores

O construtor é o método executado no exato momento em que o objeto é criado (usando a palavra new).



Sem parâmetro: Inicia o objeto com valores padrão (ex: volume 0).



Com parâmetro: Permite que o objeto já nasça com dados específicos fornecidos pelo usuário.



5\. A Palavra-chave this

O this é uma referência ao "próprio objeto". Ele resolve ambiguidades quando o nome do parâmetro do método é igual ao nome do atributo da classe (ex: this.marca = marca).



6\. Tipos de Dados

Primitivos: Tipos básicos do Java que armazenam valores simples (ex: int, float, boolean, double).



Tipo Classe (Referência): Quando o tipo da variável é uma classe ou interface (ex: String, Carro, Scanner).



7\. O Método toString() e a Classe Testa

toString(): Um método especial que devolve uma representação textual do objeto. Sem ele, ao imprimir um objeto, veríamos apenas o endereço de memória.



Classe Testa: É a classe que contém o método main. Ela não serve para modelar um objeto, mas sim para criar instâncias das outras classes e executar o sistema.

