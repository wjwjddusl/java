class Ex2_7 {
	public static void main(String[] args) {
		String name = "Ja" + "va"; //���ڿ��� '���ϱ�' ����
		String str  = name + 8.0; //���ڿ��� ���� ���ϱ�� �پ ����.

		System.out.println(name); //java
		System.out.println(str); //java8.0
		System.out.println(7 + " "); //7
		System.out.println(" " + 7); // 7 ����ǥ�ȿ� ���� �ϸ� ���⵵ ���.
		System.out.println(7 + ""); //7
		System.out.println("" + 7); //7
		System.out.println("" + ""); //
		System.out.println(7 + 7 + ""); //14
		System.out.println("" + 7 + 7); //77  ** �տ� ����ǥ("") �� ������, "" + 7 => "7" 
		//"7" + 7 => "7" + "7" = "77"  , 7 + 7 = 14
	}
}