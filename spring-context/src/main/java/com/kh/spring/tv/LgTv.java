package com.kh.spring.tv;

public class LgTv implements Tv {

	private RemoteControl remocon;
	
	public LgTv() {
		System.out.println("LgTv객체를 생성합니다.");
	}
	
	// 자바 메소드
//	public LgTv(RemoteControl remocon) {
//		this.remocon = remocon;
//		System.out.println("LgTv객체를 생성합니다 : " + remocon);
//	}
	
	// setter로 사용하기 
	public void setRemocon(RemoteControl remocon) {
		System.out.println("remocon의존을 주입 : " + remocon);
		this.remocon = remocon;
	}
	
	/**
	 * Tv.changeChannel
	 */
	@Override
	public void changeChannel(int no) {
		remocon.changeChannel(no);
	}

	@Override
	public void powerOn() {
		System.out.println("LgTv의 전원을 켰습니다.");

	}

}
