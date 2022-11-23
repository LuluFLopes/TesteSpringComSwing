package projeto.oo.func.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.oo.func.model.Desenvolvedor;
import projeto.oo.func.repository.DesenvolvedorRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CrudDesenvolvedorService {

    @Autowired
    private DesenvolvedorRepository desenvolvedorRepository;

    public void salvar(Desenvolvedor d) {desenvolvedorRepository.saveAndFlush(d);}

    public void atualizar(Desenvolvedor d) {desenvolvedorRepository.saveAndFlush(d);}

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
