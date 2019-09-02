package LesCollections;

public class UrlLibraryApp {

	public static void main(String[] args) {
		
		UrlLibrary urlLibrary = new UrlLibrary();
		
		for(String url : urlLibrary) {
			
			System.out.println(url);
		}

	}

}
