package Register.user.TwoWheeler;

import org.springframework.beans.factory.annotation.Autowired;

public class TwoService {

	@Autowired
	TwoRepository tworepo;
	
	public twoEntity registertwo(twoEntity two) {
		return tworepo.save(two);
	}
	
	
}
