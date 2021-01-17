package tn.rnu.isi.eshop.domain;

 import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Client
 */
@Entity
@Table(name = "CLIENT")
public class Client implements java.io.Serializable {

	private Long  idClient;
	private String loginClient;
	private String motPasseClient;
	private String nomClient;
	private String prenomClient;
	private String civiliteClient;
	private String dateNaissanceClient;
	private String numeroAdrClient;
	private String rueAdrClient;
	private String communeAdrClient;
	private String villeAdrClient;
	private String cpAdrClient;
	private String telClient;
	private String faxClient;
	private String gsmClient;
	private String emailClient;
	 @JsonIgnore
	private Set<Commande> commandes = new HashSet<Commande>(0);

	public Client() {
	}

	public Client(Long  idClient) {
		this.idClient = idClient;
	}

	public Client(Long  idClient, String loginClient, String motPasseClient, String nomClient, String prenomClient,
			String civiliteClient, String dateNaissanceClient, String numeroAdrClient, String rueAdrClient,
			String communeAdrClient, String villeAdrClient, String cpAdrClient, String telClient, String faxClient,
			String gsmClient, String emailClient, Set<Commande> commandes) {
		this.idClient = idClient;
		this.loginClient = loginClient;
		this.motPasseClient = motPasseClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.civiliteClient = civiliteClient;
		this.dateNaissanceClient = dateNaissanceClient;
		this.numeroAdrClient = numeroAdrClient;
		this.rueAdrClient = rueAdrClient;
		this.communeAdrClient = communeAdrClient;
		this.villeAdrClient = villeAdrClient;
		this.cpAdrClient = cpAdrClient;
		this.telClient = telClient;
		this.faxClient = faxClient;
		this.gsmClient = gsmClient;
		this.emailClient = emailClient;
		this.commandes = commandes;
	}

	@Id

	@Column(name = "ID_CLIENT", unique = true, nullable = false, scale = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CLIENT_gen_seq")
    @SequenceGenerator(name="CLIENT_gen_seq", sequenceName="CLIENT_SEQ", allocationSize=1)

	public Long  getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Long  idClient) {
		this.idClient = idClient;
	}

	@Column(name = "LOGIN_CLIENT", length = 20)
	public String getLoginClient() {
		return this.loginClient;
	}

	public void setLoginClient(String loginClient) {
		this.loginClient = loginClient;
	}

	@Column(name = "MOT_PASSE_CLIENT", length = 20)
	public String getMotPasseClient() {
		return this.motPasseClient;
	}

	public void setMotPasseClient(String motPasseClient) {
		this.motPasseClient = motPasseClient;
	}

	@Column(name = "NOM_CLIENT", length = 70)
	public String getNomClient() {
		return this.nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	@Column(name = "PRENOM_CLIENT", length = 70)
	public String getPrenomClient() {
		return this.prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	@Column(name = "CIVILITE_CLIENT", length = 7)
	public String getCiviliteClient() {
		return this.civiliteClient;
	}

	public void setCiviliteClient(String civiliteClient) {
		this.civiliteClient = civiliteClient;
	}

	@Column(name = "DATE_NAISSANCE_CLIENT", length = 20)
	public String getDateNaissanceClient() {
		return this.dateNaissanceClient;
	}

	public void setDateNaissanceClient(String dateNaissanceClient) {
		this.dateNaissanceClient = dateNaissanceClient;
	}

	@Column(name = "NUMERO_ADR_CLIENT", length = 5)
	public String getNumeroAdrClient() {
		return this.numeroAdrClient;
	}

	public void setNumeroAdrClient(String numeroAdrClient) {
		this.numeroAdrClient = numeroAdrClient;
	}

	@Column(name = "RUE_ADR_CLIENT", length = 100)
	public String getRueAdrClient() {
		return this.rueAdrClient;
	}

	public void setRueAdrClient(String rueAdrClient) {
		this.rueAdrClient = rueAdrClient;
	}

	@Column(name = "COMMUNE_ADR_CLIENT", length = 50)
	public String getCommuneAdrClient() {
		return this.communeAdrClient;
	}

	public void setCommuneAdrClient(String communeAdrClient) {
		this.communeAdrClient = communeAdrClient;
	}

	@Column(name = "VILLE_ADR_CLIENT", length = 50)
	public String getVilleAdrClient() {
		return this.villeAdrClient;
	}

	public void setVilleAdrClient(String villeAdrClient) {
		this.villeAdrClient = villeAdrClient;
	}

	@Column(name = "CP_ADR_CLIENT", length = 10)
	public String getCpAdrClient() {
		return this.cpAdrClient;
	}

	public void setCpAdrClient(String cpAdrClient) {
		this.cpAdrClient = cpAdrClient;
	}

	@Column(name = "TEL_CLIENT", length = 20)
	public String getTelClient() {
		return this.telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	@Column(name = "FAX_CLIENT", length = 20)
	public String getFaxClient() {
		return this.faxClient;
	}

	public void setFaxClient(String faxClient) {
		this.faxClient = faxClient;
	}

	@Column(name = "GSM_CLIENT", length = 20)
	public String getGsmClient() {
		return this.gsmClient;
	}

	public void setGsmClient(String gsmClient) {
		this.gsmClient = gsmClient;
	}

	@Column(name = "EMAIL_CLIENT", length = 50)
	public String getEmailClient() {
		return this.emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	public Set<Commande> getCommandes() {
		return this.commandes;
	}
	@JsonIgnore
	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", loginClient=" + loginClient + ", motPasseClient=" + motPasseClient
				+ ", nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", civiliteClient=" + civiliteClient
				+ ", dateNaissanceClient=" + dateNaissanceClient + ", numeroAdrClient=" + numeroAdrClient
				+ ", rueAdrClient=" + rueAdrClient + ", communeAdrClient=" + communeAdrClient + ", villeAdrClient="
				+ villeAdrClient + ", cpAdrClient=" + cpAdrClient + ", telClient=" + telClient + ", faxClient="
				+ faxClient + ", gsmClient=" + gsmClient + ", emailClient=" + emailClient + ", commandes=" + commandes
				+ "]";
	}

}
