package com.d2.abstractdemo;

class ImpAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer  sr=new SoundRecording();
		sr.playAudio();
		sr.playVideo();
		
		VlcPlayer vlc=new VlcPlayer();
		vlc.playVideo();
		vlc.playAudio();

	}

}
