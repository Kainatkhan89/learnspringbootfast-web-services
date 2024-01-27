package com.kainat.learnspringbootfastwebservices.mappers;

import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleDTO;
import com.kainat.learnspringbootfastwebservices.dtos.module.ModuleStyle;
import com.kainat.learnspringbootfastwebservices.entities.module.Module;
import com.kainat.learnspringbootfastwebservices.enums.styles.Color;
import com.kainat.learnspringbootfastwebservices.enums.styles.Icon;

import java.util.List;
import java.util.stream.Collectors;


public class ModuleMapper {

    public static ModuleDTO toDTO(Module module) {
        if (module == null) {
            return null;
        }

        ModuleDTO dto = new ModuleDTO();
        dto.setId(module.getId());
        dto.setNumber(module.getNumber());
        dto.setTitle(module.getTitle());
        dto.setDescription(module.getDescription());

        if (module.getStyleCode() != null) {
            ModuleStyle moduleStyle = extractModuleStyle(module);
            dto.setModuleStyle(moduleStyle);
        }

        return dto;
    }

    public static List<ModuleDTO> toDTOList(List<Module> modules) {
        if (modules == null) {
            return null;
        }

        return modules.stream().map(ModuleMapper::toDTO).collect(Collectors.toList());
    }

    private static ModuleStyle extractModuleStyle(Module module) {
        ModuleStyle moduleStyle = new ModuleStyle();

        Color color = stringToColor(module.getStyleCode().getColor());
        Icon icon = stringToIcon(module.getStyleCode().getIcon());

        moduleStyle.setColor(color);
        moduleStyle.setIcon(icon);

        return moduleStyle;
    }

    private static Color stringToColor(String colorString) {
        try {
            return Color.valueOf(colorString.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return null; // Or handle the exception as per your application's requirements
        }
    }

    private static Icon stringToIcon(String iconString) {
        try {
            return Icon.valueOf(iconString.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return null; // Or handle the exception as per your application's requirements
        }
    }
}

