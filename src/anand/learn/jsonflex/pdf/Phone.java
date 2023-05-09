package anand.learn.jsonflex.pdf;

public class Phone {
	String name;
	String number ;
	public Phone(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String toString(){
		return name +" : "+number;
	}

}
