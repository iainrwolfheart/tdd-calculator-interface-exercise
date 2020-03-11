
public class OrderReader {

	private final FileReaderService fileReader;

	public OrderReader(FileReaderService fileReader) {
		super();
		this.fileReader = fileReader;
	}

	public FileReaderService getFileReader() {
		return fileReader;
	}

	public String readFirstLine() {
		String line = fileReader.readLine();

		return "Hi there";
	}
}
