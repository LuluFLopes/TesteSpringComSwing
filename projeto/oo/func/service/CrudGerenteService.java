package projeto.oo.func.service;

import org.springframework.stereotype.Service;
import projeto.oo.func.model.Gerente;
import projeto.oo.func.repository.GerenteRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CrudGerenteService {

    private GerenteRepository gerenteRepository;

    public CrudGerenteService(GerenteRepository gerenteRepository) {
        this.gerenteRepository = gerenteRepository;
    }

    public void salvar(Gerente g){
        gerenteRepository.save(g);
    }

    public void atualizar(Gerente g) {
        gerenteRepository.save(g);
    }

    public void excluir(Integer id) {
        gerenteRepository.deleteById(id);
    }

    public List<Gerente> listarTudo() {
        List<Gerente> lista = gerenteRepository.findAll();
        return lista;
    }

    public Gerente listarPorId(Integer id) {
        Optional op  = gerenteRepository.findById(id);
        Gerente gerente = (Gerente) op.get();
        return gerente;
    }

}
