package GitBranchApp;

public class MainApp {
	public static void main(String[] args) {
		//第一個版本
		System.out.print("1st Version");
		//這是一個新增數學運算的版本
		Math cMath = new Math();
		System.out.println();
		System.out.print(cMath);
	}
}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}