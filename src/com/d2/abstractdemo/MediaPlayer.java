package com.d2.abstractdemo;

abstract class MediaPlayer {
	public void playAudio() 
	{
		System.out.println("Can Play Audio");
	}
	abstract public void playVideo();

}
class SoundRecording extends MediaPlayer
{
	public void playVideo() {
		System.out.println("Can not play Video");
	}
}
class VlcPlayer extends MediaPlayer
{
	public void playVideo() {
		System.out.println("Can Play Video");
	}
}
