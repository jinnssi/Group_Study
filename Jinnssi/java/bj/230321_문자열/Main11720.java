import java.util.Scanner;

public class Main11720 {

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	int num = Integer.parseInt(sc.nextLine());
    	int sum = 0;
    	String str = sc.next();
    	sc.close();
    	
    	for(int i=0; i<num; i++) {
    		sum += str.charAt(i)-'0';
    	}
    	System.out.println(sum);
    }
}