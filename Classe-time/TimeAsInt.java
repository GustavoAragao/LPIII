public class TimeAsInt{
    private int value;

    //Contrutor com sobrecarga
    public TimeAsInt (int HH,int MM,int SS){
      int aux = TimeToSeconds(HH,MM,SS);
      if(validateTime(aux)){
        this.value= aux;
      }else 
          this.value= 0;
    }
    public TimeAsInt (int HH,int MM){
      this(HH,MM,0);
    }
    public TimeAsInt (int SS){
      this(0,0,SS);
    }
    public TimeAsInt(){
      this(0);
    }
    public TimeAsInt(TimeAsInt time){
      this(time.getValue());
    }
   
    private boolean validateTime(int timeValue){
        return ((timeValue>0) && (timeValue<86401));//SegundosEmUmDia = 24*60*60 = 86400 
    }

    private int TimeToSeconds(int hora, int min, int sec){
        return hora*3600 + min*60 + sec;
    }

    private String SecondsToTime(){
        String result = "";
        int hora;
        int min;
        int sec;

        hora = value/3600;
        min = (value % 3600)/60;
        sec = (value % 3600)%60;

        result = Integer.toString(hora) + ":"
               + Integer.toString(min) + ":"
               + Integer.toString(sec);

        return result;
    }

    public void setTime(int hora, int min, int seg){
        int value = this.TimeToSeconds(hora, min, seg);
        if (validateTime(value)) {
            this.value = value;
        }
        else{
            this.value = 0;
        }
    }

    public String getTime(){
        String res = SecondsToTime();
        return res;
    }
    public int getValue(){
      return this.value;
    }

  //adiciona hora minutos e segundos com sobrecarga
    public void addTime(int HH, int MM, int SS){
      this.value += TimeToSeconds(HH, MM, SS);
    }
  
    public void addTime(int MM, int SS){
      addTime(0,MM,SS);
    }
    public void addTime(int SS){
      addTime(0,0,SS);
    }
    public void addTime(TimeAsInt obj){
      addTime(0,0,obj.getValue());
    }

    public void prnTime(){
        System.out.println(getTime());
    }
    
} 