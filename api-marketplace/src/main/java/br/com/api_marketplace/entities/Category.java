package br.com.api_marketplace.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cate;
    @NotBlank
    private String name_cate;
    @OneToMany(mappedBy = "category")
    private Set<Product> products = new HashSet<>();

    public Category(){}

    public Category(Long id_cate, String name_cate) {
        this.id_cate = id_cate;
        this.name_cate = name_cate;
    }

    public Long getId_cate() {
        return id_cate;
    }

    public void setId_cate(Long id_cate) {
        this.id_cate = id_cate;
    }

    public @NotBlank String getName_cate() {
        return name_cate;
    }

    public void setName_cate(@NotBlank String name_cate) {
        this.name_cate = name_cate;
    }

    public Set<Product> getProducts() {
        return products;
    }

}
