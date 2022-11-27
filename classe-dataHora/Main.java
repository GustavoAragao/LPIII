class Main {
  public static void main(String[] args) {
    DataHoraComposta dhc = new DataHoraComposta(11,0,0,11,11,2011);
    Data d1= new Data(10,10,2010);
    TimeAsInt h1= new TimeAsInt(10,0,0);
    DataHoraAgregada dha = new DataHoraAgregada(h1,d1);
    System.out.println(h1.toString()+"   "+d1.toString());
  }
}