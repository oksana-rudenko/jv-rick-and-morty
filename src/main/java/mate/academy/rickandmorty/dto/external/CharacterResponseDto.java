package mate.academy.rickandmorty.dto.external;

import java.util.List;
import lombok.Data;

@Data
public class CharacterResponseDto {
    private List<CharacterResultsResponseDto> results;
}
