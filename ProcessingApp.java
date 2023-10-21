
public class ProcessingApp {
	public static void main(String[] args) {
        OldLibrary oldLibrary = new OldLibrary();
        NewLibrary newLibrary = new NewLibrary();

        ImageProcessorInterface adapter = new ImageAdapter(oldLibrary, newLibrary);

        adapter.process("sample.jpg");
    }
}
