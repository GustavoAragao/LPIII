class Main {
    public static void main(String[] args) {
      Data data = new Data(10,11,2022);
      Data data1 = new Data(12,11,2022);
      Data data2 = new Data(data);
      
      data.mostraData();
      data1.mostraData();
      data2.mostraData();  
      System.out.println(data2.howManyDays(data1));
      System.out.println(data1.dayOfWeek(data1));
      
    }
  }