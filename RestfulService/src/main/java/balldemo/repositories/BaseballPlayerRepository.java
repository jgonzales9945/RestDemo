package balldemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import balldemo.models.*;

public interface BaseballPlayerRepository extends JpaRepository<BaseballPlayer, Integer>{
//	public BaseballPlayer findPlayerById(Integer a0);
//	public List<BaseballPlayer> findPlayerByHomeruns(Integer a0);
//	public List<BaseballPlayer> findPlayerByStrikeOuts(Integer a0);
//	public BaseballPlayer addBallplayer(BaseballPlayer bp);
//	public List<BaseballPlayer> findBallPlayerByFName(String fname);
//	public BaseballPlayer updatePlayerHRById(BaseballPlayer bp);
}
