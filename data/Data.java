public class Data{
    private int dia, mes, ano;

    //Atualiza a data
    public void setData(int initDia, int initMes, int initAno){
        if(verificaData(initDia, initMes, initAno)){
            this.dia = initDia;
            this.mes = initMes;
            this.ano = initAno;
        }
        else{
            System.out.println("data invalida!");
            System.exit(-1);
        }
    }

    //Retorna o dia
    public int getDia(){
        return this.dia;
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
        System.out.printf(" " + this.dia + "/" + this.mes + " /" + this.ano);
    }

    //Imprime data por extenso
    public void mostraDataExtenso(){
        String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.printf(" %d de %s de %d\n", this.dia, m[getMes() - 1], this.ano);
    }
}