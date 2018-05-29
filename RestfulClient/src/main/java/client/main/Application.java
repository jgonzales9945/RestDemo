package client.main;

import java.util.List;

import org.slf4j.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import client.models.BaseballPlayer;

public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		
		
		String requestURL = "http://inclassrestful-env.3qtcmsmmu2.us-east-2.elasticbeanstalk.com/ballplayers/id/9";
		
		RestTemplate rs = new RestTemplate();
		try {
			BaseballPlayer bp = rs.getForObject(requestURL, BaseballPlayer.class);
			log.info("found player");
			log.info(bp.toString());
		}catch (Exception e) {
			log.error("player was traded and no longer exists, he is dead to us");
		}
		
		
		String postURL = "http://inclassrestful-env.3qtcmsmmu2.us-east-2.elasticbeanstalk.com/ballplayers/view";
		
		BaseballPlayer t0 = new BaseballPlayer(9,"Dennis","The Menace", 0.0, 0, 783);
		
		try {
			ResponseEntity<BaseballPlayer> b = rs.getForEntity(postURL, BaseballPlayer.class);
			log.info("*SIGH* Dennis is in our group");
		}catch (Exception e) {
			log.error("Can't add dennis because he is terrible");
		}
	}

}
