import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
	@Override
	public BookMetadataFormatter createFormatter() {
		try {
			return new XMLBookMetadataFormatter();
		} catch (ParserConfigurationException e) {
			return null;
		}
	}
}