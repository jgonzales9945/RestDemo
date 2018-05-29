package balldemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import balldemo.models.BaseballPlayer;
import balldemo.services.PlayerService;

@CrossOrigin
@RestController
@RequestMapping("/ballplayers")
public class BallPlayerController {

		@Autowired
		PlayerService ballPlayerService;
		
		@RequestMapping(value="/new", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public BaseballPlayer addBallplayer(@RequestBody BaseballPlayer bp) {
			return ballPlayerService.addBallplayer(bp);
		}
		
		@RequestMapping(value="/view", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public List<BaseballPlayer> findAllPlayers(){
			return ballPlayerService.findAllPlayers();
		}
		
		@RequestMapping(value="/id/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public BaseballPlayer findBallPlayerById(@PathVariable("id") Integer id){
			
			return ballPlayerService.findBallPlayerById(id);
		}
		
		@RequestMapping(value="/fname/{fname}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public List<BaseballPlayer> findBallPlayerByFName(@PathVariable("fname") String fn){
			
			return ballPlayerService.findBallPlayerByFName(fn);
		}
		
		
		@RequestMapping(value="/updateHR", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public BaseballPlayer updatePlayerHRById(@Valid @RequestBody BaseballPlayer bp){
			
			return ballPlayerService.updatePlayerHRById(bp);
		}
}
