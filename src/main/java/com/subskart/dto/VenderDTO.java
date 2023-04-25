package com.subskart.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class VenderDTO {
	private Long venderId;
	private String VenderName;
	private String venderLocation;
}
