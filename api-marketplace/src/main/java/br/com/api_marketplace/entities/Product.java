package br.com.api_marketplace.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prod;
    @NotBlank
    private String name_prod;
    @DecimalMin(value = "1.0",message = "Please price value require price plus 1.0")
    private BigDecimal price;
    @NotBlank
    private String desc_prod;
    @Range(min = 1,message = "Please price value require quantity plus 1")
    private Integer amount_prod;
    private char gender_prod;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(){}

    public Product(Long id_prod, String name_prod, BigDecimal price, String desc_prod, Integer amount_prod, char gender_prod, Category category) {
        this.id_prod = id_prod;
        this.name_prod = name_prod;
        this.price = price;
        this.desc_prod = desc_prod;
        this.amount_prod = amount_prod;
        this.gender_prod = gender_prod;
        this.category = category;
    }

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }

    public @NotBlank String getName_prod() {
        return name_prod;
    }

    public void setName_prod(@NotBlank String name_prod) {
        this.name_prod = name_prod;
    }

    public @DecimalMin(value = "1.0", message = "Please price value require price plus 1.0") BigDecimal getPrice() {
        return price;
    }

    public void setPrice(@DecimalMin(value = "1.0", message = "Please price value require price plus 1.0") BigDecimal price) {
        this.price = price;
    }

    public @NotBlank String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(@NotBlank String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public @Range(min = 1, message = "Please price value require quantity plus 1") Integer getAmount_prod() {
        return amount_prod;
    }

    public void setAmount_prod(@Range(min = 1, message = "Please price value require quantity plus 1") Integer amount_prod) {
        this.amount_prod = amount_prod;
    }

    public char getGender_prod() {
        return gender_prod;
    }

    public void setGender_prod(char gender_prod) {
        this.gender_prod = gender_prod;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_prod=" + id_prod +
                ", name_prod='" + name_prod + '\'' +
                ", price=" + price +
                ", desc_prod='" + desc_prod + '\'' +
                ", amount_prod=" + amount_prod +
                ", gender_prod=" + gender_prod +
                ", category=" + category +
                '}';
    }
}
