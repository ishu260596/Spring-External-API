package com.example.external.model;

import javax.annotation.Generated;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class SummaryDTO implements Serializable {


	private int totalCases;


	private int activeCases;


	private int deaths;


	private int recovered;


	private int critical;

	private int tested;


	private Object deathRatio;


	private Object recoveryRatio;

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

	@Override
 	public String toString(){
		return 
			"SummaryDTO{" + 
			"total_cases = '" + totalCases + '\'' + 
			",active_cases = '" + activeCases + '\'' + 
			",deaths = '" + deaths + '\'' + 
			",recovered = '" + recovered + '\'' + 
			",critical = '" + critical + '\'' + 
			",tested = '" + tested + '\'' + 
			",death_ratio = '" + deathRatio + '\'' + 
			",recovery_ratio = '" + recoveryRatio + '\'' + 
			"}";
		}
}