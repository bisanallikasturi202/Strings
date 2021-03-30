package com.string;

public class StringMethods {
//CharAt()	
	/*
	 * public static void main(String[] args) { //StringMethods s1 = new
	 * StringMethods(); String s="Kasturi"; char ch=s.charAt(4);
	 * System.out.println(ch); }
	 */
//CompareTo()
	/*
	 * public static void main(String[] args) { String s1= "Kastrui"; String s2
	 * ="Kassu"; String s3 = "kasturi1"; String s4 = "Kasturi2";
	 * System.out.println(s1.compareTo(s4)); System.out.println(s2.compareTo(s2)); }
	 */
//Concat()
	/*
	 * public static void main(String[] args) { String s= "Kasturi"; s.concat(s);
	 * System.out.println(s); s=s.concat("jhvhvihefoe"); System.out.println(s); }
	 */
//Contains()
	/*
	 * public static void main(String[] args) { String s=
	 * "Kasturi Annappa Bisanalli"; System.out.println(s.contains("Annappa"));
	 * System.out.println(s.contains("Appu"));
	 * System.out.println(s.contains("Kasturi"));
	 * 
	 * }
	 */
//Length()
	/*
	 * public static void main(String[] args) { String s= "Kasturi Bisanalli";
	 * if(s.length()>0) { System.out.println("String  length is---" +s.length()); }
	 * String s1=""; if(s1.length()==0) { System.out.println("String length is---"
	 * +s1.length()); } }
	 */
//GetChar
	/*
	 * public static void main(String args[]){ String str = new
	 * String("hello javatpoint how r u"); char[] ch = new char[10]; try{
	 * str.getChars(9, 14, ch, 0); System.out.println(ch); }catch(Exception
	 * ex){System.out.println(ex);} }
	 */

//ReplaceString()
	/*
	 * public static void main(String[] args) { String s= "Kasturi bisanalli";
	 * String replaceString = s.replace('K','m'); System.out.println(replaceString);
	 * }
	 * 
	 * public static void main(String args[]){ String
	 * s1="javatpoint is a very good website"; String
	 * replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
	 * System.out.println(replaceString); }
	 * 
	 * 
	 */
	/*
	 * //Uppercase() public static void main(String[] args) { String s=
	 * "kasturi manjunath yavagal"; String upper = s.toUpperCase();
	 * System.out.println(upper); }
	 */
	
	//Lowercase()
		public static void main(String[] args) {
			String s= "KASTURI MANJUNATH YAVAGAL";
			String lower = s.toLowerCase();
			System.out.println(lower);
		}
}
