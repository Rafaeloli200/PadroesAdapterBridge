package Bridge;

public class IFR implements Especializacao {

    @Override
    public float percentualAumentoNaoPiloto() {
        return 1.2f;
    }

    @Override
    public float percentualAumento() {
        return 1.0f;
    }

}
