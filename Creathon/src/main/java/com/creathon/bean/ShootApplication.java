 
package com.creathon.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author VedvratLodhi
 */
@Entity
@Table(name = "shoot_application")
public class ShootApplication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(targetEntity =ProductionHouse.class)
    @JoinColumn( name = "production_house_id",referencedColumnName ="id")
    private ProductionHouse productionHouse;
    
    @ManyToOne(targetEntity = Films.class)
    @JoinColumn(name = "film_id",referencedColumnName = "id")
    private Films film;
    
    @ManyToOne(targetEntity = Location.class)
    @JoinColumn(name = "location_id", referencedColumnName ="id")
    private Location location;
    
    @Column(name = "no_people_in_cast")
    private String noPeopleInCast;

    @Column(name = "date_of_shooting")
    private String dateOfShooting;
    
    @Column(name = "time_of_shooting")
    private String timeOfShooting;
    
    @Column(name="date_of_submission")
    private Date dateOfSubmission;
   
    @OneToOne(targetEntity = Script.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "script_id", referencedColumnName = "id")
    private Script script;

    @Column(name = "place_of_stay")
    private String placeOfStay;
    
    @Column(name = "period_of_stay")
    private String periodOfStay;
    
    @Column(name = "equipment_to_be_used")
    private String equipmentToBeUsed;
    
    @Column(name = "date_of_release")
    private String dateOfRelease;
    
    @Column(name = "filming_in_any_forest_area")
    private Boolean filmingInAnyForestArea;
    
    @Column(name = "detail_of_forest_area")
    private String detailOfForestArea;

    @Column(name = "filming_in_any_defense_area")
    private String filmingInAnyDefenseArea;

    @Column(name = "detail_of_defense_area")
    private String detailOfDefenseArea;

    @JoinColumn(name = "status", referencedColumnName="id")
    @OneToOne(targetEntity = Status.class)
    private Status status;

    @Column(name = "view_status")
    private String viewStatus;
    
    @OneToOne(targetEntity = Airport.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "aerial_photograph_id", referencedColumnName = "id",nullable =true)
    private Airport aerialPhotography;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy ="shootApplication",cascade= CascadeType.ALL)
    private List<LocationPermission> locationPermissions;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public ProductionHouse getProductionHouse() {
		return productionHouse;
	}

	public void setProductionHouse(ProductionHouse productionHouse) {
		this.productionHouse = productionHouse;
	}

	public Films getFilm() {
		return film;
	}

	public void setFilm(Films film) {
		this.film = film;
	}

	public List<LocationPermission> getLocationPermissions() {
		return locationPermissions;
	}

	public void setLocationPermissions(List<LocationPermission> locationPermissions) {
		this.locationPermissions = locationPermissions;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getNoPeopleInCast() {
		return noPeopleInCast;
	}

	public void setNoPeopleInCast(String noPeopleInCast) {
		this.noPeopleInCast = noPeopleInCast;
	}

	public String getDateOfShooting() {
		return dateOfShooting;
	}

	public void setDateOfShooting(String dateOfShooting) {
		this.dateOfShooting = dateOfShooting;
	}

	public String getTimeOfShooting() {
		return timeOfShooting;
	}

	public void setTimeOfShooting(String timeOfShooting) {
		this.timeOfShooting = timeOfShooting;
	}

	

	public Script getScript() {
		return script;
	}

	public void setScript(Script script) {
		this.script = script;
	}

	public String getPlaceOfStay() {
		return placeOfStay;
	}

	public void setPlaceOfStay(String placeOfStay) {
		this.placeOfStay = placeOfStay;
	}

	public String getPeriodOfStay() {
		return periodOfStay;
	}

	public void setPeriodOfStay(String periodOfStay) {
		this.periodOfStay = periodOfStay;
	}

	public String getEquipmentToBeUsed() {
		return equipmentToBeUsed;
	}

	public void setEquipmentToBeUsed(String equipmentToBeUsed) {
		this.equipmentToBeUsed = equipmentToBeUsed;
	}

	public String getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(String dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public Boolean getFilmingInAnyForestArea() {
		return filmingInAnyForestArea;
	}

	public void setFilmingInAnyForestArea(Boolean filmingInAnyForestArea) {
		this.filmingInAnyForestArea = filmingInAnyForestArea;
	}

	public String getDetailOfForestArea() {
		return detailOfForestArea;
	}

	public void setDetailOfForestArea(String detailOfForestArea) {
		this.detailOfForestArea = detailOfForestArea;
	}

	public String getFilmingInAnyDefenseArea() {
		return filmingInAnyDefenseArea;
	}

	public void setFilmingInAnyDefenseArea(String filmingInAnyDefenseArea) {
		this.filmingInAnyDefenseArea = filmingInAnyDefenseArea;
	}

	public String getDetailOfDefenseArea() {
		return detailOfDefenseArea;
	}

	public void setDetailOfDefenseArea(String detailOfDefenseArea) {
		this.detailOfDefenseArea = detailOfDefenseArea;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getViewStatus() {
		return viewStatus;
	}

	public void setViewStatus(String viewStatus) {
		this.viewStatus = viewStatus;
	}

	public Airport getAerialPhotography() {
		return aerialPhotography;
	}

	public void setAerialPhotography(Airport aerialPhotography) {
		this.aerialPhotography = aerialPhotography;
	}

	public Date getDateOfSubmission() {
		return dateOfSubmission;
	}

	public void setDateOfSubmission(Date dateOfSubmission) {
		this.dateOfSubmission = dateOfSubmission;
	}

	@Override
	public String toString() {
		return "ShootApplication [id=" + id + ", productionHouse=" + productionHouse + ", film=" + film + ", location="
				+ location + ", noPeopleInCast=" + noPeopleInCast + ", dateOfShooting=" + dateOfShooting
				+ ", timeOfShooting=" + timeOfShooting + ", dateOfSubmission=" + dateOfSubmission + ", script=" + script
				+ ", placeOfStay=" + placeOfStay + ", periodOfStay=" + periodOfStay + ", equipmentToBeUsed="
				+ equipmentToBeUsed + ", dateOfRelease=" + dateOfRelease + ", filmingInAnyForestArea="
				+ filmingInAnyForestArea + ", detailOfForestArea=" + detailOfForestArea + ", filmingInAnyDefenseArea="
				+ filmingInAnyDefenseArea + ", detailOfDefenseArea=" + detailOfDefenseArea + ", status=" + status
				+ ", viewStatus=" + viewStatus + ", aerialPhotography=" + aerialPhotography + ", locationPermissions="
				+ locationPermissions + "]";
	}

	
    
    
   

  
    
}
