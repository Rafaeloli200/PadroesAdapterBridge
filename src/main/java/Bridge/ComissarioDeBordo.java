package Bridge;

public class ComissarioDeBordo extends Cargo {

    public ComissarioDeBordo(float salarioBase) {
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase * (this.especializacao.percentualAumentoNaoPiloto());
    }
}
