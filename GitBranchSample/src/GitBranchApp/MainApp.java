package GitBranchApp;

public class MainApp {
	public static void main(String[] args) {
		//�Ĥ@�Ӫ���
		System.out.print("1st Version");
		//�o�O�@�ӷs�W�ƾǹB�⪺����
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