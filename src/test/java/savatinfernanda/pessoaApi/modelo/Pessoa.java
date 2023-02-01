package savatinfernanda.pessoaApi.modelo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Pessoa {

    @Id
    private final String cpf;
    private final String nome;
    private Date nascimento;
}
//teste