package Register.user.HomeInsurance;

import jakarta.persistence.*;

@Entity
@Table(name="home")
public class HomeEntity {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getOccupancyType() {
		return OccupancyType;
	}
	public void setOccupancyType(String occupancyType) {
		OccupancyType = occupancyType;
	}
	public int getCoverage() {
		return Coverage;
	}
	public void setCoverage(int coverage) {
		Coverage = coverage;
	}
	private String Name;
	private int mobileno;
	private String email;
	private String City;
	private String OccupancyType;
	private int Coverage;
}
