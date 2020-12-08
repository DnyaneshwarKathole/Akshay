import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class excel{
public static void main(String[]args)throws IOException{
FileInputStream file=new FileInputStream("d://abc.xlx");
String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
System.out.println(value);
}
}