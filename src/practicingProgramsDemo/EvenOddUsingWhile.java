package practicingProgramsDemo;

public class EvenOddUsingWhile {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){ 
			if(i%2==0)
			{
				System.out.println("even numbers= "+i);
			}
	        if(i==50){  
	            //breaking the loop  
	            break;  
	        }  
	        System.out.println("odd numbers= "+i);  
	    }  

	}

}
