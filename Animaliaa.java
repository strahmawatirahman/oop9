package pertama;

class Vertebrata<T> {
	private T mamalia;
	public Vertebrata(T mamalia) {
		this.mamalia = mamalia;
	}
	
	public T getNama() {
		return mamalia;
	}
	
	public void setNama(T mamalia) {
		this.mamalia = mamalia;
	}
}

public class Animaliaa {
	public static void main(String[] args) {
		Vertebrata<String> vertebrataName = new Vertebrata<>("Sapi");
		vertebrataName.setNama("Kucing");
		System.out.println(vertebrataName.getNama());
	}
}