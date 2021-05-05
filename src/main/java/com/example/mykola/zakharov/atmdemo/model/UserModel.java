package com.example.mykola.zakharov.atmdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@ToString
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;
    private Integer cartNumber;
    private Integer pin;
    private BigDecimal balance;
    private BigDecimal deposit;
}
