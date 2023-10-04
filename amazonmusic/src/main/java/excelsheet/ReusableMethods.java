package excelsheet;

import java.io.FileInputStream;

public class ReusableMethods {
	public String PropertyFetch(string key,string path)
	FileInputStream fis = new FileInputStream(path);
	properties pobj = new properties();
	pobj.load(fis);

}
