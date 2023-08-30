package modelos;

public class Carro extends Vehiculo {// Carro hereda a Vehiculo

    public Carro(Etapa ensambladoChasis, Etapa ensambladoCarroceria, Etapa pintura) {// recibe etapas
        super(ensambladoChasis, ensambladoCarroceria, pintura);// metodo constructor
        // TODO Auto-generated constructor stub
    }

    @Override
    public void fabricar() {// implemento metodo fabricar
        System.out.println("CARRO:");
        ensambladoChasis.ejecutar();
        ensambladoCarroceria.ejecutar();
        pintura.ejecutar();
    }

}
