public class LIBRERIA1 {
    int cod;
    String autor;
    int anio;
    static String nombrel;

    public LIBRERIA1(int cod, String autor, String nombrel, int anio) {
        this.cod = cod;
        this.autor = autor;
        this.nombrel = nombrel;
        this.anio = anio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public static String getNombrel() {
        return nombrel;
    }

    public void setNombrel(String nombrel) {
        this.nombrel = nombrel;
    }
}
