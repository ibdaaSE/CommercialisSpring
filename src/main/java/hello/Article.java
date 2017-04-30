package hello;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the article database table.
 * 
 */
@Entity
@NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idArticle;

	private byte acommander;

	private String categorie;

	private String codeBarres;

	private String depot;

	private String designation;

	private Boolean expirable;

	private String famille;

	private Boolean inventaire;

	private String marque;

	private String nomtech;

	@Lob
	private byte[] photo;

	private double pmp;

	private double prixachat;

	private double prixpublic;

	private double prixrevendeur;

	private double prixspecial;

	private double qteCarton;

	private double qtemax;

	private double qtemin;

	private double qteprevue;

	private double qtestock;

	private String reference;

	private double tva;

	private String unite;

	private Boolean utilise;

	public Article() {
	}

	public int getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public byte getAcommander() {
		return this.acommander;
	}

	public void setAcommander(byte acommander) {
		this.acommander = acommander;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getCodeBarres() {
		return this.codeBarres;
	}

	public void setCodeBarres(String codeBarres) {
		this.codeBarres = codeBarres;
	}

	public String getDepot() {
		return this.depot;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Boolean getExpirable() {
		return this.expirable;
	}

	public void setExpirable(Boolean expirable) {
		this.expirable = expirable;
	}

	public String getFamille() {
		return this.famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public Boolean getInventaire() {
		return this.inventaire;
	}

	public void setInventaire(Boolean inventaire) {
		this.inventaire = inventaire;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getNomtech() {
		return this.nomtech;
	}

	public void setNomtech(String nomtech) {
		this.nomtech = nomtech;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public double getPmp() {
		return this.pmp;
	}

	public void setPmp(double pmp) {
		this.pmp = pmp;
	}

	public double getPrixachat() {
		return this.prixachat;
	}

	public void setPrixachat(double prixachat) {
		this.prixachat = prixachat;
	}

	public double getPrixpublic() {
		return this.prixpublic;
	}

	public void setPrixpublic(double prixpublic) {
		this.prixpublic = prixpublic;
	}

	public double getPrixrevendeur() {
		return this.prixrevendeur;
	}

	public void setPrixrevendeur(double prixrevendeur) {
		this.prixrevendeur = prixrevendeur;
	}

	public double getPrixspecial() {
		return this.prixspecial;
	}

	public void setPrixspecial(double prixspecial) {
		this.prixspecial = prixspecial;
	}

	public double getQteCarton() {
		return this.qteCarton;
	}

	public void setQteCarton(double qteCarton) {
		this.qteCarton = qteCarton;
	}

	public double getQtemax() {
		return this.qtemax;
	}

	public void setQtemax(double qtemax) {
		this.qtemax = qtemax;
	}

	public double getQtemin() {
		return this.qtemin;
	}

	public void setQtemin(double qtemin) {
		this.qtemin = qtemin;
	}

	public double getQteprevue() {
		return this.qteprevue;
	}

	public void setQteprevue(double qteprevue) {
		this.qteprevue = qteprevue;
	}

	public double getQtestock() {
		return this.qtestock;
	}

	public void setQtestock(double qtestock) {
		this.qtestock = qtestock;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getTva() {
		return this.tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}

	public String getUnite() {
		return this.unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public Boolean getUtilise() {
		return this.utilise;
	}

	public void setUtilise(Boolean utilise) {
		this.utilise = utilise;
	}

}