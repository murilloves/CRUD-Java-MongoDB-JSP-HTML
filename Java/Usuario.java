package testemongo2;

public class Usuario {
    
    private String nome;
    private String telefone;
    private String estado;
    private String cidade;

    private static int qtd;

// SETs
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }

// GETs    
    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEstado(){
        return this.estado;
    }

    public String getCidade(){
        return this.cidade;
    }

    // Exibe dados
    public String mostraDados(){
        String str = (getNome()+" , "+getTelefone()+" , "+getEstado()+" , "+getCidade());
        return str;
    }

}
