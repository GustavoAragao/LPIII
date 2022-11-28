class Main {
  public static void main(String[] args) {
    Data d1 = new Data(10,10,2010);
    Data d2 = new Data(10,10,2010);
    TimeAsInt h1 = new TimeAsInt(10,10,10);
    TimeAsInt h2 = new TimeAsInt(10,10,10);
    DataHoraAgregada dh1 = new DataHoraAgregada(h1,d1);
    DataHoraAgregada dh2 = new DataHoraAgregada(h2,d2);
    Contato c1 = new Contato("gu","gu@gmail","(73)988272610",1,1,2001);
    Contato c2 = new Contato("gu","gu@gmail","(73)988272610",1,1,2001);
    Agendamento a1 = new Agendamento(c1,dh1);
    Agendamento a2 = new Agendamento(c2,dh2);

    System.out.println("a1: " + a1.toString());
    if(a1.isEquals(a1))
      System.out.println("funfou!");
    
  }
}