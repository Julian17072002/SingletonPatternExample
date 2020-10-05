
public class SingletonMain {

	public static void main(String[] args) {
		 // instantiating Singleton class with variable x 
        Singleton x = Singleton.getInstance(); 
  
        // instantiating Singleton class with variable y 
        Singleton y = Singleton.getInstance(); 
        
        
        System.out.println(x.s);
        System.out.println(y.s);
	}

}
