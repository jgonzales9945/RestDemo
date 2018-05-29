package balldemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import balldemo.models.BaseballPlayer;
import balldemo.repositories.BaseballPlayerRepository;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	BaseballPlayerRepository ballPlayerRepo;
	
	public BaseballPlayer addBallplayer(BaseballPlayer bp) {
		
		return ballPlayerRepo.save(bp);
	}

	public List<BaseballPlayer> findAllPlayers() {
		return ballPlayerRepo.findAll();
	}

	public BaseballPlayer findBallPlayerById(Integer id) {
		return ballPlayerRepo.getOne(id);
	}

	public List<BaseballPlayer> findBallPlayerByFName(String fn) {
		// TODO Auto-generated method stub
		
		List<BaseballPlayer> temp = ballPlayerRepo.findAll();
		List<BaseballPlayer> returnTemp = new ArrayList<BaseballPlayer>();
		
		for(BaseballPlayer b: temp) {
			if(b.getFirstName().equals(fn)) {
				returnTemp.add(b);
			}
		}
		
		return returnTemp;
	}

	public BaseballPlayer updatePlayerHRById(BaseballPlayer bp) {
		// TODO Auto-generated method stub
		return ballPlayerRepo.save(bp);
	}

}
