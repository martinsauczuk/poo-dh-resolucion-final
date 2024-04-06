import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad {

    private List<Propiedad> propiedades = new ArrayList<>();

    private int multiplicador;

    public BarrioCerrado(int multiplicador) {
        super(0); // En el caso de los barrios no era claro en el enunciado si necesitaban el impuesto base o no
        this.multiplicador = multiplicador;
    }

    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    @Override
    public double calcularImpuesto() {

        double impuestoTotal = 0;
        for (Propiedad prop : propiedades) {
            impuestoTotal = impuestoTotal + prop.calcularImpuesto();
        }
        return impuestoTotal * multiplicador;

    }
}
