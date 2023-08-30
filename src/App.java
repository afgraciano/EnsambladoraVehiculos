/*patron bridge  o puente que divide en 2 jerarquias separadas (abrstraccion e implementacion)que pueden desarrollarse independientemente una de la otra*/

import modelos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo carro = new Carro(new EnsamblarChasis(), new EnsamblarCarroceria(), new Pintar());
        carro.fabricar();
        Vehiculo moto = new Moto(new EnsamblarChasis(), new EnsamblarCarroceria(), new Pintar());
        moto.fabricar();
    }
}
