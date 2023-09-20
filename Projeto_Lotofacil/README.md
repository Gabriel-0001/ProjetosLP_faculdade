# PROJETO LOTOFÁCIL
## Crie um menu para a loteria utilizando as estruturas switch case e do while.
## Enquanto o usuário não digitar 0, para sair, novas apostas serão permitidas.

    **************************
    Menu LOTOFÁCIL:
    1) Apostar de 0 a 100
    2) Apostar de A à Z
    3) Apostar em par ou ímpar
    0) Sair
    **************************
## • Regras para a aposta de 0 a 100:

• Utilizando a biblioteca *Scanner*, leia um número inteiro via teclado, de 0 a 100,
caso o número seja maior que 100 ou menor que 0, imprima a mensagem: “Aposta
inválida.”.

• Documentação:
• https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

• Utilize a biblioteca Random para sortear aleatoriamente um número de 0 a 100.

• Compare o número escolhido pelo usuário apostador com o número sorteado pelo
sistema.

• Documentação:
• https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

• Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 1.000,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! O número sorteado
foi: X.”.

## • Regras para a aposta de A à Z:
• Utilizando o método *System.in.read()*, leia um char via teclado, de A à Z, podendo
ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, imprima a
mensagem: “Aposta inválida.”. Você poderá utilizar o método Character.isLetter()
para verificar se a entrada digitada é uma letra válida.

• Documentação: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

• Converta a entrada do usuário apostador para maiúsculo, utilizando o método
*Character.toUpperCase()*.

• Escolha a letra com a inicial do seu nome para ser a letra premiada.

• Exemplo: char letraPremiada = 'J'.

• Compare a letra lida via teclado, e convertida para maiúsculo, com a letra
premiada.

• Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 500,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! A letra sorteada foi:
X.”.

## • Regras para a aposta de número par ou ímpar:
• Utilizando a biblioteca *Scanner*, leia um número inteiro via teclado. Exemplo: 600.

• Utilize o operador de módulo *(%)* para verificar se o número é par ou ímpar.
Lembrando que, caso o resto da divisão do número por 2 seja 0, o número é par.

• O prêmio será dado caso o usuário digite um número par. O sistema não irá
premiar jogadores que digitarem um número ímpar.

• Se o número digitado for par, imprima a mensagem: “Você ganhou R$ 100,00
reais.”. Caso o usuário digite um número ímpar, imprima a mensagem: “Que pena!
O número digitado é ímpar e a premiação foi para números pares.”.