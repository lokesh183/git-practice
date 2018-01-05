package mirrorImage;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class MyMirror {
public static void main(String[] args) {
	String string="abXYZba";
	int len=string.length();
	String fin="";
	String tmp1="";
	String tmp2="";
	
	for (int i = 0; i < len; i++) {
		System.out.println("-------------------");
		tmp1 += string.substring(i, i+1);
		tmp2="";
		System.out.println("tmp1: "+tmp1);
		System.out.println("tmp1 len: "+tmp1.length());
		for (int j = tmp1.length()-1; j >=0; j--) {
			tmp2 +=tmp1.substring(j, j+1);
			System.out.println("tmp2: "+tmp2);
			if (tmp2.equals(string.substring(len-i-1, len))) {
				fin=tmp1;
			}
		}
	}
	
	System.out.println(fin);
}
}
