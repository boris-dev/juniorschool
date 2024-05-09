package ru.liga.dcs.badcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SentimentAnalyser {
    private static final Logger LOGGER = LoggerFactory.getLogger(SentimentAnalyser.class);

    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("sentiment-analysis", ".json");
            Files.writeString(tempFile, "{\"text\": \"WOW, I love this new phone. But WTF, why is it so expensive? WOW, the camera is great though.\"}");

            analyzeSentimentFromFile(tempFile.toString(), "analysis-report.txt");

            Files.delete(tempFile);
        } catch (Throwable e) {
            LOGGER.error("Critical error occurred", e);
        }
    }

    public static void analyzeSentimentFromFile(String fileName, String reportFileName) {
        try {
            LOGGER.error("Starting to read file: {}", fileName);
            String jsonInput = Files.readString(Path.of(fileName));

            if (jsonInput.isEmpty()) {
                LOGGER.error("The file {} is empty or has invalid content.", fileName);
                return;
            }

            LOGGER.error("File content successfully read");
            JSONObject jsonObject = new JSONObject(jsonInput);
            String text = jsonObject.getString("text");

            LOGGER.error("Starting sentiment analysis on text: " + text);
            int positiveCount = 0, negativeCount = 0;
            String[] words = text.split("\\s+");
            for (String word : words) {
                LOGGER.error("Analyzing word: {}", word);
                if (word.equalsIgnoreCase("WOW")) {
                    positiveCount++;
                    LOGGER.error("Found positive word: {}", word);
                } else if (word.equalsIgnoreCase("WTF")) {
                    negativeCount++;
                    LOGGER.error("Found negative word: {}", word);
                }
            }

            String sentiment = positiveCount > negativeCount ? "Positive" : negativeCount > positiveCount ? "Negative" : "Neutral";
            LOGGER.error("Analysis complete for file: {}", fileName);
            LOGGER.error("Results: Total words = {}, Positive mentions = {}, Negative mentions = {}, Overall sentiment = {}", words.length, positiveCount, negativeCount, sentiment);

            // Creating report
            LOGGER.error("Creating report file: {}", reportFileName);
            String reportContent = "Analysis Report for " + fileName + "\n" +
                    "Total words: " + words.length + "\n" +
                    "Positive mentions: " + positiveCount + "\n" +
                    "Negative mentions: " + negativeCount + "\n" +
                    "Overall sentiment: " + sentiment;
            Path reportPath = Path.of(reportFileName);
            Files.writeString(reportPath, reportContent, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            LOGGER.error("Report successfully created at {}", reportPath);

        } catch (IOException e) {
            LOGGER.error("Failed to read file: {}", fileName, e);
            throw new AnalysisRuntimeException("Failed to read file: " + fileName, e);
        } catch (JSONException e) {
            LOGGER.error("Failed to parse JSON from file: {}", fileName, e);
            throw new AnalysisRuntimeException("Failed to parse JSON from file: " + fileName, e);
        }
    }

    static class AnalysisRuntimeException extends RuntimeException {
        public AnalysisRuntimeException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

