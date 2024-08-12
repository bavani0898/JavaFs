package Newpack;

abstract class Animal {

	 abstract void sound();
	}
	 class lion extends Animal 
	 {
		 void sound() 
		 {
			 System.out.println("The lion roars");
		 }
	 }
	 class tiger extends Animal 
	 {
		 void sound() 
		 {
			 System.out.println("The tiger meow");
		 }
	 }
	class aug7
	{
		public static void main(String[] args)
		{
			Animal a=new lion();
			a.sound();
			Animal b=new tiger();
			b.sound();
		}
}
