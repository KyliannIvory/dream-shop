package LearningViaProject.dreamshop.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int inventory;
    private String brand;

    private Category category;
    private List<Image> images;
}
