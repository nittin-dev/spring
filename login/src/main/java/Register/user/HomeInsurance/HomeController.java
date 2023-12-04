package Register.user.HomeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {
       
	@Autowired
	HomeRepository homerepo;

	@PostMapping("/insert")
    public ResponseEntity<String> saveVehicle(@RequestBody HomeEntity home) {
        homerepo.save(home);
        return ResponseEntity.ok("Home data saved successfully");
    }
}
