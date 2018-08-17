class Person{  
	void message(){System.out.println("welcome");}  
	}  
	  
	class Student16 extends Person{  
	void message(){System.out.println("welcome to java");}  
	  
	void display(){  
	message();
	super.message(); 
	}  
	  
	public static void main(String args[]){  
	Student16 s=new Student16();  
	s.display();  
	}  
	}  