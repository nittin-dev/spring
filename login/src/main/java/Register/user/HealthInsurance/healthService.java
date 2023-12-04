package Register.user.HealthInsurance;

import org.springframework.beans.factory.annotation.Autowired;


public class healthService {
  
	@Autowired
	healthRepository healthrepo;
	
	public healthEntity registerHealth(healthEntity health) {
		return healthrepo.save(health);
	}
	
}
