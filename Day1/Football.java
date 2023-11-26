package Day1;

public class Football implements Playable{
private Player Player;

public Football(Player Player) {
	this.Player=Player;
}
	public void play() {
		System.out.println("Playing Basketball. ");
		Player.info();
	}

}
