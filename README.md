Este é um projeto exemplo para fazer o deploy no servidor JBoss e rodar todos os testes, inclusive os testes de integração, nesse caso são os testes de aceitação com Selenium.

Com uma instância do JBoss 7 rodando execute o comando: 

`mvn install -Pambiente-integracao -DskipTests=false`

O profile 'ambiente-integracao' instrui a fazer o deploy no JBoss 7 e o parâmetro skipTests=false instrui a rodar os testes de integração (Veja o pom.xml).