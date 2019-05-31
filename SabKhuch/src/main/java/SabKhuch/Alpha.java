package SabKhuch;
import javax.persistence.*;

@Entity
@Table(name="alpha")
public class Alpha {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer AlphaId;
	
	@Column(name="NAME")
	private String AplhaName;

	public Integer getAlphaId() {
		return AlphaId;
	}

	public void setAlphaId(Integer alphaId) {
		AlphaId = alphaId;
	}

	public String getAplhaName() {
		return AplhaName;
	}

	public void setAplhaName(String aplhaName) {
		AplhaName = aplhaName;
	}
	
}
