package hello;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clientfournisseur database table.
 * 
 */
@Entity
@NamedQuery(name="Clientfournisseur.findAll", query="SELECT c FROM Clientfournisseur c")
public class Clientfournisseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idClientFournisseur;

	private String adress;

	private String articleimposition;

	private byte bloque;

	private String categorie;

	private String email;

	private String fax;

	private String idfiscale;

	private String nom;

	@Lob
	private byte[] photo;

	private String raisonsocial;

	private String registrecommerce;

	private String remarque;

	private double solde;

	private String telephone;

	public Clientfournisseur() {
	}

	public int getIdClientFournisseur() {
		return this.idClientFournisseur;
	}

	public void setIdClientFournisseur(int idClientFournisseur) {
		this.idClientFournisseur = idClientFournisseur;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getArticleimposition() {
		return this.articleimposition;
	}

	public void setArticleimposition(String articleimposition) {
		this.articleimposition = articleimposition;
	}

	public byte getBloque() {
		return this.bloque;
	}

	public void setBloque(byte bloque) {
		this.bloque = bloque;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getIdfiscale() {
		return this.idfiscale;
	}

	public void setIdfiscale(String idfiscale) {
		this.idfiscale = idfiscale;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getRaisonsocial() {
		return this.raisonsocial;
	}

	public void setRaisonsocial(String raisonsocial) {
		this.raisonsocial = raisonsocial;
	}

	public String getRegistrecommerce() {
		return this.registrecommerce;
	}

	public void setRegistrecommerce(String registrecommerce) {
		this.registrecommerce = registrecommerce;
	}

	public String getRemarque() {
		return this.remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}