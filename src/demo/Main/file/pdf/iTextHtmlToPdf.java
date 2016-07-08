package demo.Main.file.pdf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
/**
 * Created by 83708 on 2016/7/7.
 */
public class iTextHtmlToPdf {
    public static final String HTML = "F:\\WIN10\\Dropbox\\Code\\springmvc-web\\src\\demo\\Main\\file\\pdf\\index.html";
    public static final String DEST = "D:\\hero.pdf";

    /**
     * Creates a PDF with the words "Hello World"
     * @param file
     * @throws IOException
     * @throws DocumentException
     */
    public void createPdf(String file) throws IOException, DocumentException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(HTML), Charset.forName("UTF-8"));
        // step 5
        document.close();
    }

    /**
     * Main method
     */
    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new iTextHtmlToPdf().createPdf(DEST);
    }
}
