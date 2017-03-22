package com.tresb.webservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author weslei.dias
 */
@RepositoryRestResource
public interface FuncionarioRepository extends 
	PagingAndSortingRepository<Funcionario, Long> 
{

}
