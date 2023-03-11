# Desafio-targetsistemas

Job Rotation - Ribeirão Preto - ATUALIZADO
Pergunta 2 de 2
1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);



Ao final do processamento, qual será o valor da variável SOMA?

R: SOMA = 91



2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.



IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;



3) Descubra a lógica e complete o próximo elemento:



a) 1, 3, 5, 7, R: 9

b) 2, 4, 8, 16, 32, 64, R:  128

c) 0, 1, 4, 9, 16, 25, 36, R:  49

d) 4, 16, 36, 64, R: 100

e) 1, 1, 2, 3, 5, 8, 13, R: 21

f) 2,10, 12, 16, 17, 18, 19, R: 200



4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.

R: O carro e o caminhão estão à mesma distância de Ribeirão Preto ao eles se cruzarem, eles se encontram a 60,9 km de Ribeirão Preto.


Para determinar o local em que o carro e o caminhão se cruzam podemos colocar o ponto de referência em Ribeirão Preto, então, a equação horária do carro é:

Como o caminhão sai de um local 100 km distante do ponto de referência e se aproxima dele, sua equação horária é:

Como o caminhão tem 2 pedágios como obstáculo e perde 5 minutos em cada um deles, podemos calcular o tempo de viagem sem os obstáculos:

Porém, como perde 10 minutos (ou 0,17 horas) nos pedágios, o tempo de viagem para o caminhão será de 1,25h+0,17h=1,42h. Sua velocidade média é:

Nas equações horárias podemos limpar o tempo e igualar ambas para achar o ponto em que o carro e o caminhão se cruzam:

Essa é a distância da cidade de Ribeirão Preto em que o carro e o caminhão se cruzam, ambos estão à mesma distância.

 

5) Escreva um programa que inverta os caracteres de um string.



IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;



NÃO SE ESQUEÇA DE INSERIR O LINK DO SEU REPOSITÓRIO NO GITHUB COM O CÓDIGO FONTE QUE VOCÊ DESENVOLVEU .


