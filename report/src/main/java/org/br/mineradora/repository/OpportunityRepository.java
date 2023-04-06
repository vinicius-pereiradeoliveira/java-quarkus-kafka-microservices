package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.br.mineradora.entity.OpportunityEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OpportunityRepository implements PanacheRepository<OpportunityEntity> {
}
