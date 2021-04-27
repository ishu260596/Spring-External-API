package com.example.external.model;

import javax.annotation.Generated;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class AfghanistanDTO implements Serializable {


	private String name;


	private String iso3166a2;


	private String iso3166a3;


	private String iso3166numeric;


	private int totalCases;


	private int activeCases;


	private int deaths;


	private int recovered;


	private int critical;


	private int tested;


	private Object deathRatio;


	private Object recoveryRatio;


	private ChangeDTO change;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIso3166a2(String iso3166a2){
		this.iso3166a2 = iso3166a2;
	}

	public String getIso3166a2(){
		return iso3166a2;
	}

	public void setIso3166a3(String iso3166a3){
		this.iso3166a3 = iso3166a3;
	}

	public String getIso3166a3(){
		return iso3166a3;
	}

	public void setIso3166numeric(String iso3166numeric){
		this.iso3166numeric = iso3166numeric;
	}

	public String getIso3166numeric(){
		return iso3166numeric;
	}

	public void setTotalCases(int totalCases){
		this.totalCases = totalCases;
	}

	public int getTotalCases(){
		return totalCases;
	}

	public void setActiveCases(int activeCases){
		this.activeCases = activeCases;
	}

	public int getActiveCases(){
		return activeCases;
	}

	public void setDeaths(int deaths){
		this.deaths = deaths;
	}

	public int getDeaths(){
		return deaths;
	}

	public void setRecovered(int recovered){
		this.recovered = recovered;
	}

	public int getRecovered(){
		return recovered;
	}

	public void setCritical(int critical){
		this.critical = critical;
	}

	public int getCritical(){
		return critical;
	}

	public void setTested(int tested){
		this.tested = tested;
	}

	public int getTested(){
		return tested;
	}

	public void setDeathRatio(Object deathRatio){
		this.deathRatio = deathRatio;
	}

	public Object getDeathRatio(){
		return deathRatio;
	}

	public void setRecoveryRatio(Object recoveryRatio){
		this.recoveryRatio = recoveryRatio;
	}

	public Object getRecoveryRatio(){
		return recoveryRatio;
	}

	public void setChange(ChangeDTO change){
		this.change = change;
	}

	public ChangeDTO getChange(){
		return change;
	}

	@Override
 	public String toString(){
		return 
			"AfghanistanDTO{" + 
			"name = '" + name + '\'' + 
			",iso3166a2 = '" + iso3166a2 + '\'' + 
			",iso3166a3 = '" + iso3166a3 + '\'' + 
			",iso3166numeric = '" + iso3166numeric + '\'' + 
			",total_cases = '" + totalCases + '\'' + 
			",active_cases = '" + activeCases + '\'' + 
			",deaths = '" + deaths + '\'' + 
			",recovered = '" + recovered + '\'' + 
			",critical = '" + critical + '\'' + 
			",tested = '" + tested + '\'' + 
			",death_ratio = '" + deathRatio + '\'' + 
			",recovery_ratio = '" + recoveryRatio + '\'' + 
			",change = '" + change + '\'' + 
			"}";
		}
}