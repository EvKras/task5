package org.example.classes;

import org.example.innterfaces.DataConverter;
import org.yaml.snakeyaml.Yaml;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TxtToYamlAdapter implements DataConverter {
    private final BufferedReader reader;
    private final Yaml yaml = new Yaml();

    public TxtToYamlAdapter(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public String convertData(String input) {
        Map<String, String> data = new HashMap<>();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("="); // Предполагается, что TXT в формате key=value
                if (parts.length == 2) {
                    data.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            // Обработка ошибок чтения
            e.printStackTrace();
            return null;
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return yaml.dump(data);
    }
}