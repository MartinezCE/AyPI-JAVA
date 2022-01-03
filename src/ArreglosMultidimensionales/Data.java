package ArreglosMultidimensionales;
public class Data {

	private String data;

	public Data(String s){

		data = s;
	}

	public String getData(){

		return data;
	}
	public void printData() {
		Printer p = new Printer();
		p.print (this);
	}

}
