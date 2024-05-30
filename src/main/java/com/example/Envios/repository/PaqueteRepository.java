package com.example.Envios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Envios.entity.ClienteEntity;
import com.example.Envios.entity.PaqueteEntity;

@Repository
public interface PaqueteRepository extends JpaRepository<PaqueteEntity, Long>{

	List<PaqueteEntity> findByCliente(ClienteEntity cliente);
}
