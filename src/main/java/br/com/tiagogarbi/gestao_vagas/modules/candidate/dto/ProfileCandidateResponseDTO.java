package br.com.tiagogarbi.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {
  @Schema(example = "Desenvolvedora Java")
  private String description;

  @Schema(example = "janedoe")
  private String username;

  @Schema(example = "jane_doe@mail.com")
  private String email;
  private UUID id;

  @Schema(example = "Jane doe")
  private String name;
}
