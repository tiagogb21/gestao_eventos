package br.com.tiagogarbi.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name="candidate")
public class CandidateEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.UUID)
  private UUID id;

  @Schema(example="John Doe", requiredMode=RequiredMode.REQUIRED)
  private String name;

  @Pattern(regexp="^(?!\\s*$).*", message="O campo [username] não pode conter espaços em branco")
  private String username;
  @Email(message="O campo [email] deve conter um e-mail válido")
  private String email;
  @Length(min=6, max=20, message="O campo [password] deve conter entre 6 e 20 caracteres")
  private String password;
  private String description;
  private String curriculum;
}
