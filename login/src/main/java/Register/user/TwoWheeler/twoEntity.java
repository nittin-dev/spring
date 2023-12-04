package Register.user.TwoWheeler;


import jakarta.persistence.*;

@Entity
@Table(name="Two_Wheeler")
public class twoEntity {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String number;
	private String Make;
	private String Model;
	private int year;
	private String ExpiryDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		this.Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		this.Model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.ExpiryDate = expiryDate;
	}
	
}
