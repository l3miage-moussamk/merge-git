package fr.uga.miage.l3;

import java.util.Map;

public class PackageManager {
    private String name;
    private String version;
    private boolean isPrivate;
    private Map<String, String> dependencies = Map.of(
            "a mettre les ", "dépendance"
    );
    private Map<String, String> devDependencies = Map.of(
            "a mettre les ", "dépendance"
    );

}

