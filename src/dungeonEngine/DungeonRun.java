package dungeonEngine;
import entities.BaseEntity;
import mainEngine.GameApp;
import player.*;
public class DungeonRun {
	
    private GameApp frame;
    private BasePlayer player;
    private enum Phase
    {
    	DECISION,
    	COMBAT,
    	READING	
    }
    Phase currentPhase;
    private BaseEntity[] entities = new BaseEntity[10];
    public DungeonRun(GameApp frame, BasePlayer player)
	{
		this.frame = frame;
		this.player =player;
	}
	public void findCombat()
	{
		if(!player.isReady())
			return;
	}
	public void actionHappening()
	{
		switch(currentPhase)
		{
			case DECISION:
				
				break;
			case COMBAT:

				break;
			case READING:

				break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public GameApp getFrame() {
		return frame;
	}
	public void setFrame(GameApp frame) {
		this.frame = frame;
	}
	public BasePlayer getPlayer() {
		return player;
	}
	public void setPlayer(BasePlayer player) {
		this.player = player;
	}
	
}
