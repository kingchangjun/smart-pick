package com.example.ttst.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductDto {

    private Long id;
    private String name;
    private String category;
    private double price;
    private double rating;

}
