package project.lab;

public class Resource {
	String type;

	public Resource(){
		this.type=this.getClass().getSimpleName();
	}

	public String GetType(){
		return this.type;

	}
}
