# Introdução a Maven
### Maven é um ferramenta pra gerenciar build e dependências de um projeto.
- Maven facilita nosso trabalho para empacotar nossos arquivos em um formato desejado.
- Compilar
- Executar teste 
- Endereça como o software foi construído e suas dependências através do POM (Project Object Model)
- Falicita a compreenção do Dev
- Forcener informações de qualidade.

### Linha de código pra instalar um projeto maven
`mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactiId=quick-start-maven -Darchetype=maven-archetype-quickstart -Dinteractive-nome=false`

### Comandos comuns
- mvn compile: compila o todo o cód java e inserido na pasta `target`.
- mvn test: rota os testes da aplicação
- mvn clean: remove a pasta `target`
- mvn package: cria o .jar da aplicação

### Criando diferentes tipos de projeto
Maven archetype é um template que possibilita a personalização e configuração de como o projeto será construido.
Nele, nós definimos: 
- versão de componentes
- quais componentes serão incluídos automaticamente
- organização de pacotes e arquivos


- pesquise por `maven archetype list`
  - `https://maven.apache.org/archetypes/index.html`
- Selecione ultima opção "webapp"
- Copie e cole a linha de comando

Os archetypes podem vir de outras listas na web, repositorios git (precisa fazer um git clone)

