
public class OptionalTrailingArguments {
	static void f(int required, String...strings) {
		System.out.println("required: "+required+" ");
		for (String s : strings) {
			System.out.println(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		f(1,"one");
		f(2,"two","three");
		f(0);
	}
}
