package projeto.oo.func.service;

import org.springframework.stereotype.Service;
import projeto.oo.func.model.Desenvolvedor;
import projeto.oo.func.repository.DesenvolvedorRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CrudDesenvolvedorService {

    private DesenvolvedorRepository desenvolvedorRepository;

    public CrudDesenvolvedorService(DesenvolvedorRepository desenvolvedorRepository) {
        this.desenvolvedorRepository = desenvolvedorRepository;
    }

    public void salvar(Desenvolvedor d) {
        desenvolvedorRepository.save(d);
    }

    public void atualizar(Desenvolvedor d) {
        desenvolvedorRepository.save(d);
    }

    public void excluir(Integer id) {
        desenvolvedorRepository.deleteById(id);
    }

    public List<Desenvolvedor> listarTudo() {
        List<Desenvolvedor> lista = desenvolvedorRepository.findAll();
        return lista;
    }

    public Desenvolvedor listarPorId(Integer id) {
        Optional op = desenvolvedorRepository.findById(id);
        Desenvolvedor desenvolvedor = (Desenvolvedor) op.get();
        return desenvolvedor;
    }


}
