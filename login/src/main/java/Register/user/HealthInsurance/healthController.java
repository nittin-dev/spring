package Register.user.HealthInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class healthController {

	@Autowired 
	healthRepository healthrepo;
	
	@PostMapping("/insert")
    public ResponseEntity<String> saveVehicle(@RequestBody healthEntity health ) {
        healthrepo.save(health);
        return ResponseEntity.ok("health data saved successfully");
    }
}
