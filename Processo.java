public class Processo extends Thread{
    private String nome;
    private int nInteracoes;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnInteracoes() {
        return nInteracoes;
    }
    public void setnInteracoes(int nInteracoes) {
        this.nInteracoes = nInteracoes;
    }
    public Processo(){
    }
    public Processo(String nome, int nInteracoes, int prioridade){
        this.nome=nome;
        this.nInteracoes=nInteracoes;
        setPriority(prioridade);
    }
    public void run(){
        for (int i = 0; i < nInteracoes; i++){
            System.out.println("Processo: ("+nome+ "): "+i);
        try{
            Thread.sleep(i *100);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        } 
    }
}
