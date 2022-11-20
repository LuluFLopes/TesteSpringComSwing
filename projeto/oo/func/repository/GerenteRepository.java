package projeto.oo.func.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.oo.func.model.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente,Integer> {
}
