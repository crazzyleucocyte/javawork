package musicPlayer;

public class T01_OCP_answer {

	public static void main(String[] args) {

		Player wp = new Player(new WavPlayer()); 
		Player mp = new Player(new Mp4Player()); 
		
		wp.play();
		mp.play();
			
		
	}

}
