package balldemo.services;

import java.util.*;

import balldemo.models.*;

public interface PlayerService {
	public BaseballPlayer addBallplayer(BaseballPlayer bp);
	public List<BaseballPlayer> findAllPlayers();
	public BaseballPlayer findBallPlayerById(Integer id);
	public List<BaseballPlayer> findBallPlayerByFName(String fn);
	public BaseballPlayer updatePlayerHRById(BaseballPlayer bp);
}
