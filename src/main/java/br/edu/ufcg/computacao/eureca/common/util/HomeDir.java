package br.edu.ufcg.computacao.eureca.common.util;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class HomeDir {
    public static final String PRIVATE_DIRECTORY = "private/";

    public static String getPath() {
        try {
            return Paths.get(Thread.currentThread().getContextClassLoader().getResource("").toURI())
                    + File.separator + PRIVATE_DIRECTORY ;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return e.toString();
        }
    }
}
