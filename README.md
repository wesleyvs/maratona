# Validação de códigos .py de maratonas
 O projeto web tem a função de validar códigos python (.py) através de comparação de arquivo de saida do algoritmo postado e o arquivo de saida esperado.  
 
## Endpoint /maratona: 
 É a página principal onde o usuário irá postar o código juntamente com o nome do arquivo e nome do problema (ID).  
 Após a postagem do algoritmo, a aplicação faz as validações e retorna com "SUCCESS" ou "FAIL" dependendo da comparação do arquivo de saída.  
### Demonstração:  
 ![](pics/endpoint-maratona.png)  
   
## Endpoint /show: 
 É a página para exibir um histórico dos códigos postados, incluindo data, hora e o status ("SUCCESS" ou "FAIL").  
### Demonstração:  
 ![](pics/endpoint-show.png) 
