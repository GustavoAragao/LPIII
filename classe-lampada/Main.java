class Main {
  public static void main(String[] args) {
    Lampada l1 = new Lampada("enel","branca",10,5,100,1);

    /*l1.setCor("azul");
    l1.setFabricante("blabla");
    l1.setPotenciaW(12.4);
    l1.setQuantStock(10);
    l1.setValor(5.5);
    l1.setTensao(1.4);*/
    l1.vender(5);
    l1.mostraVenda();
    l1.vender(2);
    l1.mostraVenda();
    l1.mostraValorBruto();
    
    
    System.out.println("ele funfou!! hehehe.");
  }
}