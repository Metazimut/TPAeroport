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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "vol")
	private List<Billet> billetsVol = new ArrayList<Billet>();
	@OneToMany(mappedBy = "vol")
	private List<CompagnieAerienneVol> compagnieAerienneVols = new ArrayList<CompagnieAerienneVol>();
	@ManyToOne
	@JoinColumn(name = "aeroportDepart_id")
	private Aeroport aeroportDepart;
	@ManyToOne
	@JoinColumn(name = "aeroportArrivee_id")
	private Aeroport aeroportArrivee;
	
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
	

	public List<Billet> getBilletsVol() {
		return billetsVol;
	}

	public void setBilletsVol(List<Billet> billetsVol) {
		this.billetsVol = billetsVol;
	}
	

	public List<CompagnieAerienneVol> getCompagnieAerienneVols() {
		return compagnieAerienneVols;
	}

	public void setCompagnieAerienneVols(List<CompagnieAerienneVol> compagnieAerienneVols) {
		this.compagnieAerienneVols = compagnieAerienneVols;
	}

	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}

	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	@Override
	public String toString() {
		return "Vol [id=" + id + ", dtDepart=" + dtDepart + ", dtArrivee=" + dtArrivee + ", statut=" + statut
				+ ", nbPlaceDispo=" + nbPlaceDispo + ", billetsVol=" + billetsVol + "]";
	}
	
}
