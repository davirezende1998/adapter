/*
SIMULANDO UM SISTEMA QUE TRABALHA COM DISTÂNCIAS EM QUILOMETROS
MAS ARMAZENA AS DISTÂNCIAS EM UM BANCO DE DADOS EM MILHAS
 */

public class DistanceAdapter extends MilhasDistance{
    private DistanceInterface distanciaEmQuilometros;

    public DistanceAdapter(DistanceInterface distanciaEmQuilometros) {
        this.distanciaEmQuilometros = distanciaEmQuilometros;
    }

    public double recuperarDistancia() {
        double km = this.getDistance() * 1.6093;
        distanciaEmQuilometros.setDistance(km);
        return distanciaEmQuilometros.getDistance();
    }

    public void salvarDistancia() {
        double mi = distanciaEmQuilometros.getDistance() * 0.6214;
        this.setDistance(mi);
    }
}