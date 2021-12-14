public class Medidas {
    DistanceInterface distance;
    DistanceAdapter salvarNoBanco;

    public Medidas() {
        distance = new QuilometroDistance();
        salvarNoBanco = new DistanceAdapter(distance);
    }

    public void setDistance(double distancia) {
        distance.setDistance(distancia);
        salvarNoBanco.salvarDistancia();
    }

    public double getDistance() {
        return salvarNoBanco.recuperarDistancia();
    }

    public double getDistanciaConvertida() {
        return salvarNoBanco.getDistance();
    }
}