package Day1;

public class Volleyball implements Playable{

private Player Player;
	public void Vollyball(Player Player) {
		this.Player=Player;
	}
	
	public void play() {
		System.out.println("Playing Football. ");
		Player.info();
	}

	
}
