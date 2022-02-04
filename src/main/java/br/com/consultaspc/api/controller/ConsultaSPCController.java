package br.com.consultaspc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.consultaspc.api.controller.swagger.ConsultaSPCControllerSwagger;
import br.com.consultaspc.api.dto.output.RespostaOutputDto;
import br.com.consultaspc.api.filter.DefineRiscoFilter;
import br.com.consultaspc.api.service.ConsultaSPCService;


@RestController
@RequestMapping("/consultaspc")
public class ConsultaSPCController implements ConsultaSPCControllerSwagger{
	
	@Autowired
	private ConsultaSPCService service;

	@Override
	@GetMapping("/define-risco")
	public ResponseEntity<RespostaOutputDto> defineRisco(DefineRiscoFilter filter) {
		return ResponseEntity.ok(service.defineRisco(filter));
	}
	
	
	//@Override
	//@GetMapping("/acerta-essencial")
	//public ResponseEntity<Page<DefineRiscoOutputDto>> acertaEssencial(DefineRiscoFilter filter, Pageable pageable) {
		//return ResponseEntity.ok(service.findAll(filter, pageable));
	//}
	
}
