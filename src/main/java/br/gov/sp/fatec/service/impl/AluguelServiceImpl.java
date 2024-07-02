package br.gov.sp.fatec.service.impl;

// Remove the unused import
// import br.gov.sp.fatec.domain.mapper.AluguelMapper;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.request.AluguelUpdateRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
// Remove the unused import
// import br.gov.sp.fatec.repository.AluguelRepository;
import br.gov.sp.fatec.service.AluguelService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AluguelServiceImpl implements AluguelService {

    // Remove the unused field
    // private final AluguelMapper aluguelMapper;

    @Override
    public AluguelResponse save(AluguelRequest aluguelRequest) {
        return null;
    }

    @Override
    public AluguelResponse findById(Long id) {
        return null;
    }

    @Override
    public List<AluguelResponse> findAll() {
        return List.of();
    }

    @Override
    public void updateById(Long id, AluguelUpdateRequest aluguelUpdateRequest) {}

    @Override
    public void deleteById(Long id) {}
}
