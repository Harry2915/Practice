package Practice;



public class Practice {
	public static void main(String[] args) {
try {
	int x=3;
	int y=x/0;
	System.out.println(y);
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("in catch");
}finally {

	System.out.println("in finally" );
}
	}
}
