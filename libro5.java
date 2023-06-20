public class libro5 extends libro3{
    String codi;
    public libro5 (int cod,String autor,String nombrel,int anio,String codi) {
        super(cod,autor,nombrel,anio);
        this.codi=codi;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }
}

