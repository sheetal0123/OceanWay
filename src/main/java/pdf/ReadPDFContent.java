//package pdf;
//
//import java.util.logging.Logger;
//
//import org.slf4j.LoggerFactory;
//
//import com.google.common.base.Throwables;
//import com.itextpdf.text.pdf.PdfReader;
//import com.itextpdf.text.pdf.parser.PdfTextExtractor;
//
//public class ReadPDFContent {
//
//	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ReadPDFContent.class);
//
//	public String readNormalPDF() {
//		String pdfPath = "C:\\Users\\e075583\\Documents\\myworkspace\\OceanWay\\src\\main\\java\\pdf\\sample1.pdf";
//		String pgContent = "";
//		try {
//			PdfReader pdfReader = new PdfReader(pdfPath);
//			int pages = pdfReader.getNumberOfPages();
//
//			for (int i = 1; i <= pages; i++) {
//				pgContent = PdfTextExtractor.getTextFromPage(pdfReader, i);
//			}
//			pdfReader.close();
//		} catch (Exception e) {
//			logger.info("Failed to read pdf file ", e);
//			throw Throwables.propagate(e);
//		}
//
//		return pgContent;
//	}
//
//
//
//	public static void main(String[] args) {
//
//		ReadPDFContent obj = new ReadPDFContent();
//		String content = obj.readNormalPDF();
//		logger.info(content);
//
//	}
//
//}
