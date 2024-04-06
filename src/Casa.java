public class Casa extends Propiedad {

    private double coeficienteZona;

    public Casa(int impuestoBase, double coeficienteZona) {
        super(impuestoBase);
        this.coeficienteZona = coeficienteZona;
    }

    @Override
    public double calcularImpuesto() {
        return getImpuestoBase() * coeficienteZona;
    }
}
