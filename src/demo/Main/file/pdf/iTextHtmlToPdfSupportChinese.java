package demo.Main.file.pdf;

import com.lowagie.text.pdf.BaseFont;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by 83708 on 2016/7/7.
 */
public class iTextHtmlToPdfSupportChinese {
    public void createPdf() throws Exception {
        // step 1
        String inputFile = "F:\\WIN10\\Dropbox\\Code\\springmvc-web\\src\\demo\\Main\\file\\pdf\\chinese.html";
        String url = new File(inputFile).toURI().toURL().toString();
        String outputFile = "D:\\hero.pdf";
        System.out.println(url);
        // step 2
        OutputStream os = new FileOutputStream(outputFile);
        org.xhtmlrenderer.pdf.ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(url);
        // step 3 解决中文支持
        org.xhtmlrenderer.pdf.ITextFontResolver fontResolver = renderer
                .getFontResolver();
        fontResolver.addFont("c:/Windows/Fonts/simsun.ttc", BaseFont.IDENTITY_H,
                BaseFont.NOT_EMBEDDED);
        renderer.layout();
        renderer.createPDF(os);
        os.close();
        System.out.println("create pdf done!!");
    }
    public static void main(String[] args) throws Exception {
        iTextHtmlToPdfSupportChinese app = new iTextHtmlToPdfSupportChinese();
        app.createPdf();
    }
}
