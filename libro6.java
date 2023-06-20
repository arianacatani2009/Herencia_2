public class libro6 extends LIBRERIA1 {
  int codi;

    public libro6 (int cod,String autor,String nombrel,int anio) {
        super(cod,autor,nombrel,anio);
        this.codi=codi;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }
}

