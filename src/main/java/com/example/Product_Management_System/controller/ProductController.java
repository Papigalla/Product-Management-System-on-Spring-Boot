package com.example.Product_Management_System.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Product_Management_System.entity.Product;
import com.example.Product_Management_System.service.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@PostMapping("/add-product")
	public String addProduct(Product product)
	{
		productService.saveAll(product);
		return"index.jsp";
		
	}
	@GetMapping("/display-product")
	public String displayproduct(Model model)
	{
	List<Product> product=productService.findAll();
	model.addAttribute("product", product);
	  return "displayproducts.jsp";
		
	}
	@GetMapping("/delete-product")
	public String delete(@RequestParam("product_id") int productId)
	{
		productService.deleteById(productId);
		return "redirect:/display-product";
	}
	@GetMapping("/update-product")
	public String update(@RequestParam("product_id") int productId,Model model)
	{
		Product product=productService.updateById(productId);
		model.addAttribute("Product", product);
		return"updateproduct.jsp";
	}
	@PostMapping("/update")
	public String updateAll(@ModelAttribute Product product)
	{
		productService.updateProduct(product);
		return "redirect:/display-product";
	}
	

}
