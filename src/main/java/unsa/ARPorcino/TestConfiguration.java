package unsa.ARPorcino;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import es.ucm.fdi.gaia.jcolibri.cbrcore.Connector;
import es.ucm.fdi.gaia.jcolibri.method.retrieve.NNretrieval.similarity.GlobalSimilarityFunction;
import es.ucm.fdi.gaia.jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import es.ucm.fdi.gaia.recolibry.api.Query;
import es.ucm.fdi.gaia.recolibry.api.RecSysConfiguration;
import es.ucm.fdi.gaia.recolibry.implementations.jcolibri.CSVConnector;
import es.ucm.fdi.gaia.recolibry.implementations.jcolibri.LocalSimilarityConfiguration;
import es.ucm.fdi.gaia.recolibry.implementations.jcolibri.RecommenderJColibri;
import es.ucm.fdi.gaia.recolibry.utils.BeansFactory;
import es.ucm.fdi.gaia.recolibry.utils.ClassGenerator;

import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.jiowa.codegen.JiowaCodeGeneratorEngine;
import com.jiowa.codegen.config.JiowaCodeGenConfig;
import es.ucm.fdi.gaia.recolibry.api.RecommenderAlgorithm;
import es.ucm.fdi.gaia.recolibry.implementations.jcolibri.QueryJColibri;
import es.ucm.fdi.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;


public class TestConfiguration extends RecSysConfiguration {
	private static final String PACKAGE_NAME = "unsa.ARPorcino";
	private static final String CLASS_NAME = "PigDescription"; 
	
	  @Override
	  protected void generateClass() {
		  // Define single type attributes with their names and types.
		  String[] attr1 = new String[]{"ID","Integer"};
		  String[] attr2 = new String[]{"F","Integer"};
		  String[] attr3 = new String[]{"D","Integer"};
		  String[] attr4 = new String[]{"A","Integer"};
		  String[] attr5 = new String[]{"E","Integer"};
		  String[] attr6 = new String[]{"VM","Integer"};
		  String[] attr7 = new String[]{"DS","Integer"};
		  String[] attr8 = new String[]{"PR","Integer"};
		  String[] attr9 = new String[]{"C","Integer"};
		  String[] attr10 = new String[]{"PLR","Integer"};
		  String[] attr11 = new String[]{"PS","Integer"};
		  String[] attr12 = new String[]{"HP","Integer"};
		  String[] attr13 = new String[]{"RF","Integer"};
		  String[] attr14 = new String[]{"ETS","Integer"};
		  String[] attr15 = new String[]{"ALP","Integer"};
		  String[] attr16 = new String[]{"LN","Integer"};
		  String[] attr17 = new String[]{"DP","Integer"};
		  String[] attr18 = new String[]{"ESCLF","Integer"};
		  String[] attr19 = new String[]{"CR","Integer"};
		  String[] attr20 = new String[]{"MR","Integer"};
		  String[] attr21 = new String[]{"HMRR","Integer"};
		  String[] attr22 = new String[]{"CJ","Integer"};
		  String[] attr23 = new String[]{"CNV","Integer"};
		  String[] attr24 = new String[]{"ATX","Integer"};
		  String[] attr25 = new String[]{"TS","Integer"};
		  String[] attr26 = new String[]{"ENFERMEDAD","String"};

		  // Add single type attributes in a list
		  List<String[]> attributes = new ArrayList<>();
		  attributes.add(attr1);
		  attributes.add(attr2);
		  attributes.add(attr3);
		  attributes.add(attr4);
		  attributes.add(attr5);
		  attributes.add(attr6);
		  attributes.add(attr7);
		  attributes.add(attr8);
		  attributes.add(attr9);
		  attributes.add(attr10);
		  attributes.add(attr11);
		  attributes.add(attr12);
		  attributes.add(attr13);
		  attributes.add(attr14);
		  attributes.add(attr15);
		  attributes.add(attr16);
		  attributes.add(attr17);
		  attributes.add(attr18);
		  attributes.add(attr19);
		  attributes.add(attr20);
		  attributes.add(attr21);
		  attributes.add(attr22);
		  attributes.add(attr23);
		  attributes.add(attr24);
		  attributes.add(attr25);
		  attributes.add(attr26);		  

		  // Add list type attributes in a different list.
		  List<String[]> attributesList = new ArrayList<>();
		  //attributesList.add(attr3);
		  
		  // Load Jiowa configuration included in RecoLibry-Core.
		  JiowaCodeGenConfig config = new JiowaCodeGenConfig("codegen.properties");
		  
		  // Add all information to ClassGenerator object.
		  ClassGenerator classGenerator = new ClassGenerator(config);
		  classGenerator.setClassName(CLASS_NAME);
		  classGenerator.setPackageName(PACKAGE_NAME);
		  classGenerator.setAttributes(attributes);
		  //*******
		  classGenerator.setAttributesList(attributesList);
	
		  // Build the new class with Jiowa engine and the class configuration.
		  JiowaCodeGeneratorEngine engine = new JiowaCodeGeneratorEngine(classGenerator);
		  engine.start();

		  // Save the java file in our project.
		  file = System.getProperty("user.dir").replace("\\","/") + "/src/main/java/" + PACKAGE_NAME.replace(".", "/") + "/" + CLASS_NAME + ".java";
		  file.replace("/", System.getProperty("path.separator"));
	  }
	  
