public class Chalet extends Propiedad{
    private int cantCocheras;

    private double coeficienteCochera;

    public Chalet(int impuestoBase, int cantCocheras, double coeficienteCochera) {
        super(impuestoBase);
        this.cantCocheras = cantCocheras;
        this.coeficienteCochera = coeficienteCochera;
    }

    @Override
    public double calcularImpuesto() {
        return getImpuestoBase() * cantCocheras * coeficienteCochera;
    }
}
