class Main {
  public static void main(String[] args) {
      Contato c1 = new Contato("Guga","guga@gmail.com","(73)9 9999-9999",26,11,2002);
      Contato c2 = new Contato();
      
      c1.mostraContato();c2.mostraContato();
      System.out.println("idade c1: "+ c1.calculaIdade() +" anos.");
      System.out.println("Funfou!");
  }
}