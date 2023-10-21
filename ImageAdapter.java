

	public class ImageAdapter implements ImageProcessorInterface {
	    private OldLibrary oldLibrary;
	    private NewLibrary newLibrary;

	    public ImageAdapter(OldLibrary oldLibrary, NewLibrary newLibrary) {
	        this.oldLibrary = oldLibrary;
	        this.newLibrary = newLibrary;
	    }

	    @Override
	    public void process(String imagePath) {
	        // Use the old library's method to process the image
	        oldLibrary.processImageWithOldLibrary(imagePath);

	        // Use the new library's method to process the image
	        newLibrary.processImageWithNewLibrary(imagePath);
	    }
	}

