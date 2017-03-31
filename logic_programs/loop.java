package logic_programs;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 6;
		for(int i=1;i<=val/2;i++){
			for(int j=1;j<=i;j++){
				for(int k=1;k<=j;k++){
					System.out.println("Hello "+ i +" "+j+" "+k);
				}
			}
		}

		
	}
}
