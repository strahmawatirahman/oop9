package lima;

public class MainAnimalia {
    public void cekAnimalia (Animalia Hidup){
        Hidup.ciri();
    }
    
    public static void main(String[] args) {
        MainAnimalia pMain = new MainAnimalia();        
        pMain.cekAnimalia(new Invertebrata("Mollusca"));       
        System.out.println("-----------------------------------------");                              
        pMain.cekAnimalia(new Vertebrata ("Pisces","Aves"));
    }
}
