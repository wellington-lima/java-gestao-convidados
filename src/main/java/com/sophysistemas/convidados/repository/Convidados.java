package com.sophysistemas.convidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sophysistemas.convidados.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
