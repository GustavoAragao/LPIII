
public class Contato{
    //Atributos
    private String nome, email, tel;
    private Data dataNasc;
    //Construtor com sobrecarga
    public Contato(String nome,String email,String tel, int dia, int mes, int ano){
        this.nome = nome;
        this.email = email;
        this.setTel(tel);
        this.dataNasc = new Data(dia,mes,ano);
    }
    public Contato(String nome, String tel){
        this(nome,"sem email",tel,0,0,0);
    }
    public Contato(String tel){
        this("sem nome",tel);
    }
    public Contato(){
        this("00000000000");
    }
  
    //Metodos
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

    public String toString(){
      String str = "Nome: " + getNome() + "\n Email: " + getEmail() + "\nTelefone: "+ getTel();
      str += "\nData de Nascimento: " + getDiaNasc() + "/" + getMesNasc() + "/" + getAnoNasc();
      return str;
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