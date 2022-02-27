package com.nttdata.bootcamp.project1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.project1.model.AccountClient;
import com.nttdata.bootcamp.project1.repository.IAccountClientRepository;
import com.nttdata.bootcamp.project1.service.IAccountClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountClientServiceImpl implements IAccountClientService{

	@Autowired
	IAccountClientRepository iAccountClientRepository;
	
	@Override
	public void save(AccountClient e) {
		iAccountClientRepository.save(e).subscribe();
	}

	@Override
	public Mono<AccountClient> findById(Integer id) {
		return iAccountClientRepository.findById(id);
	}

	@Override
	public Flux<AccountClient> findAll() {
		return iAccountClientRepository.findAll();
	}

	@Override
	public Mono<AccountClient> update(AccountClient e) {
		return iAccountClientRepository.save(e);
	}

	@Override
	public Mono<Void> delete(Integer id) {
		return iAccountClientRepository.deleteById(id);
	}


}
