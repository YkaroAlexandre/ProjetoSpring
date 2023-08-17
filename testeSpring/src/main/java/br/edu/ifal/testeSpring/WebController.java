package br.edu.ifal.testeSpring;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebController implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
	}

	@GetMapping("/")
	public String showForm(PersonForm personForm) {
		return "form";
	}

	@PostMapping("/")
	public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "form";
		}

		System.out.printf("Nome: %s%n",personForm.getName());
		System.out.printf("Data de nascimento: %s%n", personForm.getData());
		System.out.printf("Nome da Mãe: %s%n", personForm.getNameMun());
		System.out.printf("Nome do Pai: %s%n", personForm.getNameDad());
		System.out.printf("Telefone: (%s)%s ", personForm.getDdd(),personForm.getTel());
		System.out.printf("Ramal: %s%n",personForm.getRamal());
		System.out.printf("Email: %s%n", personForm.getEmail());
		System.out.printf("Série: %s%n", personForm.getSerie());
		System.out.printf("Turno: %s%n", personForm.getTurno());
		System.out.printf("Atividades Extracurriculares: %s%n", personForm.getAtvdExCurricular());

		return "redirect:/results";
	}
	
}
