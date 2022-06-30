package com.alexripperton.NLP;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.*;
import java.util.*;

public class namedEntityRecognizer {
	
	public static void main(String[] args) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		String text = "INC3904096 eSHOP BAN 483028935 Unable to access account in sales force,  get error message that account is going thru conversion and cannot be currently  access.";
		CoreDocument coreDocument = new CoreDocument(text);
		stanfordCoreNLP.annotate(coreDocument);
		List<CoreLabel> coreLabels = coreDocument.tokens();
		for(CoreLabel coreLabel: coreLabels) {
			String namedEntity = coreLabel.getString(CoreAnnotations.NamedEntityTagAnnotation.class);
			System.out.println(coreLabel.originalText()+ " = "+ namedEntity);
		}
		
		
	}

}
