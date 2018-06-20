package classes.date;
import java.time.Duration;
import java.time.Instant;

public class TimecCalculation {

	public static void main(String[] args) throws InterruptedException {
		
		//your code
		//Thread.sleep(60002);
		
		
//		System.out.println(timeElapsed.toMinutes());
//		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
//	
		
		boolean flag = true;
		
		
		
		Instant start = Instant.now();
		System.out.println(start);
		int i =0;
		while(flag){
			System.out.print(flag);
			
			i=i+5;
			Thread.sleep(2000);
			System.out.print(i);
			
			Instant end = Instant.now();
			Duration timeElapsed = Duration.between(start, end);
			long milisec = timeElapsed.toMillis();
			System.out.println(">>>"+milisec);
			if(milisec > 20002){ //20 sec
				System.out.println("more than 20 sec");
				flag = false;
			}
			
		}
		
		
		Instant finish = Instant.now();
		Duration timeElapsed = Duration.between(start, finish);
		System.out.println("Finished Time: "+timeElapsed.toMinutes());
	}

}

//300000  = 5 min