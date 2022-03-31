package Framework.ExcelDriven;

import java.io.IOException;
import java.util.ArrayList;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
dataDriven dat=new dataDriven();
ArrayList arr =dat.getData("Delete");
System.out.println(arr.get(0));
System.out.println(arr.get(1));
System.out.println(arr.get(2));
System.out.println(arr.get(3));
	}

}
