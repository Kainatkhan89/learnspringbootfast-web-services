package com.kainat.learnspringbootfastwebservices.mappers.module;

import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleDTO;
import com.kainat.learnspringbootfastwebservices.entities.module.Module;

import com.kainat.learnspringbootfastwebservices.enums.styles.Color;
import com.kainat.learnspringbootfastwebservices.enums.styles.Icon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ModuleMapper {

    @Mapping(source = "styleCode.color", target = "style.color", qualifiedByName = "stringToColor")
    @Mapping(source = "styleCode.icon", target = "style.icon", qualifiedByName = "stringToIcon")
    ModuleDTO toModuleDTO(Module module);

    List<ModuleDTO> toModuleDTOs(List<Module> modules);

    @Named("stringToColor")
    default Color stringToColor(String colorString) {
        try {
            return Color.valueOf(colorString.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return null;
        }
    }

    @Named("stringToIcon")
    default Icon stringToIcon(String iconString) {
        try {
            return Icon.valueOf(iconString.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return null;
        }
    }
}
