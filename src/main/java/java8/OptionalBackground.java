package java8;
/*

Case:
In following code Soundcard, USB are optional things in a Computer
We want to know USB version if present in Computer else default value will be taken
So to get USB version we need to make sure that Soundcard is present and if yes, then USB is present and if yes, then get USB version 


#Old Code Style:	
	String version = "UNKNOWN";
	if(computer != null){
	  Soundcard soundcard = computer.getSoundcard();
	  if(soundcard != null){
	    USB usb = soundcard.getUSB();
	    if(usb != null){
	      version = usb.getVersion();
	    }
	  }
	}

	

#New code Style:
	 	
//New code clearly show that Soundcard is an optional field for Computer class it may or may not exisits
	
public class Computer {
	private Optional<Soundcard> soundcard;  
	public Optional<Soundcard> getSoundcard() { ... }
		
}

public class Soundcard {
	private Optional<USB> usb;
	public Optional<USB> getUSB() { ... }
}

public class USB{
	public String getVersion(){ ... }
}
	
	
	
	
##Optional Uses##	

#Here is an empty Optional:
Optional<Soundcard> sc = Optional.empty(); 

#Here is an Optional which can hold only non null values
SoundCard obj = new Soundcard();
Optional<Soundcard> sc = Optional.of(obj);   // will get NPE here if obj is null

#Here is an Optional which can hold null value too
SoundCard obj = new Soundcard();
Optional<Soundcard> sc = Optional.ofNullable(soundcard); // will not get NPE if obj is null and Optional will be empty

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/	

