package com.alexripperton.NLP;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class sentimentanalysis {
	public static void main (String[] args) {
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "Unable to access account in sales force,  get error message that account is going "
				+ "thru conversion and cannot be currently  access.  This message has been on the account for days and "
				+ "blue marble shows the account is already converted.";
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		List<CoreSentence> sentences = coreDocument.sentences();
		for(CoreSentence sentence: sentences) {
			String sentiment = sentence.sentiment();
			System.out.println(sentence + " = " + sentiment);
		}
	}

}
