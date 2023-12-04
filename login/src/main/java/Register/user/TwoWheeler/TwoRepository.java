package Register.user.TwoWheeler;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TwoRepository extends JpaRepository<twoEntity, Long> {
     twoEntity findByNumber(String number);
}
