package projeto.oo.func.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.oo.func.model.Estagiario;

@Repository
public interface EstagiarioRepository extends JpaRepository<Estagiario,Integer> {
}
