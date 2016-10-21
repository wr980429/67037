 class Human{
	private String name;	
	private int age;
	private String sex;
	
	public void introduce(){
	System.out.println("l am "+getname()+" l am "+getsex()+" And my age is "+getage());
	}
	public void setname(String n){
		name=n;
	}
	public String getname(){
		return name;
	}
	public void setage(int a){
		age=18;

	}
	public int getage(){
		return age;
	}
	public void setsex(String s){
		sex="man";
	}
	public String getsex(){
		return sex;
	}
}
    
class Test{
	public static void main( String args[]){
		Human h1=new Human();
		h1.setname("王睿");
		h1.setage(1);
		h1.setsex("2");
	    h1.introduce();

	    Human h2=new Human();
		h2.setname("世宁");
		h2.setage(2);
		h2.setsex("3");
	    h2.introduce();

	    Human h3=new Human();
		h3.setname("学长3");
		h3.setage(3);
		h3.setsex("4");
	    h3.introduce();

	    Human h4=new Human();
		h4.setname("学长4");
		h4.setage(4);
		h4.setsex("5");
	    h4.introduce();

	    Human h5=new Human();
		h5.setname("学长5");
		h5.setage(5);
		h5.setsex("6");
	    h5.introduce();

	    Human h6=new Human();
		h6.setname("学长6");
		h6.setage(6);
		h6.setsex("8");
	    h6.introduce();

	}
}