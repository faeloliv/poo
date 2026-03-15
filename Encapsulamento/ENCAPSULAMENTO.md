# **ENCAPSULAMENTO**

1\. O Conceito de Encapsulamento

Encapsular significa "colocar em uma cápsula". Na POO, é a técnica de esconder os detalhes internos de uma classe e proteger os dados contra alterações indevidas. O objetivo é a segurança e a integridade dos dados.



2\. Visibilidade e a Palavra-chave private

Diferente da visibilidade public (onde qualquer um mexe em tudo), o modificador private restringe o acesso. Um atributo privado só pode ser lido ou alterado por métodos da própria classe.



3\. Métodos Getters e Setters

Como os atributos são privados, usamos métodos públicos para acessá-los:



Getters (Obter): Retornam o valor do atributo.



Setters (Definir): Alteram o valor do atributo, mas com a vantagem de poder validar o dado (ex: não aceitar volume negativo ou marca vazia).



4\. Encapsulamento de Variáveis vs. Métodos

Variáveis: Escondemos para evitar que o saldo ou a temperatura recebam valores impossíveis.



Métodos: Escondemos métodos que realizam lógicas internas complexas que o usuário não precisa conhecer (ex: o processo de autenticação de Wi-Fi em uma TV).



5\. Setter no Construtor

Uma boa prática para fortalecer o encapsulamento é chamar o método set dentro do construtor. Assim, as regras de validação (como a marca começar com letra maiúscula) são aplicadas desde o primeiro segundo de vida do objeto.



6\. Métodos de Classe (static)

Diferente dos métodos de instância (que pertencem ao objeto), os métodos de classe são declarados com a palavra static. Eles pertencem à classe e não dependem de um objeto específico para serem chamados (ex: Math.random()).

