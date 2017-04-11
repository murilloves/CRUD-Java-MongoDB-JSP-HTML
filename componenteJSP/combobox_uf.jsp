<%@page import="src.EnumUF"%>
<%
    EnumUF[] ufs = EnumUF.values();
    String inicializador = request.getParameter("inicial");
    String uf = request.getParameter("uf");
    boolean isUf = uf == "true";
%>

<select id="estado" class="form-control">
    <option value="estado" disabled selected><% out.print(inicializador); %></option> 
    <%
        for (int i = 0; i < ufs.length; i++){
            %>
            <option value="<% out.print(ufs[i].getDescricao()); %>">
                <% 
                    if(isUf){
                        out.print(ufs[i].getDescricao()); 
                    } else {
                        out.print(ufs[i].getDescricaoCompleta()); 
                    }
                
            %></option>
            <%
        }
    %>
</select>
