package com.example.external.model;

import javax.annotation.Generated;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataDTO implements Serializable {

	private SummaryDTO summary;

	private ChangeDTO change;

	private int generatedOn;

	private RegionsDTO regions;

	public void setSummary(SummaryDTO summary){
		this.summary = summary;
	}

	public SummaryDTO getSummary(){
		return summary;
	}

	public void setChange(ChangeDTO change){
		this.change = change;
	}

	public ChangeDTO getChange(){
		return change;
	}

	public void setGeneratedOn(int generatedOn){
		this.generatedOn = generatedOn;
	}

	public int getGeneratedOn(){
		return generatedOn;
	}

	public void setRegions(RegionsDTO regions){
		this.regions = regions;
	}

	public RegionsDTO getRegions(){
		return regions;
	}

	@Override
 	public String toString(){
		return 
			"DataDTO{" + 
			"summary = '" + summary + '\'' + 
			",change = '" + change + '\'' + 
			",generated_on = '" + generatedOn + '\'' + 
			",regions = '" + regions + '\'' + 
			"}";
		}
}