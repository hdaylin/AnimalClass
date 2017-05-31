
public class Dog extends Animal{

	public Dog() {
		super (); 
		System.out.println("Now I'm a Dog!!");
	}

	@Override
	public String eat(){

		return "the cat sleeps"; 

	}

	@Override 
	public String sleep(){
		return "the dog is sleep";
	}

}