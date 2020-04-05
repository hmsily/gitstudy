package testProject;

public class WaterFlower {
	static String s = "qw";
	static  int i=3;
public static void main(String[] args) {
	/*int x,ge,shi,bai;
	for(x=100;x<999;x++) {
		bai=x/100;
		shi=x/10%10;
		ge=x%10;
		if((bai*bai*bai+shi*shi*shi+ge*ge*ge)==x) {
			System.out.println(x);
		}
	}
	String str = "12";
	*/
	//System.out.println(2.0-1.1);
	
	WaterFlower w = new WaterFlower();
	w.updateString(s,i);
	System.out.println(s+"===="+i);
}

public void updateString(String str,int num) {
	str="12";
	i=num;
}
}
