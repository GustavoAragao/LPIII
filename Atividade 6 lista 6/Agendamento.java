public class Agendamento {
  //atributos
  private Contato pessoa;
  private DataHoraAgregada dataHoraComp;

  //construtor
  public Agendamento(Contato outraPessoa, DataHoraAgregada outraDataHora){
    this.pessoa = outraPessoa;
    this.dataHoraComp= outraDataHora;
  }
  //metodos
  //retorna string com os dados da pessoa a data e hora do compromisso
  public String toString(){
    String str = "\nContado\n " + pessoa.toString();
    str += "\nData e hora agendada \n" + dataHoraComp.toString();
    return str;
  }
  //retorna verdadeiro se agendamento for igual ao agendamento passado por parametro
  public boolean isEquals(Agendamento obj){
    if (this.getPessoa() == obj.getPessoa())
      if(this.getDataHoraComp() == obj.getDataHoraComp())
        return true;
    return false;
  }
  //getters e setters
  public void setPessoa(int initDia, int initMes, int initAno,String initNome,String initEmail,String initTel){
    pessoa.setDataNasc(initDia,initMes,initAno);
    pessoa.setNome(initNome);
    pessoa.setEmail(initEmail);
    pessoa.setTel(initTel);
  }
  public void setDataHoraComp(int hr, int min, int seg,int dia, int mes, int ano){
    dataHoraComp.setData(dia,mes,ano);
    dataHoraComp.setHora(hr,min,seg);
  }
  public Contato getPessoa(){
    return this.pessoa;
  }
  public DataHoraAgregada getDataHoraComp(){
    return this.dataHoraComp;
  }
  
}