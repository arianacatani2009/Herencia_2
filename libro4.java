public class libro4 extends libro3{
    String edi;

    public libro4 (int cod,String autor,String nombrel,int anio,String edi) {
        super(cod,autor,nombrel,anio);
        this.edi=edi;
    }

    public String getEdi() {
        return edi;
    }

    public void setEdi(String edi) {
        this.edi = edi;
    }
}
