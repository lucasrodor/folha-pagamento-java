package folha;

public class Frequencia {
    private int horasExtras;
    private int horasNaoTrabalhadas;
    private boolean ferias;
    private boolean licenca;

    public Frequencia(int horasExtras, int horasNaoTrabalhadas, boolean ferias, boolean licenca) {
        this.horasExtras = horasExtras;
        this.horasNaoTrabalhadas = horasNaoTrabalhadas;
        this.ferias = ferias;
        this.licenca = licenca;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public int getHorasNaoTrabalhadas() {
        return horasNaoTrabalhadas;
    }

    public boolean isFerias() {
        return ferias;
    }

    public boolean isLicenca() {
        return licenca;
    }
}
