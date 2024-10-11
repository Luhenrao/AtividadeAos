
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Produto;


@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
    public void Recall(Produto produto);
}