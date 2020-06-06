package com.Interface.pro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Interface.pro.entity.Laptop;
import com.Interface.pro.entity.Server;
import com.Interface.pro.repository.LaptopRepository;
import com.Interface.pro.repository.ServerRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	LaptopRepository laptopRepository;
	@Autowired
	ServerRepository serverRepository;

	@Override
	public List<Laptop> getLaptops() {
		return laptopRepository.findAll();
	}

	@Override
	public List<Server> getServers() {
		return serverRepository.findAll();
	}

	@Override
	public Optional<Laptop> getLaptop(int id) {
		return laptopRepository.findById(id);
	}

	@Override
	public Optional<Server> getServer(int id) {
		return serverRepository.findById(id);
	}

	@Override
	public boolean setLaptopRepository(Laptop laptop) {
		Optional<Laptop> optionalLaptop = Optional.ofNullable(laptopRepository.save(laptop));
		if (optionalLaptop.isPresent()) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean setServerRepository(Server server) {
		Optional<Server> optionalServer = Optional.ofNullable(serverRepository.save(server));
		if (optionalServer.isPresent()) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean deleteLaptops() {
		try {
			laptopRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean deleteServers() {
		try {
			serverRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public boolean deleteLaptop(int id) {

		try {
			laptopRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean deleteServer(int id) {
		try {
			serverRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public List<Laptop> getLaptopsByNameLike(String name) {
		return laptopRepository.searchAllByNameLike(name);
	}
}
