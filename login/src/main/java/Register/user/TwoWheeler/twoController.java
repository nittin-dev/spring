package Register.user.TwoWheeler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/two")
public class twoController {
       
	@Autowired
	 TwoRepository tworepo;
	
	@PostMapping("/insert")
    public ResponseEntity<String> saveVehicle(@RequestBody twoEntity vehicle) {
        tworepo.save(vehicle);
        return ResponseEntity.ok("Vehicle data saved successfully");
    }
	@GetMapping("/getByNumber")
    public ResponseEntity<twoEntity> getByVehicleNumber(@RequestParam String number) {
        twoEntity vehicle = tworepo.findByNumber(number);
        if (vehicle != null) {
            return ResponseEntity.ok(vehicle);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
