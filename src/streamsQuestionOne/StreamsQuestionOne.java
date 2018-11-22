package streamsQuestionOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsQuestionOne {

	public static void main(String[] args) {
	
		List<String>strings = Arrays.asList("hello","it's","dale");
		List<String>Sentence = strings.stream().map(Capitilise -> Capitilise.toUpperCase()).collect(Collectors.toList());
		System.out.println(Sentence);
		}
}
