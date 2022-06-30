// tokenize means split up the input into analyzable segments 
// if we want we can also break it up by sentence and assign a part of speech 
//to each tokenization we can also employ named entity recognition (place,name,etc)
//we can also include lemmatization if that becomes an issue

package com.alexripperton.NLP;

import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Tockenize_example {

	public static void main(String[] args) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "Unable to access account in sales force,  get error message that account is going "
				+ "thru conversion and cannot be currently  access.  This message has been on the account for days and "
				+ "blue marble shows the account is already converted.";
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		List<CoreLabel> coreLabelList = coreDocument.tokens();
		for (CoreLabel coreLabel: coreLabelList) {
			System.out.println(coreLabel.originalText());
		}
	}
	
}

