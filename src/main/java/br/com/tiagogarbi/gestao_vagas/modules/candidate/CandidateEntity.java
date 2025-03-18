package br.com.tiagogarbi.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
  private UUID id;
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
