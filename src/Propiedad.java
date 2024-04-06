public abstract class Propiedad {

    private int impuestoBase;

    private String calleNumero;

    public Propiedad(int impuestoBase) {
        this.impuestoBase = impuestoBase;
    }


    public String getCalleNumero() {
        return calleNumero;
    }

    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    public int getImpuestoBase() {
        return impuestoBase;
    }

    public abstract double calcularImpuesto();


}
