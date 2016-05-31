package robotproject;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		RobotHtmlGenerator htmlGen = new RobotHtmlGenerator();
		String html = htmlGen.getHtml();
		try {
			writeToHtml(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void writeToHtml(String html) throws IOException {
		List<String> lines = Arrays.asList(html);
		Path file = Paths.get("/home/martin/development/t2data/maiarobot/Schedueler/src/robotproject/robot.html");
		Files.write(file, lines, Charset.forName("UTF-8"));
	}

}
