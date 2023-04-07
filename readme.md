TargetSystemsTasks
Desenvolvendo a Prática na Target
----------------------------------

  Questão 1 -
Este código inicializa três variáveis: INDICE, SOMA e K. O objetivo do loop é somar cada número inteiro de 1 até INDICE (que é 13 neste caso) e armazenar o resultado na variável SOMA.

O loop while testa se K é menor que INDICE. Enquanto K for menor, o loop executa as seguintes instruções:

incrementa K em 1 (usando o operador ++) adiciona o valor de K à variável SOMA Após a execução do loop, o valor de SOMA é impresso na tela usando a função System.out.println(). O resultado é a soma de todos os números inteiros de 1 até 13, que é 91.


  Questão 2 -
Neste programa, o usuário é solicitado a inserir o limite da sequência de Fibonacci que deseja gerar e o programa gera a sequência até esse limite. Depois disso, o usuário é solicitado a inserir um número para verificar se ele pertence à sequência de Fibonacci, e o programa verifica se o número faz parte da sequência. Por fim, o programa exibe uma mensagem para indicar se o número pertence ou não à sequência.


  Questão 3 -
a) A lógica é que cada elemento é o número ímpar seguinte ao anterior. Então, o próximo número seria 9.

b) A lógica é que cada elemento é o dobro do número anterior. Então, o próximo número seria 128.

c) A lógica é que cada elemento é o quadrado do seu índice. Então, o próximo número seria 49 (7²).

d) a lógica é primeira calcular-se a diferença entre o terceiro e o segundo termo (que é 28) e somar 8 à essa diferença para obter a nova razão (que é 36). Em seguida, adicionar essa razão ao último termo da sequência (64) para se obter o próximo número (100).

e) A lógica é que cada elemento é a soma dos dois elementos anteriores. Então, o próximo número seria 13 (5 + 8).

f) A lógica é que cada elemento é um número natural que começa com a letra "D" na leitura da escrita deles por extenso. o próximo será 200.


  Questão 4 - 
Primeiro, definimos as variáveis necessárias: distância entre as cidades em km, velocidade constante do carro em km/h, velocidade constante do caminhão em km/h e tempo em minutos que o caminhão leva a mais para passar em cada pedágio.

int distancia = 100; // distância entre as cidades em km int velocidadeCarro = 110; // velocidade constante do carro em km/h int velocidadeCaminhao = 80; // velocidade constante do caminhão em km/h int tempoPedagio = 5; // tempo em minutos que o caminhão leva a mais para passar em cada pedágio

Em seguida, calculamos o tempo em horas que leva para o carro e o caminhão se encontrarem. Para isso, dividimos a distância entre as cidades pela soma das velocidades do carro e do caminhão.

double tempoEncontro = (double) distancia / (velocidadeCarro + velocidadeCaminhao);

Calculamos a distância que o caminhão percorre a mais devido aos pedágios. Para isso, convertemos o tempo em minutos para horas (dividindo por 60) e multiplicamos pelo dobro da velocidade do caminhão (ida e volta).

double distanciaPedagio = (tempoPedagio / 60.0) * velocidadeCaminhao * 2;

Calculamos a distância total que o caminhão percorre, somando a distância entre as cidades e a distância percorrida nos pedágios.

double distanciaTotalCaminhao = distancia + distanciaPedagio;

Calculamos a distância que o carro percorre a menos devido à tag de pedágio. Para isso, usamos o mesmo cálculo da distância percorrida nos pedágios, mas considerando a velocidade do carro.

double distanciaPedagioCarro = (tempoPedagio / 60.0) * velocidadeCarro * 2;

Calculamos a distância total que o carro percorre, subtraindo a distância percorrida nos pedágios da distância entre as cidades.

double distanciaTotalCarro = distancia - distanciaPedagioCarro;

Calculamos a distância entre o ponto de encontro e Ribeirão Preto para o caminhão e o carro. Para isso, multiplicamos a distância total percorrida por cada um deles pela razão entre sua velocidade e a soma das velocidades do carro e do caminhão.

double distanciaCaminhaoRibeirao = distanciaTotalCaminhao * (velocidadeCaminhao / (velocidadeCarro + velocidadeCaminhao)); double distanciaCarroRibeirao = distanciaTotalCarro * (velocidadeCarro / (velocidadeCarro + velocidadeCaminhao));

Finalmente, determinamos qual veículo está mais próximo de Ribeirão Preto comparando as distâncias calculadas anteriormente. Se a distância do caminhão for menor, ele está mais próximo. Se a distância do carro for menor, ele está mais próximo. Se as distâncias forem iguais, ambos os veículos estão a mesma distância de Ribeirão Preto, que é justamente a resposta.


  Questão 5 -
Nesse programa, a string é lida a partir da entrada do usuário utilizando a classe Scanner. Em seguida, a string é convertida para um array de caracteres utilizando o método toCharArray(). Os caracteres desse array são então invertidos utilizando um loop for, e o array é convertido de volta para uma string utilizando o construtor da classe String. Por fim, a string invertida é impressa na tela.
