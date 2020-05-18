package lima;

public class Invertebrata extends Animalia {
    private String Mollusca;
    public Invertebrata(String Mollusca){
        this.Mollusca = Mollusca;
    }
    public void ciri (){
        System.out.println("Salah satu filum invertebrata:   "+Mollusca);
    }
}