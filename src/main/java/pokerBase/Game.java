package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private ArrayList<Player> players = new ArrayList<Player>() ;
	
	public Game()
    {
		GameID = UUID.randomUUID();
        this.GameID = GameID;
    }

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
    public Game AddPlayerToTable( Table a,Player p)
    {
        a.AddPlayerToTable(p);
        
        return this;
    }
	

}
