package com.Interface.pro.service;

import java.util.List;
import java.util.Optional;

import com.Interface.pro.entity.Laptop;
import com.Interface.pro.entity.Server;

public interface ProductService {

	public List<Laptop> getLaptops();

	public List<Server> getServers();

	public Optional<Laptop> getLaptop(int id);

	public Optional<Server> getServer(int id);

	public boolean setLaptopRepository(Laptop laptop);

	public boolean setServerRepository(Server server);

	public boolean deleteLaptops();

	public boolean deleteServers();

	public boolean deleteLaptop(int id);

	public boolean deleteServer(int id);

	public List<Laptop> getLaptopsByNameLike(String name);
}
