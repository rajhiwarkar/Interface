package com.Interface.pro.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Interface.pro.entity.Laptop;
import com.Interface.pro.entity.Server;
import com.Interface.pro.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/laptops/laptop")
	public boolean addLaptop(@RequestBody Laptop laptop) {
		return productService.setLaptopRepository(laptop);

	}

	@PostMapping("/servers/server")
	public boolean addServer(@RequestBody Server server) {
		return productService.setServerRepository(server);

	}

	@PutMapping("/laptops/laptop")
	public boolean putLaptop(@RequestBody Laptop laptop) {
		return productService.setLaptopRepository(laptop);

	}

	@PutMapping("/servers/server")
	public boolean putServer(@RequestBody Server server) {
		throw new IllegalArgumentException();
		// return productService.setServerRepository(server);

	}

	@GetMapping("/laptops")
	public List<Laptop> getLaptops()

	{
		return productService.getLaptops();
	}

	@GetMapping("/servers")
	public List<Server> getServers() {
		return productService.getServers();

	}

	@GetMapping("laptops/laptop/{id}")
	public Optional<Laptop> getLaptop(@PathVariable int id)

	{
		return productService.getLaptop(id);

	}

	@GetMapping("laptops/{name}")
	public List<Laptop> getLaptop(@PathVariable String name)

	{
		return productService.getLaptopsByNameLike(name);

	}

	@GetMapping("servers/server")
	public Optional<Server> getServer(int id) {
		return productService.getServer(id);

	}

	@DeleteMapping("/laptops")
	public boolean deleteLaptops() {
		return productService.deleteLaptops();
	}

	@DeleteMapping("/servers")
	public boolean deleteServers() {
		return productService.deleteServers();
	}

	@DeleteMapping("laptops/laptop/{id}")
	public boolean deleteLaptop(@PathVariable int id) {
		return productService.deleteLaptop(id);

	}

	@DeleteMapping("servers/server")
	public boolean deleteServer(int id) {

		return productService.deleteServer(id);

	}
}
