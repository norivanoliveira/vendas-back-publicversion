package br.com.dssistemas.vendasonline.controller.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DomainNumberKeyResponse {

    private Integer value;
    private String text;

    public DomainNumberKeyResponse() {
        super();
    }
}