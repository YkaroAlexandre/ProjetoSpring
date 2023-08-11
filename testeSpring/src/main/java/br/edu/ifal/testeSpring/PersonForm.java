package br.edu.ifal.testeSpring;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonForm {

	@NotNull
	@Size(min=2, max=30)
	private String name;
    
	@NotNull
	@Size(min=1,max=31)
    private String dates;
	
	
	@NotNull
	@Size(min=1,max=12)
	private String months;
	
	@NotNull
	private String years;

			
			
	@NotNull
	@Size(min=2, max=30)
	private String nameMun;

	@NotNull
	@Size(min=2, max=30)
	private String nameDad;
	
	@NotNull
	private String email;
	
	@NotNull
	@Size(min=9,max=9)
	private String tel;
	
	@NotNull
	private String ddd;
	
	@NotNull
	private String ramal;

	@NotNull
	private String serie;

	@NotNull
	private String turno;

	private String atvdExCurricular;
	
	
	public String getAtvdExCurricular() {
		return atvdExCurricular;
	}

	public void setAtvdExCurricular(String atvdExCurricular) {
		this.atvdExCurricular = atvdExCurricular;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {

		this.dates = dates;
	}
	public String getMonths() {
		
		return months;
	}
	
	public void setMonths(String months) {
		this.months = months;
	}

	public String getYears() {
		return years;
	}
	
	public void setYears(String years) {
		this.years = years;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNameDad() {
		return nameDad;
	}

	public void setNameDad(String nameDad) {
		this.nameDad = nameDad;
	}

	public String getNameMun() {
		return nameMun;
	}

	public void setNameMun(String nameMun) {
		this.nameMun = nameMun;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
