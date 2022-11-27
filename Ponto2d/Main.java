class Main {
  public static void main(String[] args) {
    Ponto2D p = new Ponto2D(1,1);
    System.out.println("P(" + p.getX() + " , " + p.getY() + ")");
    //p.setX(0); so podemos associar os valores ao iniciar
    //p.setY(1);
    System.out.println("é eixo X? " + p.isEixoX());
    System.out.println("é eixo Y? " + p.isEixoY());
    System.out.println("È origem? " + p.isOrigem());
    System.out.println("quadrante: "+p.quadrante());
    System.out.println("distancia: " + p.distancia(p));

  }
}