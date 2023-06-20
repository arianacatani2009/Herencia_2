public class libro8 extends libro6{
    String editoria;

    public libro8 (int cod,String autor,String nombrel,int anio,String editoria) {
        super(cod,autor,nombrel,anio);
        this.editoria=editoria;
    }

    public String getEditoria() {
        return editoria;
    }

    public void setEditoria(String editoria) {
        this.editoria = editoria;
    }
}

