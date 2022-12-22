/**
 * 
 */
package com.nttdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.dtos.NttdataCentroEducativoDto;
import com.nttdata.services.NttdataCentroEducativoServiceI;

/**
 * @author DURAN
 *
 */
@RestController("/api")
public class NttdataCentroEducativoController {

	@Autowired
	NttdataCentroEducativoServiceI centroEducativoService;

	@GetMapping("/getSchoolsInfo")
	public NttdataCentroEducativoDto sendCentroEducativoDataInfo() {
		return centroEducativoService.getSchoolsInfo();
	}

}
