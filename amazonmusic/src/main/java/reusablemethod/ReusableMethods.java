package reusablemethod;


public class ReusableMethods {
	public String PropertyFetch(string key,string path)
	FileInputStream fis = new FileInputStream(path);
	properties pobj = new properties();
	pobj.load(fis);
	string data =pobj.getproperty(key);
	return (data);
}

	

}
