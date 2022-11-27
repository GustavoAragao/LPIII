public class Data{
    private int dia, mes, ano;

    //construtor com sobrecarga
    public Data(int initDia, int initMes, int initAno){
      this.setData(initDia,initMes,initAno);
    }
    public Data(){
      this(1,1,1970);
    }
    public Data(Data outraData){
      this(outraData.getDia(),outraData.getMes(),outraData.getAno());
    }

    //verifica se a data passada como argumento é anterior
    public boolean isPrevious(Data outraData){
        if(outraData.getAno() < this.ano){
            return true;
        }else if(outraData.getAno() > this.ano){
                  return false;
              }else if(outraData.getMes() < this.mes){
                        return true;
                    }else if(outraData.getMes() > this.mes){
                            return false;
                          }else if(outraData.getDia() < this.dia){
                                    return true;
                                }else{
                                  return false;
                                }
                    
    }

    //Retorna a quantidade de dias até uma data
    public int howManyDays(Data outraData){
        if(isPrevious(outraData)){
            int cont = mode(outraData.getAno() - this.ano)* 365;
            cont += mode(this.mes - outraData.getMes())* 30;
            cont += (float)mode(this.dia - outraData.getDia());
            return (-cont);
        }else{
            int cont = mode(outraData.getAno() - this.ano)* 365;
            cont += mode(this.mes - outraData.getMes())* 30;
            cont += mode(this.dia - outraData.getDia());
            return cont;
        }
    }

    //Retorna o valor absoluto de um número
    private int mode(int n){
        if(n < 0){
            return (-1 * n);
        }
        return n;
    }

    //Retorna o dia da semana
    public String dayOfWeek(Data date){
        int d = date.getDia();
        int m = date.getMes();
        int y = date.getAno();
        int k = 0;
        String[] daysWeek = {"Sabado", "Domingo","Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};

        if(m == 1){
            k = d + 2 * 13 + (3 * (13 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
        }else if(m == 2){
            k = d + 2 * 14 + (3 * (14 + 1) / 5) + (y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + 2;
              }else{
                  k = d + 2 * m + (3 * (m + 1) / 5) + y + (y / 4) - (y / 100) + (y / 400) + 2;
              }

        return daysWeek[k % 7];
    }

    
    //Atualiza a data
    public void setData(int initDia, int initMes, int initAno){
        if(verificaData(initDia, initMes, initAno)){
           setDia(initDia);
           setMes(initMes);
           setAno(initAno);
        }
        else{
            System.out.println("data invalida!");
            System.exit(-1);
        }
    }

    public void setDia(int initDia){
      this.dia = initDia;
    }
    public void setMes(int initMes){
       this.mes = initMes;
    }
    public void setAno(int initAno){
      this.ano = initAno;
    }
  
    //Valida data
    private boolean verificaData(int dia, int mes, int ano){
        if(mes >= 1 && mes <= 12){
            if((mes == 2) && ((dia >= 1) && (dia <= 29)) && ((ano % 4 == 0) || (ano % 100 == 0) || (ano % 400 == 0))){
              return true;
            }
            else 
              if((mes == 2) && ((dia >= 1) && (dia <= 28))){
                return true;
              }
              else 
                if(((dia >= 1) && (dia <= 31)) && ((mes % 2 != 0) || (mes == 8))){
                  return true;
                }
                 else
                    if((dia >= 1) && (dia <= 30) && (mes % 2 == 0) && (mes != 8)){
                      return true;
                    }
        }
        return false;
    }

    //Retorna o dia
    public int getDia(){
        return this.dia;
    }

    //Retorna o mês
    public int getMes(){
        return this.mes;
    }

    //Retorna o ano
    public int getAno(){
        return this.ano;
    }
    
    //Inicializa o dia, mês e ano com valores padrão
    public void initData(){
        this.dia = getDia();
        this.mes = getMes();
        this.ano = getAno();
    }

    //Imprime data
    public void mostraData(){
        System.out.printf(" " + this.dia + "/" + this.mes + "/" + this.ano);
    }

    //Imprime data por extenso
    public void mostraDataExtenso(){
        String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.printf(" %d de %s de %d\n", this.dia, m[getMes() - 1], this.ano);
    }
}