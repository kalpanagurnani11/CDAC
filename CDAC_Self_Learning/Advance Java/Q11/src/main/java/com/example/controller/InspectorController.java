package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
public class InspectorController {

    @GetMapping("/")
    public List<String> getLibraries() {
        String classpath = System.getProperty("java.class.path");
        String pathSeparator = System.getProperty("path.separator");
        String[] paths = classpath.split(pathSeparator);
        List<String> jars = new ArrayList<>();
        for (String path : paths) {
            if (path.endsWith(".jar")) {
                File file = new File(path);
                jars.add(file.getName());
            }
        }
        return jars;
    }
}
