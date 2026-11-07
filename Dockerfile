# ----------------------------------------------------
# Stage 1: Build (Compilação e empacotamento da aplicação)
# ----------------------------------------------------
FROM maven:3.9-eclipse-temurin-21 AS build

# Define o diretório de trabalho dentro do container de build
WORKDIR /app

# Copia apenas o descritor de dependências Maven primeiro
COPY pom.xml .

# Baixa as dependências em cache do Docker para acelerar builds subsequentes
RUN mvn dependency:go-offline -B

# Copia o código-fonte da aplicação
COPY src ./src

# Compila o projeto e empacota o executável JAR ignorando os testes unitários
RUN mvn clean package -DskipTests

# ----------------------------------------------------
# Stage 2: Runtime (Imagem final otimizada para execução)
# ----------------------------------------------------
FROM eclipse-temurin:21-jre-alpine

# Cria um grupo e usuário de sistema não-root por boas práticas de segurança
RUN addgroup -S spring && adduser -S spring -G spring

# Define o diretório de trabalho onde o binário será executado
WORKDIR /app

# Copia o artefato .jar compilado no stage de build atribuindo permissão ao usuário spring
COPY --from=build --chown=spring:spring /app/target/*.jar app.jar

# Altera a execução para o usuário não-root recém-criado
USER spring:spring

# Informa ao Docker que a aplicação escuta na porta 8080 (padrão Spring Boot)
EXPOSE 8080

# Variável de ambiente configurável para passar argumentos à JVM (ex: limites de memória)
ENV JAVA_OPTS=""

# Ponto de entrada que executa o arquivo JAR com a JVM
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
