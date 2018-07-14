package com.dp.creational.singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Organization objectA = Organization.getInstance();
		Organization objectB = Organization.getInstance();
		objectA.setName("Google LLC");
		objectA.pushSpecializedArea("Internet-related services");
		objectB.pushSpecializedArea("Search engine");
		objectA.pushSpecializedArea("Online advertising technologies");
		objectB.pushSpecializedArea("Cloud computing");
		objectB.pushSpecializedArea("Software");
		objectA.pushSpecializedArea("Hardware");
		objectA.pushBusinessScope("New Technology");
		objectB.pushBusinessScope("Technology enhancement");
		
		objectA.printData();
		objectB.printData();
		
		// --- OUTPUT --- 
		// ==========================================================
		// Organization Name: Google LLC
		// Specialized Area: [ Cloud computing, Internet-related services, Online advertising technologies, Search engine, Software, Hardware ]
		// Business Scope: [ New Technology, Technology enhancement ]
		// ==========================================================
		// Organization Name: Google LLC
		// Specialized Area: [ Cloud computing, Internet-related services, Online advertising technologies, Search engine, Software, Hardware ]
		// Business Scope: [ New Technology, Technology enhancement ]

	}

}
