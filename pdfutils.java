import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfUtils {

    public static String extractTextFromPdf(String filePath) {
        try (PDDocument document = PDDocument.load(new File(filePath))) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            return pdfStripper.getText(document);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String extractPhoneNumber(String text) {
        String[] lines = text.split("\\R");
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                return line.replaceAll("[^0-9]", "");
            }
        }
        return null;
    }
}
