package Interface;

public class TestPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Playable p = new BasketBall();
    p.play();
    Playable p1 = new Football();
    p1.play();
    Playable p2 =new Vollyball();
    p2.play();
	}

}
