public class libro1 extends LIBRERIA1 {
    String edicion;

    public libro1 (int cod,String autor,String nombrel,int anio) {
        super(cod,autor,nombrel,anio);
        this.edicion=edicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
