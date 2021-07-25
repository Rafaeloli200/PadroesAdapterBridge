package Bridge;

public class AgenteAeroportuario extends Cargo {

    public AgenteAeroportuario(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (this.especializacao.percentualAumentoNaoPiloto());
    }
}
