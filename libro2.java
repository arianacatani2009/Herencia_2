public class libro2 extends LIBRERIA1 {
    String editorial;

    public libro2 (int cod,String autor,String nombrel,int anio) {
        super(cod,autor,nombrel,anio);
        this.editorial=editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}

