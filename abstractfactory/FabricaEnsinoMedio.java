package padroescriacao.abstractfactory;

public class FabricaEnsinoMedio implements FabricaAbstrata {

    @Override
    public Diploma createDiploma() {
        return new DiplomaEnsinoMedio();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoEnsinoMedio();
    }
}
