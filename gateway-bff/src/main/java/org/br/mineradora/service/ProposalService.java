package org.br.mineradora.service;

import org.br.mineradora.dto.ProposalDetailsDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@ApplicationScoped
public interface ProposalService {

    ProposalDetailsDTO getProposalDetailsById(@PathParam("id") long proposalId);

    Response createProposal(ProposalDetailsDTO proposalDetails);

    Response removeProposal(long id);

}
