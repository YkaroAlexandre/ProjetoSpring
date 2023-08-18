package br.edu.ifal.testeSpring;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PersonForm {



	
	@NotNull
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate data;
    
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}	
	
	private String atvdExCurricular;
	
	public String getAtvdExCurricular() {

		return atvdExCurricular;
	}
	
	public void setAtvdExCurricular(String atvdExCurricular) {
		this.atvdExCurricular = atvdExCurricular;
	}
	
	@NotNull(message = "Selecione o turno.")
	private String turno;
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	@NotNull
	private String serie;
	
	public String getSerie() {
		return serie;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	
	@NotNull
	@Pattern(regexp = "^[1-9][0-9]$", message = "DDD inválido")
	private String ddd;
	
	public String getDdd() {
		return ddd;
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	@NotNull
	private Integer tel;
	
	public Integer getTel() {
		return tel;
	}
	
	public void setTel(Integer tel) {
		this.tel = tel;
	}

	@NotNull
	private String ramal;
	
	public String getRamal() {
		return ramal;
	}
	
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	@NotNull
	@Email
	@NotBlank
	private String email;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotNull
	@Size(min=2, max=30)
	private String nameDad;
	
	public String getNameDad() {
		return nameDad;
	}
	
	public void setNameDad(String nameDad) {
		this.nameDad = nameDad;
	}
	
	@NotNull
	@Size(min=2, max=30)
	private String nameMun;
	
	public String getNameMun() {
		return nameMun;
	}

	public void setNameMun(String nameMun) {
		this.nameMun = nameMun;
	}
	
	@NotNull
	@Size(min=2, max=30)
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
