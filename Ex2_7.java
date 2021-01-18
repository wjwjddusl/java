class Ex2_7 {
	public static void main(String[] args) {
		String name = "Ja" + "va"; //문자열도 '더하기' 가능
		String str  = name + 8.0; //문자열과 숫자 더하기는 붙어서 나옴.

		System.out.println(name); //java
		System.out.println(str); //java8.0
		System.out.println(7 + " "); //7
		System.out.println(" " + 7); // 7 따옴표안에 띄어쓰기 하면 띄어쓰기도 출력.
		System.out.println(7 + ""); //7
		System.out.println("" + 7); //7
		System.out.println("" + ""); //
		System.out.println(7 + 7 + ""); //14
		System.out.println("" + 7 + 7); //77  ** 앞에 따옴표("") 가 있으면, "" + 7 => "7" 
		//"7" + 7 => "7" + "7" = "77"  , 7 + 7 = 14
	}
}