📁 Projeto: Inversão de String (Recursivo)

📌 Descrição: >
  Aplicação em Java que utiliza uma função recursiva para inverter uma cadeia de caracteres fornecida pelo usuário.
  A função é chamada recursivamente para pegar o último caractere da string e concatená-lo com o restante da string invertida.

🗂️ Estrutura de Arquivos:

📄 src/controller/StringInvertida.java: 
  Contém a função recursiva responsável por inverter a string.

📄 src/viewer/Principal.java: 
  Contém o código responsável pela interação com o usuário, capturando a entrada e exibindo o resultado.

🧠 Lógica da Recursividade:
  método: stringInv(String palavra)
  explicação: 
    ✋ Condição de parada: Quando a palavra estiver vazia (palavra.isEmpty()).
    🔁 Relação recursiva: Retorna o último caractere da palavra concatenado com a recursão da parte restante da string (palavra.substring(0, palavra.length() - 1)).

💬 Exemplo de Execução: 
  entrada: 
    - Valor: "teste"
  saída:
    - Resultado: "etset"

📥 Entrada:
  - O usuário insere uma palavra através do JOptionPane.

📤 Saída:
  - A string invertida é exibida para o usuário por meio de um JOptionPane.

📌 Observações:
  - A função recursiva é eficiente para inverter qualquer string de tamanho razoável.
  - O código é modular e facilmente legível, com a função recursiva separada da interação com o usuário.
  - A validação da entrada (não implementada) poderia ser realizada para garantir que o usuário insira apenas palavras válidas.

👨‍💻 Autor: Criado por Lucas Bezerra de Macedo.
