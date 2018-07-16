package janani;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n;
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
for(i=0;i<n;i++){
if(i%4==0){
 System.out.println("leap year");
}
else{
	System.out.println("not leap year");
}
	}

}
}
