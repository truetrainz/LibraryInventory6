package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.ArrayList;

/**
 * used to create pdfs with the name, vendor ID and manufacotor ID on them.
 */
public class PDFCreation {

    public PDFCreation() {}

    public void makePDF(ArrayList<Inventory> list) {
        Document doc = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("/Users/nickcliffel/Documents/PDFDoc.pdf"));
            System.out.print("PDF created");
            doc.open();
            doc.add(new Paragraph("I&RC Reorder List"));
            doc.add(new Paragraph("Format: name -> vendor ID -> manufactor ID"));
            for (int i = 0; i < list.size(); i++) {
                Inventory inventory = list.get(i);
                doc.add(new Paragraph(inventory.getName() + " -> " + inventory.getVendorId() + " -> " + inventory.getManufactorId()));
                doc.add(new Paragraph(""));
            }
            doc.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
