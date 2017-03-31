package logic_programs;

public class RightAngleTrianglePattern {

	public static void main(String[] args) {
		int len=5;
	
		lable: for(int i=0;i<len;i++){
			//System.out.println("* ");
			for(int j=0;j<len;j++){
				if(j>i)
				{
					System.out.println();
					continue lable;
				}
				else{
				System.out.print("*");
				}
			}
		}

	}

}