	  @Override
	  protected void configure() {
		  //Build MovieDescription class
		  generateClass();
		  
		  //Compile the class
		  try {
			compile();
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  
		  //Save the class object in a variable
		  try {
			Class<?> clazz = Class.forName(PACKAGE_NAME + "." + CLASS_NAME);
		  
			//Configure BeansFactory to make MovieDescription objects
			  BeansFactory factory = new BeansFactory(clazz);
			  
			  //Add BeanFactory to CSVConnector
			  bind(BeansFactory.class)
			    .annotatedWith(Names.named("beansFactory"))
			    .toInstance(factory);
			  
			  //Define the file path
			  String path = System.getProperty("user.dir") + "/src/main/java"+ "/data/cerdos.csv";
			  
			  bind(String.class)
			    .annotatedWith(Names.named("fileName"))
			    .toInstance(path);
			  
			  //Set that movies.csv contains title row
			   bind(Boolean.class)
			     .annotatedWith(Names.named("existTitleRow"))
			     .toInstance(true);
			   //Bind CSVConnector with Connector of RecommenderJColibri
			   bind(Connector.class)
			     .to(CSVConnector.class);
			   //----------------------------------------------------------------------
		  
			   //Configure the list of local similarity functions
			   List<LocalSimilarityConfiguration> configurations = new ArrayList<LocalSimilarityConfiguration>();
			 	//LocalSimilarityConfiguration conf = new LocalSimilarityConfiguration("genres", clazz, new Equal());
			   LocalSimilarityConfiguration conf1 = new LocalSimilarityConfiguration("F", clazz, new   Equal());
			   LocalSimilarityConfiguration conf2 = new LocalSimilarityConfiguration("D", clazz, new   Equal());
			   LocalSimilarityConfiguration conf3 = new LocalSimilarityConfiguration("A", clazz, new   Equal());
			   LocalSimilarityConfiguration conf4 = new LocalSimilarityConfiguration("E", clazz, new   Equal());
			   LocalSimilarityConfiguration conf5 = new LocalSimilarityConfiguration("VM", clazz, new  Equal());
			   LocalSimilarityConfiguration conf6 = new LocalSimilarityConfiguration("DS", clazz, new  Equal());
			   LocalSimilarityConfiguration conf7 = new LocalSimilarityConfiguration("PR", clazz, new  Equal());
			   LocalSimilarityConfiguration conf8 = new LocalSimilarityConfiguration("C", clazz, new   Equal());
			   LocalSimilarityConfiguration conf9 = new LocalSimilarityConfiguration("PLR", clazz, new Equal());
			   LocalSimilarityConfiguration conf10 = new LocalSimilarityConfiguration("PS", clazz, new  Equal());
			   LocalSimilarityConfiguration conf11 = new LocalSimilarityConfiguration("HP", clazz, new  Equal());
			   LocalSimilarityConfiguration conf12 = new LocalSimilarityConfiguration("RF", clazz, new  Equal());
			   LocalSimilarityConfiguration conf13 = new LocalSimilarityConfiguration("ETS", clazz, new Equal());
			   LocalSimilarityConfiguration conf14 = new LocalSimilarityConfiguration("ALP", clazz, new Equal());
			   LocalSimilarityConfiguration conf15 = new LocalSimilarityConfiguration("LN", clazz, new  Equal());
			   LocalSimilarityConfiguration conf16 = new LocalSimilarityConfiguration("DP", clazz, new  Equal());
			   LocalSimilarityConfiguration conf17 = new LocalSimilarityConfiguration("ESCLF", clazz, new   Equal());
			   LocalSimilarityConfiguration conf18 = new LocalSimilarityConfiguration("CR", clazz, new  Equal());
			   LocalSimilarityConfiguration conf19 = new LocalSimilarityConfiguration("MR", clazz, new  Equal());
			   LocalSimilarityConfiguration conf20 = new LocalSimilarityConfiguration("HMRR", clazz, new    Equal());
			   LocalSimilarityConfiguration conf21 = new LocalSimilarityConfiguration("CJ", clazz, new  Equal());
			   LocalSimilarityConfiguration conf22 = new LocalSimilarityConfiguration("CNV", clazz, new Equal());
			   LocalSimilarityConfiguration conf23 = new LocalSimilarityConfiguration("ATX", clazz, new Equal());
			   LocalSimilarityConfiguration conf24 = new LocalSimilarityConfiguration("TS", clazz, new  Equal());

			   
//			   configurations.add(conf);
			   configurations.add(conf1 );
			   configurations.add(conf2 );
			   configurations.add(conf3 );
			   configurations.add(conf4 );
			   configurations.add(conf5 );
			   configurations.add(conf6 );
			   configurations.add(conf7 );
			   configurations.add(conf8 );
			   configurations.add(conf9 );
			   configurations.add(conf10);
			   configurations.add(conf11);
			   configurations.add(conf12);
			   configurations.add(conf13);
			   configurations.add(conf14);
			   configurations.add(conf15);
			   configurations.add(conf16);
			   configurations.add(conf17);
			   configurations.add(conf18);
			   configurations.add(conf19);
			   configurations.add(conf20);
			   configurations.add(conf21);
			   configurations.add(conf22);
			   configurations.add(conf23);
			   configurations.add(conf24);
			   
			   //Bind local similarity functions
			   bind(new TypeLiteral<List<LocalSimilarityConfiguration>>() {})
			 		.toInstance(configurations);

			   //Bind global similarity function
			   bind(GlobalSimilarityFunction.class)
			 		.to(Average.class);
			   
			   //Bind the number of results to recover
			   bind(Integer.class)
			     .annotatedWith(Names.named("N-Results"))
			     .toInstance(10);

			   //Bind the algorithm to use in RecoLibry
			   bind(RecommenderAlgorithm.class)
			     .to(RecommenderJColibri.class);
			   
			   //Bind the name of Java Bean Class (MovieDescription)
			   bind(String.class)
			     .annotatedWith(Names.named("BeanClass"))
			     .toInstance(PACKAGE_NAME + "." + CLASS_NAME);

			   //Bind the query class used in the recommender system
			   bind(Query.class)
			     .to(QueryJColibri.class);
			   
			   
			   
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  
		  
		  
	  }
  
	}
