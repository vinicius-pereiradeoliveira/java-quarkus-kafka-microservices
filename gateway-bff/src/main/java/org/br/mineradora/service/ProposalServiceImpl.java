package org.br.mineradora.service;

import org.br.mineradora.client.ProposalRestClient;
import org.br.mineradora.dto.ProposalDetailsDTO;
import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Traced
public class ProposalServiceImpl implements ProposalService {

    @Inject
    @RestClient
    ProposalRestClient proposalRestClient;

    @Override
    public ProposalDetailsDTO getProposalDetailsById(long proposalId) {
        return proposalRestClient.getProposalDetailsById(proposalId);
    }

    @Override
    public Response createProposal(ProposalDetailsDTO proposalDetails) {
        return proposalRestClient.createProposal(proposalDetails);
    }

    @Override
    public Response removeProposal(long id) {
        return proposalRestClient.removeProposal(id);
    }

}
