/**
 * 
 */
package com.nttdata.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.dtos.NttdataCentroEducativoDto;

/**
 * @author DURAN
 *
 */
@Service
public class NttdataCentroEducativoImpl implements NttdataCentroEducativoServiceI{

	@Value("${spring.application.name}")
	private String applicationName;
	@Value("${server.port}")
	private String port;
	
	@Override
	public NttdataCentroEducativoDto getSchoolsInfo() {
		final NttdataCentroEducativoDto resultDto = new NttdataCentroEducativoDto();
		resultDto.setApplicationName(applicationName);
		resultDto.setPort(port);
		return resultDto;
	}
	
}
