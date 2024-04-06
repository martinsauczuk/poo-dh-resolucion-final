public class Main {
    public static void main(String[] args) {

        // Generacion de instancias
        Casa casa100 = new Casa(100, 2);
        casa100.setCalleNumero("Una calle 1345");
        System.out.println(casa100.calcularImpuesto()); // 200

        Chalet chalet2cochetas = new Chalet(100,3, 2 );
        chalet2cochetas.setCalleNumero("Direccion desconocida");
        System.out.println(chalet2cochetas.calcularImpuesto()); // 600

        BarrioCerrado newGarden = new BarrioCerrado(2);
        newGarden.agregarPropiedad(casa100);
        newGarden.agregarPropiedad(chalet2cochetas);
        System.out.println(newGarden.calcularImpuesto()); // 1600

        // Utilizando el factory
        Propiedad claseMedia =  PropiedadFactory.getInstance().generarPropiedad(PropiedadFactory.CASA_CLASE_ALTA);
        System.out.println(claseMedia.calcularImpuesto());

        Propiedad claseAlta =  PropiedadFactory.getInstance().generarPropiedad(PropiedadFactory.CASA_CLASE_MEDIA);
        System.out.println(claseAlta.calcularImpuesto());

        Propiedad chaletXL =  PropiedadFactory.getInstance().generarPropiedad(PropiedadFactory.CHALET_XL);
        System.out.println(chaletXL.calcularImpuesto());

        Propiedad barrioPrivado = PropiedadFactory.getInstance().generarPropiedad(PropiedadFactory.BARRIO_PRIVADO_TIPO);
        System.out.println(barrioPrivado.calcularImpuesto());

    }
}