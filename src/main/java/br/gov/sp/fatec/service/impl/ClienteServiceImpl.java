package br.gov.sp.fatec.service.impl;


import br.gov.sp.fatec.domain.request.ClienteRequest;
import br.gov.sp.fatec.domain.request.ClienteUpdateRequest;
import br.gov.sp.fatec.domain.response.ClienteResponse;
// No changes needed, removing unused import statement
import br.gov.sp.fatec.service.ClienteService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    @Override
    public ClienteResponse save(ClienteRequest clienteRequest) {
        return null;
    }

    @Override
    public ClienteResponse findById(Long id) {
        return null;
    }

    @Override
    public List<ClienteResponse> findAll() {
        return List.of();
    }

    @Override
    public void updateById(Long id, ClienteUpdateRequest clienteUpdateRequest) {}

    @Override
    public void deleteById(Long id) {}
}
