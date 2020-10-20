package br.com.dssistemas.vendasonline.controller.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtAuthenticationResponse {
	 private String accessToken;
	 private String tokenType = "Bearer";
	 
	 public JwtAuthenticationResponse(String accessToken) {
	        this.accessToken = accessToken;
	 }
}
