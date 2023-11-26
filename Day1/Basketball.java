package Day1;

public class Basketball implements Playable{
	private Player Player;

	public Basketball(Player Player) {
		this.Player=Player;
	}
		public void play() {
			System.out.println("Playing Basketball. ");
			Player.info();
		}

}
