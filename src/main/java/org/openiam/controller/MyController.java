package org.openiam.controller;

import org.openiam.model.Product;
import org.openiam.model.ProductEntity;
import org.openiam.repo.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyController {

    private final static Logger log = LoggerFactory.getLogger(MyController.class);

    private final ProductRepository repository;

    public MyController(ProductRepository repository) {
        this.repository = repository;
    }

    private static Product to(ProductEntity e) {
        Product p = new Product();
        p.setId(e.getId());
        p.setName(e.getName());
        return p;
    }

    @GetMapping("/products")
    public String products(HttpServletRequest request) {
        List<ProductEntity> e = repository.findAll();
        request.setAttribute("models", e.stream().map(MyController::to).collect(Collectors.toList()));
        return "products";
    }

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        return "index";
    }


    @GetMapping("/product/{id}")
    public String get(HttpServletRequest request, @PathVariable("id") String id) {
        ProductEntity e = repository.getById(Integer.parseInt(id));
        request.setAttribute("model", to(e));
        return "product";
    }
}
