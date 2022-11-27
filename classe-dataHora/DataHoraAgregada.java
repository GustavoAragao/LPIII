public class DataHoraAgregada{
  private Data data;
  private TimeAsInt hora;

  //Construtor
  DataHoraAgregada(TimeAsInt outraHr, Data outraData){
    this.hora.setValue(outraHr.getValue());;
    this.data.setData(outraData.getDia(), outraData.getMes(), outraData.getAno());
  }
  
  //metodos 

  //retorna verdadeiro se os objetos são iguais
  public boolean isEqual(DataHoraAgregada outroObjeto){
    if (outroObjeto.data.getAno() == this.data.getAno())
      if(outroObjeto.data.getMes() == this.data.getMes())
        if(outroObjeto.data.getDia() == this.data.getDia())
          if(outroObjeto.hora.getValue() == this.hora.getValue())
            return true;
    return false; 
  }

  //retorna verdadeiro se outroObjeto é maior
  public boolean isGreather(DataHoraAgregada outroObjeto){
    if(this.isEqual(outroObjeto) == false)
     if(outroObjeto.data.getAno() > this.data.getAno())
      if(outroObjeto.data.getMes() > this.data.getMes())
        if(outroObjeto.data.getDia() > this.data.getDia())
          if(outroObjeto.hora.getValue() > this.hora.getValue())
            return true;
    return false;
  }

  //retorna verdadeiro se outroObjeto é menor
  public boolean isLower(DataHoraAgregada outroObjeto){
    if(this.isEqual(outroObjeto) == false)
      if(this.isGreather(outroObjeto) == false)
        return true;
    return false;
  }

  //imprime os atributos do objeto usando as funções de impressão de strings
  public String toString(){
    return data.toString() + ", " + hora.toString();
  }

  // metodos getters e setters

  public Data getData(){
    return this.data;
  }

  public TimeAsInt getHora(){
    return this.hora;
  }
  public void setData(int dia, int mes, int ano){
    this.data.setData(dia,mes,ano);
  }

  public void setHora(int hr, int min, int seg){
   this.hora.setTime(hr,min,seg);
  }
}