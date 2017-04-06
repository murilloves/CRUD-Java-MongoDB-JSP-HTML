<%-- 
    Document   : inserirformulario
    Created on : 06/04/2017, 15:07:47
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page import="com.mongodb.MongoException"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.MongoClientURI"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Olar, vc vem sempre aq?</h2>
        <%  
            // Recebendo os parâmetros de "novo.html" e salvando em variáveis
            String Snome = request.getParameter("nome");
            String Stelefone = request.getParameter("telefone");
            String Sestado = request.getParameter("estado");
            String Scidade = request.getParameter("cidade");
        %>
        
        <%  
            // Criando a conexão com o Banco de Dados
            MongoClient mongoClient = new MongoClient();
/*            MongoDatabase database = mongoClient.getDatabase("admin");
            MongoCollection<Document> colecao = database.getCollection("usuarios");
            
            
            Document novoDocumento = new Document("Nome", Snome)
                                .append("Telefone", Stelefone)
                                .append("Estado", Sestado)
                                .append("Cidade", Scidade);
            
            colecao.insertOne(novoDocumento);
*/
            // out.print("Dados ("+Snome+","+Stelefone+","+Sestado+","+Scidade+") gravados com sucesso!");

        %>
    </body>
</html>
