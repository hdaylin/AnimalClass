
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		
		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly()); 
		
		Fish f = new Fish(); 
		print(f.eat()); 
		print(f.sleep()); 
		
		Unicorn u = new Unicorn(); 
		print(u.eat()); 
		print(u.sleep()); 
		
		Tiger t = new Tiger(); 
		print(t.eat()); 
		print(u.sleep()); 
		
		Dog d = new Dog(); 
		print(d.eat()); 
		print(d.sleep()); 
		

	}
	private static void print(String s){
		System.out.println(s);
	}
}
