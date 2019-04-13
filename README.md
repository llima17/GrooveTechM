# GrooveTechM

README
__________________________________________________________________________________________________
Implementação de teste automatizado para login na movida.

Foi implementado usando um projeto MAVEN com Java, para facilitar o download das dependencias como JUnit, Selenium e Cucumber. As dependencias podem ser encontradas no arquivo "POM.xml".

A implementação inclui dois cenarios, sendo um caso positivo de login com sucesso e outro negativo ao falhar tentando realizar o login.
__________________________________________________________________________________________________
Apesar do cucumber ter sido utilizado para escrever o cenarios de testes com padrão BDD. A métodologia do BDD em si não foi totalmente aplicada. Por meio de pesquisas notei que para isso teria que elaborar melhor um Page Object para utilizar em conformidade com o "Definition Steps" do Cucumber. Devido a uma questão de tempo optei por entregar com os testes executaveis e a descrição do teste, sendo possivel realizar melhorias para fazer uso completo do BDD.

__________________________________________________________________________________________________
Os testes foram executados usando o navegador do Google Chrome Versão 73.0.3683.103 64 bits.
No projeto esta incluso o webDriver necessario para o utilizar em conjunto com a versão do navegador.

O caminho do webDriver pode variar conforme diretorio, este é outro detalhe que pode ser melhorado com mais tempo, talvez utilizando variaveis de ambiente para planejar um diretorio fixo.

"D:\\Projects\\GrooveTechM\\GrooveTech\\setup\\chromedriver_win32\\chromedriver.exe"

