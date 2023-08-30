package modelos;

public abstract class Vehiculo {

    protected Etapa ensambladoChasis;
    protected Etapa ensambladoCarroceria;
    protected Etapa pintura;

    protected Vehiculo(Etapa ensambladoChasis,
            Etapa ensambladoCarroceria,
            Etapa pintura) {

        this.ensambladoChasis = ensambladoChasis;
        this.ensambladoCarroceria = ensambladoCarroceria;
        this.pintura = pintura;
    }

    abstract public void fabricar();// 1:25
}
