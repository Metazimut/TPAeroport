package sopra.formation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero;
	@Version
	private int version;
	@Column(name = "dtReservtion")
	@Temporal(TemporalType.DATE)
	private Date dtReservtion;
	@Column(name = "statutReservation")
	@Enumerated(EnumType.STRING)
	private StatutReservation statutReservation;
	@OneToOne
	@JoinColumn(name = "passager_id")
	private Passager passager;
	@OneToMany(mappedBy = "reservation")
	private List<Billet> billetsReservation = new ArrayList<Billet>();
	
	public Reservation() {
		super();
	}
	
	
	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public Date getDtReservtion() {
		return dtReservtion;
	}


	public void setDtReservtion(Date dtReservtion) {
		this.dtReservtion = dtReservtion;
	}


	public StatutReservation getStatutReservation() {
		return statutReservation;
	}


	public void setStatutReservation(StatutReservation statutReservation) {
		this.statutReservation = statutReservation;
	}


	public Passager getPassager() {
		return passager;
	}


	public void setPassager(Passager passager) {
		this.passager = passager;
	}


	public List<Billet> getBilletsReservation() {
		return billetsReservation;
	}


	public void setBilletsReservation(List<Billet> billetsReservation) {
		this.billetsReservation = billetsReservation;
	}


	@Override
	public String toString() {
		return "Reservation [numero=" + numero + ", version=" + version + ", dtReservtion=" + dtReservtion
				+ ", statutReservation=" + statutReservation + ", passager=" + passager + ", billetsReservation="
				+ billetsReservation + "]";
	}
	
}
