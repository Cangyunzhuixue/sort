package elemOfopp.day6;


public class TestMain1 {
public static void main(String[] args) {
	Main.main(new String[1000]);
	
}
}
class Main{
	public static void main(String[]  args) {
		for (int i = 0; i < args.length; i++) {
			args[i]="value : "+i;
			System.out.println(args[i]);
		}
	}
}