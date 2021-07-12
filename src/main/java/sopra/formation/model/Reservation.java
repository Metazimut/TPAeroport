package sopra.formation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	public Reservation() {
		super();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public void prixTotal() {
	}
	
	@Override
	public String toString() {
		return "Reservation [numero=" + numero + ", dtReservtion=" + dtReservtion + ", statutReservation="
				+ statutReservation + "]";
	}
	
}
