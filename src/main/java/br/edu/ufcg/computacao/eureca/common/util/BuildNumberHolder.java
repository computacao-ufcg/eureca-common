package br.edu.ufcg.computacao.eureca.common.util;

import br.edu.ufcg.computacao.eureca.common.constants.ConfigurationPropertyDefaults;
import br.edu.ufcg.computacao.eureca.common.constants.ConfigurationPropertyKeys;
import br.edu.ufcg.computacao.eureca.common.constants.Messages;
import br.edu.ufcg.computacao.eureca.common.exceptions.FatalErrorException;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BuildNumberHolder {
    private static final String BUILD_FILE = "./build";
    private Logger LOGGER = Logger.getLogger(BuildNumberHolder.class);

    private Properties properties;
    private static BuildNumberHolder instance;

    private BuildNumberHolder() {
        String filePath = BUILD_FILE;
        this.properties = readBuildFile(filePath);
    }

    public static synchronized BuildNumberHolder getInstance() throws FatalErrorException {
        if (instance == null) {
            instance = new BuildNumberHolder();
        }
        return instance;
    }

    public String getBuildNumber() {
         String buildNumber = null;
         buildNumber = this.properties.getProperty(ConfigurationPropertyKeys.BUILD_NUMBER_KEY,
                    ConfigurationPropertyDefaults.DEFAULT_BUILD_NUMBER);
         return buildNumber;
    }

    private Properties readBuildFile(String fileName) {
        Properties prop = new Properties();
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(fileName);
            prop.load(fileInputStream);
        } catch (IOException e) {
            LOGGER.info(String.format(Messages.PROPERTY_FILE_S_NOT_FOUND, fileName));
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    LOGGER.error(String.format(Messages.UNABLE_TO_CLOSE_FILE_S, fileName), e);
                }
            }
        }
        return prop;
    }
}
