package com.company.yedam.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV{

	@Autowired 
	@Qualifier("appleSpeaker") //@Component 스피커 두개했을때 둘중에 하나 골라주는것
	Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV powerOn");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV powerDown");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}	
}
