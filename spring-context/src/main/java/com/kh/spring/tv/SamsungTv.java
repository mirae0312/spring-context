package com.kh.spring.tv;

public class SamsungTv implements Tv {

	private RemoteControl remocon;
	
	public SamsungTv() {
		System.out.println("SamsungTv객체를 생성합니다.");
	}

	// 자바 메소드
//	public SamsungTv(RemoteControl remocon) {
//		this.remocon = remocon;
//	}
	public void setRemocon(RemoteControl remocon) {
		System.out.println("remocon 의존을 주입 : " + remocon);
		this.remocon = remocon;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTv의 전원을 켰습니다.");

	}
	
	public void changeChannel(int no) {
		remocon.changeChannel(no);
		
	}

}
