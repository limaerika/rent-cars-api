package br.gov.sp.fatec.controller.impl;

import br.gov.sp.fatec.controller.CarroController;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.request.CarroUpdateRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
// No changes needed, removing unused import statement
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarroControllerImpl implements CarroController {

    @Override
    public ResponseEntity<CarroResponse> save(CarroRequest carro) {
        return null;
    }

    @Override
    public ResponseEntity<CarroResponse> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<CarroResponse>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateById(Long id, CarroUpdateRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteById(Long id) {
        return null;
    }
}
