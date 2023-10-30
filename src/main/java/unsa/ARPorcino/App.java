package unsa.ARPorcino;

import es.ucm.fdi.gaia.recolibry.api.RecommenderSystem;
import es.ucm.fdi.gaia.recolibry.api.RecommenderSystemFactory;
import unsa.ARPorcino.PigDescription;
import es.ucm.fdi.gaia.recolibry.api.RecSysConfiguration;
import es.ucm.fdi.gaia.recolibry.api.RecommenderResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.ucm.fdi.gaia.recolibry.api.Query;

public class App 
{
	public static RecommenderSystem getRecommenderSystem() {
		  //Object with recommender system configuration
		  RecSysConfiguration configuration = new TestConfiguration();
		  
		  //Make new instance of recommender system
		  RecommenderSystemFactory factory = new RecommenderSystemFactory();
			factory.makeRecommender(configuration);
		  
		  // Return recommender system
		  return factory.getRecommender();
	}
	
	public static void main(String[] args) {
		  //Get recommender system
		  RecommenderSystem recSys = getRecommenderSystem();
			
		  //Get query object
		  Query query = recSys.getQuery();
		  query.initialize();

		  Integer on = new Integer("1");
		  Integer on1 = new Integer("1");
		  Integer off = new Integer("0");
		  
		  //query.setAttributeValue(null, query);
		  query.setAttributeValue("F",1);
		  query.setAttributeValue("D",1);
		  query.setAttributeValue("A",1);
		  query.setAttributeValue("E",1);
		  query.setAttributeValue("VM",1);
		  query.setAttributeValue("DS",1);
		  query.setAttributeValue("PR",1);
		  query.setAttributeValue("C",0);
		  query.setAttributeValue("PLR",0);
		  query.setAttributeValue("PS",0);
		  query.setAttributeValue("HP",0);
		  query.setAttributeValue("RF",0);
		  query.setAttributeValue("ETS",0);
		  query.setAttributeValue("ALP",0);
		  query.setAttributeValue("LN",0);
		  query.setAttributeValue("DP",0);
		  query.setAttributeValue("ESCLF",0);
		  query.setAttributeValue("CR",0);
		  query.setAttributeValue("MR",0);
		  query.setAttributeValue("HMRR",1);
		  query.setAttributeValue("CJ",1);
		  query.setAttributeValue("CNV",1);
		  query.setAttributeValue("ATX",1);
		  query.setAttributeValue("TS",1);

		  //Initialize recommender system
		  recSys.initRecommender();
		  
		  //Get recommendations from query
		  List<RecommenderResult> results = recSys.recommend(query);

		  // Close recommender system
		  recSys.closeRecommender();
		  
		  for(RecommenderResult r : results)
			  System.out.println(((PigDescription)r.getItem()).getENFERMEDAD());
		  

	}


}
