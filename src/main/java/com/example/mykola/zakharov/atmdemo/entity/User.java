package com.example.mykola.zakharov.atmdemo.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name="users")
@Data
@EqualsAndHashCode
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=16, max=16, message = "Card number should be of size 16")
    @NotBlank(message = "Card number is mandatory")
    @Column(name="cart_number", nullable = false)
    private Integer cartNumber;

    @Size(min=4, max=4, message = "Card number should be of size 4")
    @NotBlank(message = "PIN is mandatory")
    @Column(name = "pin", nullable = false)
    private Integer pin;

    @Column(name = "balance", nullable = false, columnDefinition="DECIMAL(10,2)")
    private BigDecimal balance;

    @Column(name = "deposit", nullable = false, columnDefinition="DECIMAL(10,2)")
    private BigDecimal deposit;

}
