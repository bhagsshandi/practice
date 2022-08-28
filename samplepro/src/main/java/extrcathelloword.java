

public class extrcathelloword {

	public static void main(String[] args) {
		String str="mdnfjnhedsdsllodsd";
		
		String[] sp=str.split("mdnfjnhedsdsllodsd");
		
		for(int i=1;i< sp.length;i=i+2) {
			System.out.print(sp[i]);
		}
		

	}

}
