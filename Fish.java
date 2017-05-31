
public class Fish extends Animal{

	public Fish() {
		
	super(); 
	System.out.println("Now I'm a Fish!");
		
	}

@Override
public String sleep(){
	return "The fish sleeps!";
} 

@Override
public String eat(){
	
	return " The fish eats"; 
}

}
