public class Lampada{
    private double potenciaW;//
    private String cor = new String();//
    private String fabricante = new String();//
    private double tensao;//
    private double valor;
    private int quantStock;
    private int quantVendida;
    private int quantVendaAnterior;

    //Retorna a potencia
    public double getPotenciaW(){
        return this.potenciaW;
    }

    //Retorna a cor
    public String getCor(){
        return this.cor;
    }

    //Retorna o fabricante
    public String getFabricante(){
        return this.fabricante;
    }

    //Retorna voltagem
    public double getTensao(){
        return this.tensao;
    }

    //Retorna o valor
    public double getValor(){
        return this.valor;
    }

    //Retorna a quantidade em estoque
    public int getQuantStock(){
        return this.quantStock;
    }

    //Retorna quantidade da compra
    public int getQuantVendida(){
        return this.quantVendida;
    }

    //Define a potencia
    public void setPotenciaW(double initPotenciaW){
        if(initPotenciaW < 0){
            System.out.printf("Erro em setPotenciaW, valor recebido é inválido!!\n");
            System.exit(-1);
        }
        this.potenciaW = initPotenciaW;
    }

    //Define a cor
    public void setCor(String initCor){
        this.cor = initCor;
    }

    //Define o fabricante
    public void setFabricante(String initFabricante){
        this.fabricante = initFabricante;
    }

    //Define a voltagem
    public void setTensao(double initTensao){
        if(initTensao < 0){
            System.out.printf("Erro em setTensao, valor recebido é inválido!\n");
            System.exit(-1);
        }
        this.tensao = initTensao;
    }

    //Define o valor
    public void setValor(double initValor){
        if(valor < 0){
            System.out.printf("Erro em setValor, valor recebido é inválido!\n");
            System.exit(-1);
        }
        this.valor = initValor;
    }

    //Define quantidade em estoque
    public void setQuantStock(int initQuantStock){
        if(initQuantStock < 0){
            System.out.printf("Erro em setQuantStock, valor recebido é inválido!\n");
            System.exit(-1);
        }
        this.quantStock = initQuantStock;
    }

    //Define quantidade das compras
    public void setQuantVendida(int initQuantVendida){
        if(initQuantVendida < 1){
            System.out.printf("Erro em setQuantVendida, valor recebido é inválido!\n");
            System.exit(-1);
        }
        this.quantVendida += initQuantVendida;
    }

  //Define quantidade da compra anterior
  public void setQuantVendaAnterior(int quant){
      if(quant<1){
        System.out.printf("Erro em setQuantVendaAnterior, valor recebido é inválido!\n");
            System.exit(-1);
      }
      this.quantVendaAnterior= quant;
  }

    //Faz a venda
    public void vender(int quant){
        setQuantVendida(quant);
        if((this.quantStock - quant)<0){
          System.out.printf("erro em vender, valor recebido é maior que a quantidade em stock!\n");
          System.exit(-1);
        }
        else{
          setQuantVendaAnterior(quant);
          this.quantStock = (this.quantStock - this.quantVendida);
        }
        
    }

    //Imprime as informações da venda
    public void mostraVenda(){
        System.out.println("Venda: ");
        System.out.printf("Fabricante: %s\n", getFabricante());
        System.out.printf("Cor: %s\n", getCor());
        System.out.printf("Potência: %f\n", getPotenciaW());
        System.out.printf("Tensão: %f\n", getTensao());
        System.out.printf("Quantidade: %d\n", getQuantVendida());
        System.out.printf("Valor único: %f\n", getValor());
        System.out.printf("Valor total: R$ %f\n", (getValor() * this.quantVendaAnterior));
    }
    public void mostraValorBruto(){
      System.out.printf("Valor Bruto: R$ %f\n", (getValor() * this.quantVendida));
    }
}
  