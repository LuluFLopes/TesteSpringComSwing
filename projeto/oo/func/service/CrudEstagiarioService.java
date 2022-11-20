package projeto.oo.func.service;

import org.springframework.stereotype.Service;
import projeto.oo.func.model.Estagiario;
import projeto.oo.func.repository.EstagiarioRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CrudEstagiarioService {

    private EstagiarioRepository estagiarioRepository;

    public CrudEstagiarioService(EstagiarioRepository estagiarioRepository) {
        this.estagiarioRepository = estagiarioRepository;
    }

    public void salvar(Estagiario e){
        estagiarioRepository.save(e);
    }

    public void atualizar(Estagiario e) {
        estagiarioRepository.save(e);
    }

    public void excluir(Integer id) {
        estagiarioRepository.deleteById(id);
    }

    public List<Estagiario> listarTudo() {
        List<Estagiario> lista = estagiarioRepository.findAll();
        return lista;
    }

    public Estagiario listarPorId(Integer id) {
        Optional op  = estagiarioRepository.findById(id);
        Estagiario estagiario = (Estagiario) op.get();
        return estagiario;
    }

}
