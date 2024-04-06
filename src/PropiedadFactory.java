public class PropiedadFactory {

    private static final PropiedadFactory instance = new PropiedadFactory();
    public static int IMPUESTO_BASE = 100;

    public static int MULTIPLICADOR_BARRIO_PRIVADO = 2;

    public static final String CASA_CLASE_ALTA = "CASA_CLASE_ALTA";
    public static final String CASA_CLASE_MEDIA = "CASA_CLASE_MEDIA";
    public static final String CHALET_XL = "CHALET_XL";
    public static final String BARRIO_PRIVADO_TIPO = "BARRIO_PRIVADO_TIPO";


    public static PropiedadFactory getInstance() {
        return instance;
    }

    private Propiedad generarCasaClaseAlta() {
        return new Casa(IMPUESTO_BASE, 1.9);
    }

    private Propiedad generarCasaClaseMedia() {
        return new Casa(IMPUESTO_BASE, 1.1);
    }
    private Propiedad generarChaletXl() {
        return new Chalet(IMPUESTO_BASE, 2, 1.5);
    }

    private BarrioCerrado generarBarrioPrivadoTipo() {
        BarrioCerrado barrioCerrado = new BarrioCerrado(MULTIPLICADOR_BARRIO_PRIVADO);
        // Agrego las 8 casas
        for (int i = 0; i < 8; i++) {
            barrioCerrado.agregarPropiedad(generarCasaClaseMedia());
        }
        // Agrego los 2 chalest
        for (int i = 0; i < 2; i++) {
            barrioCerrado.agregarPropiedad(generarChaletXl());
        }
        return barrioCerrado;


    }

    public Propiedad generarPropiedad(String tipo) {
        switch (tipo) {
            case PropiedadFactory.CASA_CLASE_ALTA:
                return generarCasaClaseAlta();
            case PropiedadFactory.CASA_CLASE_MEDIA:
                return generarCasaClaseMedia();
            case PropiedadFactory.CHALET_XL:
                return generarChaletXl();
            case PropiedadFactory.BARRIO_PRIVADO_TIPO:
                return generarBarrioPrivadoTipo();
            default:
                return null;
        }
    }
}
