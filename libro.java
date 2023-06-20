public class libro extends libro6{
    String resumen;
    public libro (int cod,String autor,String nombrel,int anio,String resumen) {
       super(cod,autor,nombrel,anio);
       this.resumen=resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
