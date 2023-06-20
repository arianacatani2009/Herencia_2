public class libro3 extends libro1{
    String codi;
    public libro3 (int cod,String autor,String nombrel,int anio) {
        super(cod,autor,nombrel,anio);
        this.codi = codi;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }
}

