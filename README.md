# TP 3 - Fundamentos da programação Java

Este TP está dividido em três etapas. As etapas 1 e 2 são alterações de código e, portanto, devem ser entregues no seu respectivo projeto do Greenfoot. Por outro lado, a etapa 3 contém uma questão teórica e, portanto, sua resposta deve ser entregue em um arquivo pdf. Crie um único arquivo .zip ou .rar com os dois projetos do Greenfoot e com o pdf e envie via moodle.

## Etapa 1: realize as seguintes modificações no cenário little-crab5:

1. Faça com que as lagostas se movimentem com velocidades aleatórias. Cada lagosta, ao ser criada, deve estabelecer sua velocidade com um valor aleatório entre 3 e 8.
1. Implemente um sistema de temporização, como feito na Etapa 5.
1. Modifique as regras de derrota e vitória do jogo da seguinte forma:
	1. Ao comer um Worm, o jogador ganha 20 pontos;
	1. Ao encostar em uma lagosta, o jogador perde 50 pontos;
	1. O jogador perde se sua pontuação ficar negativa ou se o tempo esgotar e sua pontuação estiver abaixo de 100
	1. O jogador ganha se conseguir atingir 200 pontos ou se o tempo esgotar e ele tiver pontuação maior ou igual a 100 pontos
1. Faça com que a pontuação do jogador seja exibida na tela.
1. Faça com que o tempo restante seja exibido na dela
1. Se o jogador perder, além do comportamento atual, exiba também uma mensagem no centro da tela informando o jogador sobre a derrota.
1. Se o jogador vencer, além do comportamento atual, exiba também uma mensagem no centro da tela informando o jogador sobre a vitória.

## Etapa 2: realize as seguintes alterações no cenário piano

Na Etapa 6 nós utilizamos um loop while para adicionar as teclas do piano. Da maneira que implementamos o código, seu funcionamento ficou muito dependente do tamanho da imagem que usamos para representar a tecla do piano. Assim, volte a esse código e o altere para que ele funcione bem independentemente do tamanho da imagem da tecla.

Dica: crie a tecla e atribua o objeto criado a uma variável. Nessa variável você pode chamar o método getImage para obter a imagem da tecla. Essa imagem também deve ser armazenada em uma variável. Nessa última variável você pode chamar os métodos getWidth e getHeight que fornecem a largura e a altura da imagem, respectivamente.

Note que a primeira tecla deve ficar afastada por alguns pixels da margem esquerda do piano.
Na Etapa 6 nós não implementamos as teclas pretas no nosso piano. Chegou a hora de fazer isso. Para tanto, siga esse roteiro:
Atualmente, as imagens que representam a tecla normal e pressionada estão definidas diretamente no código-fonte da classe Key. Assim como fizemos com a nota que a tecla toca, abstraia a classe Key para representar tanto teclas brancas quanto teclas pretas;

1. Altere o código atual que insere as teclas brancas para que, ao criar a tecla branca, sejam fornecidas à classe Key o nome das imagens utilizadas quando a tecla não está e também quando ela está pressionada.
1. Crie mais dois arrays na classe Piano, um para as teclas do teclado que irão controlar as teclas pretas do piano e outro para o nome dos arquivos de som de cada tecla preta. Note que o nome do som de cada tecla preta é igual ao nome do som da tecla branca concatenado com “#”. Obs.: Nem todas as notas tem um sustenido. Por exemplo, o sustenido do C é C#, mas o sustenido de E não é E#, mas sim F.
Escreva um loop while para adicionar as teclas pretas similar àquele que você criou para inserir as teclas brancas. Um detalhe importante é que, diferentemente das teclas brancas, as teclas pretas devem ser posicionadas com alguns espaços vazios entre elas. Tente resolver esse problema.
1. Na classe Piano, faça com que se o botão do mouse for clicado, então o som de todas as teclas devem ser executados. Para tanto, você deve obter todos os objetos da classe Key, utilizando o método getObjects e armazenar em uma variável do tipo List<Key>. Em seguida, utilize o loop for-each para varrer a lista e chamar o método play em cada objeto Key. Após chamar o método play, utilize o método Greenfoot.delay para fazer com que o som das notas sejam executados com certo espaçamento.