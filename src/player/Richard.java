package player;

public class Richard extends BasePlayer {

	public Richard() {
		super("Richard", 100, 100, 4, 4, 5, 5, 0, 0, 5, 5);
	}
	@Override
	public void useAbility1() {
		actionMade();
	}
	@Override
	public void useAbility2() {
		actionMade();
	}
	@Override
	public void useAbility3() {
		actionMade();
		}
	@Override
	public void useAbility4() {
		actionMade();
	}

}
