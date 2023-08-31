package modelos;

public class Bicicleta extends Vehiculo{

    public Bicicleta(Etapa ensambladoChasis, Etapa ensambladoCarroceria, Etapa pintura) {// recibe etapas
        super(ensambladoChasis, ensambladoCarroceria, pintura);// metodo constructor
        // TODO Auto-generated constructor stub
    }

    @Override
    public void fabricar() {// implemento metodo fabricar
        System.out.println("BICICLETA:");
        ensambladoChasis.ejecutar();
        ensambladoCarroceria.ejecutar();
        pintura.ejecutar();
    }
    
}
