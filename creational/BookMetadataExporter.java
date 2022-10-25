import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    
	public abstract BookMetadataFormatter createFormatter();
	
	public void export(PrintStream stream) {
		BookMetadataFormatter exporter = createFormatter();
		if (exporter != null) {
			for (Book i : books) {
				exporter.append(i);
			}
			stream.println(exporter.getMetadataString());
		}
	}
}