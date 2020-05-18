package lima;

public class Vertebrata extends Animalia {
	    private String pisces, aves ;
	    public Vertebrata(String pisces, String aves){
	        this.pisces = pisces;
	        this.aves   = aves;
	    }
	    
	    public void ciri (){
	        System.out.println("Vertebrata yang bernapas dengan insang :  " +pisces);
	        System.out.println("Vertebrata yang mempunyai bulu yang menutupi seluruh badannya    :  " + aves);
	    }    
}
