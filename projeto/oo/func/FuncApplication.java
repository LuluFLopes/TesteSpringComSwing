package projeto.oo.func;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projeto.oo.func.view.TelaInicial;

@SpringBootApplication
public class FuncApplication {

    public static void main(String[] args) {
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        SpringApplication.run(FuncApplication.class, args);
    }

}
