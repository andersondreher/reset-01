public enum Status {

    DISPONIVEL ("dISPONÍVEL"),
    EMPRESTADO ("Emprestado"),
    EM_USO ("Em uso");

    private String descricao;

    Status (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
