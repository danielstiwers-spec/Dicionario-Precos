# Dicionario-Precos

Atividade Prática: O Dicionário de Preços
(Consulta de Código de Barras)

�� Contexto da Atividade
Você foi contratado por um supermercado local para desenvolver o protótipo do sistema
que roda nos totens de consulta de preço dos corredores. Quando um cliente passa o
código de barras de um produto no leitor, o sistema precisa encontrar o preço de forma
instantânea.

Como o supermercado tem milhares de itens, usar uma lista comum (ArrayList) deixaria
a busca muito lenta. Para resolver isso, você usará a estrutura de dados HashMap em
Java, que permite buscas diretas através de uma chave única.

�� Ambiente de Desenvolvimento
Esta atividade será realizada inteiramente no seu GitHub Codespaces.
 Certifique-se de que o terminal do Codespaces está aberto para interagir com o
programa.
 Não é necessário instalar nada na sua máquina física.

�� Requisitos da Atividade (O que você deve fazer)

�� Passo 1: Configuração do Mapa
No método main da sua classe, crie um mapa chamado tabelaPrecos utilizando a
estrutura HashMap.
• A chave (Key) deve ser do tipo String (representando o código de barras).
• O valor (Value) deve ser do tipo Double (representando o preço do produto).

�� Passo 2: Cadastro Inicial (Simulação)
Adicione manualmente ao menos 3 produtos no seu mapa utilizando o método
.put(chave, valor).
• Exemplo de dados:
- Código &quot;78910&quot; ➡️ Preço R$ 4.50 (Chocolate)
- Código &quot;78920&quot; ➡️ Preço R$ 8.90 (Café)
- Código &quot;78930&quot; ➡️ Preço R$ 12.00 (Azeite)

⌨️ Passo 3: Interação com o Usuário
Utilize a classe Scanner para capturar os dados do terminal do Codespaces:
1. Exiba uma mensagem na tela: &quot;Exiba o produto no leitor (Digite o código de barras):
&quot;.
2. Capture o código digitado pelo usuário.
�� Passo 4: A Busca Instantânea e Validação

Utilize as funções do HashMap para processar a busca sem usar nenhum laço de
repetição (for ou while):
• Se o produto existir no mapa: Busque o preço usando o método .get() e exiba na tela a
mensagem: &quot;Produto localizado! Preço: R$ [VALOR]&quot;.
• Se o produto NÃO existir: Exiba a mensagem: &quot;Código de barras não identificado.
Procure um funcionário.&quot; (Dica: use o método .containsKey() para essa verificação).

�� Critérios de Entrega
Ao finalizar, teste o seu código no terminal do Codespaces rodando o comando Java
correspondente. Certifique-se de testar dois cenários: um digitando um código que
existe e outro digitando um código que não existe.

Capture o print de todas os testes e anexe na atividade.. Alem
disso vc vai escrever em folha de caderno explicando todo o seu
codigo ….Sem pedir para as Ias fazer por vc



# Aula 3 - Buscando Produtos por ID (HashMap)
Antes de começar
Vamos continuar o carrinho de compras, agora usando HashMap pra cadastrar produtos com um
ID e buscar rapidinho.

No Codespace:
1. Use o mesmo arquivo Aula3.java (ou crie um novo)
2. Copie o código de cada etapa
3. Rode com: javac Aula3.java java Aula3
Contexto
A loja cresceu e agora tem muitos produtos. Em vez de procurar item por item numa lista, vamos dar um
ID pra cada produto e usar um HashMap pra achar ele na hora.

ArrayList HashMap
Estrutura Guarda apenas uma lista de Valores. Guarda pares de Chave e Valor.
Identificador Usa um índice numérico automático

(0, 1, 2...).

Usa uma chave personalizada criada
por você (String, Integer, etc).

Ordem Mantém os elementos na ordem exata

em que foram inseridos.

Não garante ordem nenhuma dos
elementos.

Duplicados Permite elementos totalmente

repetidos.

As chaves devem ser únicas, mas os
valores podem se repetir.

Velocidade

Mais lento para buscar um item
específico (precisa procurar um por
um).

Extremamente rápido para buscar (vai
direto na chave).

Exemplo Visual
Imagine que você quer guardar três produtos: Notebook, Mouse e Teclado.
Com ArrayList:
O Java cria os índices automáticos (começando do zero).
text
[0] -> "Notebook"
[1] -> "Mouse"
[2] -> "Teclado"
Para buscar o Teclado, você precisa pedir a posição 2: lista.get(2);

Com HashMap:
Você define a identificação (código do produto) para cada um.
text
[101] -> "Notebook"
[102] -> "Mouse"
[103] -> "Teclado"
Para buscar o Teclado, você pede direto pelo código dele: mapa.get(103);

Etapa 1 — Criando o Map
import java.util.HashMap;
public class Aula3 {
public static void main(String[] args) {
HashMap<Integer, String> produtos = new HashMap<>();
produtos.put(101, "Notebook");
produtos.put(102, "Mouse");
produtos.put(103, "Teclado");
System.out.println(produtos);
}
}

Etapa 2 — Buscando um produto pelo ID
System.out.println("Produto 102: " + produtos.get(102));
Pergunta pra pensar: e se você buscar um ID que não existe, tipo produtos.get(999)?
Testa e vê o que aparece.
Etapa 3 — Verificando se um ID existe antes de buscar
if (produtos.containsKey(999)) {
System.out.println("Produto: " + produtos.get(999));
} else {
System.out.println("Produto não encontrado!");
}

Etapa 4 — Removendo um produto pelo ID
produtos.remove(102);
System.out.println("Depois de remover: " + produtos);
Desafio final
Complete o código para cadastrar uma pequena loja:
1. Cadastre 5 produtos, cada um com um ID diferente (ex: 201, 202, 203...)
2. Busque e mostre 2 produtos específicos pelo ID
3. Use .containsKey() para checar um ID que não existe e mostre a mensagem "Produto não
encontrado!"
4. Remova 1 produto pelo ID e mostre o Map atualizado
Saída esperada (exemplo):
Produto 201: Notebook
Produto 203: Teclado
Produto não encontrado!
Depois de remover: {201=Notebook, 202=Mouse, 204=Monitor, 205=Headset}