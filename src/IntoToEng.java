import java.util.Scanner;
public class IntoToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    //数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	String[] number = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	    	String[] boss = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
	    	int k=n;
	    	String ans = "";
	    	if(n==0)return "zero";
	    	
	    	if(k>999){
	    			if(k/1000<=10){
	    				ans += number[k/1000]+th(k);
	    			}
	    			else{
	    		    	int forBoss2 = k/1000;
	    		    	int forNumber2 = forBoss2%10;
	    		        if(forNumber2==0) ans += " "+ boss[forBoss2];
	    		        else if(forBoss2>20 && forNumber2!=0) ans += boss[forBoss2/10]+" "+number[forNumber2];
	    		        else ans += " " + number[k/10000];
	    		       ans += " thousand";
	    			}
	    		k=k%1000;
	    		if(k!=0) ans += " ";
	    	}
	    	if(k>99){
	    		ans += number[k/100]+th(k);
	    		k=k%100;
	    		if(k!=0) ans += " ";
	    	}

	    	int forBoss = k/10;
	    	int forNumber = k%10;
	        if(forNumber==0) ans += boss[forBoss];
	        else if(k>=21 && forNumber!=0) ans += boss[forBoss]+" "+number[forNumber];
	        else ans += number[k];

	        
	    	return ans;
	}
	    static String th(int k){
	    	if(k>999){
	    		return " thousand";
	    	}
	    	if(k>99){
	    		return " hundred";
	    	}
	    	return "";
	    }

}