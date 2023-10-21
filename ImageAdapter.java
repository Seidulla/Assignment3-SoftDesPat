

	public class ImageAdapter implements ImageProcessorInterface {
	    private OldLibrary oldLibrary;
	    private NewLibrary newLibrary;

	    public ImageAdapter(OldLibrary oldLibrary, NewLibrary newLibrary) {
	        this.oldLibrary = oldLibrary;
	        this.newLibrary = newLibrary;
	    }

	    @Override
	    public void process(String imagePath) {
	        oldLibrary.processImageWithOldLibrary(imagePath);

	        newLibrary.processImageWithNewLibrary(imagePath);
	    }
	}

