package musicPlayer;

public class Player {
private soundPlayer playInter;
	
	void play() {
		playInter.Play();
	}
	
	public void setPlayInter(soundPlayer playInter) {
		this.playInter = playInter;
	}

	public Player(soundPlayer playInter) {
		this.playInter = playInter;
	}

	
		
		
	}




