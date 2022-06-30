package com.alexripperton.NLP;

import edu.stanford.nlp.pipeline.*;
import java.util.*;

public class SentenceAnalyzer {
	public static void main (String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "INC3904096 eSHOP BAN 483028935. Unable to access account in sales force. Getting error message that account is going thru conversion and cannot be currently accsed.";
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		List<CoreSentence> sentences = coreDocument.sentences();
		for(CoreSentence sentence: sentences) {
			System.out.println(sentence.toString());
		}
	}
}
