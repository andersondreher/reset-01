public enum Categoria {

    SUSPENSE ("Suspense"),
    ROMANCE ("Roamance"),
    FANTASIA ("Fantasia"),
    TERROR ("Terror");

    private String descricao;

    Categoria (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
