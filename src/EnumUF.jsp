package src;

public enum EnumUF {
    AC(12,"AC","Acre"),
    AL(27,"AL","Alagoas"),
    AM(13,"AM","Amazonas"),
    AP(16,"AP","Amapá"),
    BA(29,"BA","Bahia"),
    CE(23,"CE","Ceará"),
    DF(53,"DF","Distrito Federal"),
    ES(32,"ES","Espírito Santo"),
    GO(52,"GO","Goiás"),
    MA(21,"MA","Maranhão"),
    MG(31,"MG","Minas Gerais"),
    MS(50,"MS","Mato Grosso do Sul"),
    MT(51,"MT","Mato Grosso"),
    PA(15,"PA","Pará"),
    PB(25,"PB","Paraíba"),
    PE(26,"PE","Pernambuco"),
    PI(22,"PI","Piauí"),
    PR(41,"PR","Paraná"),
    RJ(33,"RJ","Rio de Janeiro"),
    RN(24,"RN","Rio Grande do Norte"),
    RO(11,"RO","Rondônia"),
    RR(14,"RR","Roraima"),
    RS(43,"RS","Rio Grande do Sul"),
    SC(42,"SC","Santa Catarina"),
    SE(28,"SE","Sergipe"),
    SP(35,"SP","São Paulo"),
    TO(17,"TO","Tocantins");

    
    private int valor;
    private String descricao;
    private String descricaoCompleta;

    private EnumUF(int valor, String descricao, String descCompleta) {
        this.valor = valor;
        this.descricao = descricao;
        this.descricaoCompleta = descCompleta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

}
