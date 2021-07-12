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

@Entity
@Table(name = "vol")
public class Vol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "dtDepart")
	@Temporal(TemporalType.DATE)
	private Date dtDepart;
	@Column(name = "dtArrivee")
	@Temporal(TemporalType.DATE)
	private Date dtArrivee;
	@Column(name = "statut")
	@Enumerated(EnumType.STRING)
	private StatutVol statut;
	@Column(name = "nbPlaceDispo")
	private int nbPlaceDispo;
	
	public Vol() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtDepart() {
		return dtDepart;
	}

	public void setDtDepart(Date dtDepart) {
		this.dtDepart = dtDepart;
	}

	public Date getDtArrivee() {
		return dtArrivee;
	}

	public void setDtArrivee(Date dtArrivee) {
		this.dtArrivee = dtArrivee;
	}

	public StatutVol getStatut() {
		return statut;
	}

	public void setStatut(StatutVol statut) {
		this.statut = statut;
	}

	public int getNbPlaceDispo() {
		return nbPlaceDispo;
	}

	public void setNbPlaceDispo(int nbPlaceDispo) {
		this.nbPlaceDispo = nbPlaceDispo;
	}

	@Override
	public String toString() {
		return "Vol [id=" + id + ", dtDepart=" + dtDepart + ", dtArrivee=" + dtArrivee + ", statut=" + statut
				+ ", nbPlaceDispo=" + nbPlaceDispo + "]";
	}
	
}
