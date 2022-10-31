
public class Contato{
    //Atributos
    private String nome, email, tel;
    private Data dataNasc= new Data();

    //Metodos
    public void initContato(){
        this.nome = getNome();
        this.email = getEmail();
        this.tel = getTel();
    }
    
    public void setNome(String initNome){
        this.nome = initNome;
    }

    public void setEmail(String initEmail){
        this.email = initEmail;
    }

    public void setTel(String initTel){
        initTel = initTel.replace("(", "");
        initTel = initTel.replace(")", "");
        initTel = initTel.replace("-", "");
        initTel = initTel.replace(" ", "");
        this.tel = initTel;
    }

    public void setDataNasc(int initDia, int initMes, int initAno){
        
        dataNasc.setData(initDia, initMes, initAno);
    
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }
  
    public String getTel(){
        return this.tel;
    }
    public void getDataNasc(){
        getDiaNasc();
        getMesNasc();
        getAnoNasc();
    }
    public int getDiaNasc(){
        return this.dataNasc.getDia();
    }

    public int getMesNasc(){
        return this.dataNasc.getMes();
    }

    public int getAnoNasc(){
        return this.dataNasc.getAno();
    }
    
    
    public void mostraContato(){
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Email: %s\n", getEmail());
        System.out.printf("Telefone: %s\n", getTel());
        System.out.printf("Data de Nascimento: %02d/%02d/%04d\n", getDiaNasc(), getMesNasc(), getAnoNasc());
    }
    
    public int calculaIdade(){
        int year = this.dataNasc.getAno();
        int idade = 2022 - year;
        return idade;
    }
}