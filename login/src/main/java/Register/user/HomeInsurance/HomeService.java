package Register.user.HomeInsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HomeService {
     
	@Autowired
	HomeRepository homerepo;
	
	public HomeEntity registertwo(HomeEntity home) {
		return homerepo.save(home);
	}
}
