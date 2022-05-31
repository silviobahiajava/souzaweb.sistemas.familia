package br.com.souaweb.sistemas.familia;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/familia")
public class FamiliaController {
	String rota="http://localhost:8080/familia/principal";
	String paginaIndex="index";
	String paginaPrincipal="familia";

	//  http://localhost:8080/familia/index
	@GetMapping("/index")
	public String paginaPrincipal() {
		return paginaIndex;
	}
	
	@GetMapping("/listagem")
	// http://localhost:8080/familia/listagem?marca=continental
	//recebendo parametros da url com @RequestParam
	public String  listagem(@RequestParam(name="marca") String marca) {
		
		System.out.println("marca do produto "+marca);
		return paginaPrincipal;
		
	}
}
