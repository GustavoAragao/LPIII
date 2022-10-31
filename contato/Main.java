class Main {
  public static void main(String[] args) {
      Contato c1 = new Contato();
      c1.setDataNasc(10, 10, 2010);
      c1.setEmail("guga@gmail.com");
      c1.setTel("(73)9 9999-9999");
      c1.setNome("Guga");
      c1.mostraContato();
      System.out.println("idade: "+ c1.calculaIdade() +" anos.");
      System.out.println("Funfou!");
  }
}