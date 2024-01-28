package com.kainat.learnspringbootfastwebservices.mappers.tutorial;

import com.kainat.learnspringbootfastwebservices.dtos.progress.CompletedTutorialDTO;
import com.kainat.learnspringbootfastwebservices.entities.tutorial.Tutorial;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TutorialMapper {

    @Mapping(source = "id", target = "tutorialId")
    CompletedTutorialDTO tutorialToCompletedTutorialDTO(Tutorial tutorial);
}
