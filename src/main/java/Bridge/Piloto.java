
package Bridge;


public class Piloto extends Cargo {

    public Piloto(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (this.especializacao.percentualAumento());
    }
}