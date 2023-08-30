package modelos;

public class Moto extends Vehiculo {// Moto hereda a Vehiculo

    public Moto(Etapa ensambladoChasis, Etapa ensambladoCarroceria, Etapa pintura) {// recibe etapas
        super(ensambladoChasis, ensambladoCarroceria, pintura);// metodo constructor
        // TODO Auto-generated constructor stub
    }

    @Override
    public void fabricar() {// implemento metodo fabricar
        System.out.println("MOTOCICLETA:");
        ensambladoChasis.ejecutar();
        ensambladoCarroceria.ejecutar();
        pintura.ejecutar();
    }

}
