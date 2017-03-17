package com.tresb.webservice;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author weslei.dias
 */
public interface FuncionarioRepository extends 
	PagingAndSortingRepository<Funcionario, Long> 
{

}
