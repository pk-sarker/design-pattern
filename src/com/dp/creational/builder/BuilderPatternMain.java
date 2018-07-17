package com.dp.creational.builder;

public class BuilderPatternMain {
	public static void main(String[] args)
    {
        ApplicationBuilder webAppBuilder = new WebAppplicationBuilder();
        DevelopmentTeam developmentTeamA = new DevelopmentTeam(webAppBuilder);
 
        developmentTeamA.buildApplication();
        Application webApplication = developmentTeamA.getApplication();
        System.out.println("=============== WEB APPLICATION ===============");
        webApplication.printReport();
        System.out.println("==================================================");
        
        MobileApplicationBuilder mobileAppBuilder = new MobileApplicationBuilder();
        DevelopmentTeam developmentTeamB = new DevelopmentTeam(mobileAppBuilder);
 
        developmentTeamB.buildApplication();
        Application mobileApplication = developmentTeamB.getApplication();
        System.out.println("=============== MOBILE APPLICATION ===============");
        mobileApplication.printReport();
    }
}

// ** OUTPUT **
// =============== WEB APPLICATION ===============
// ----- APPLICATION DEVELOPMENT INFORMATION ---- 
// Analysis Phase: DONE
// Design Phase: DONE
// Implementation Phase: DONE
// Testing Phase: DONE
// Deployment Phase: DONE
// Application Type: Personal Web Site
// Application Architecture: Created architecture for static website.
// Used technologies: [ SCSS, JavaScript, Bootstrap, HTML, Webpack,  ]
// ==================================================
// =============== MOBILE APPLICATION ===============
// ----- APPLICATION DEVELOPMENT INFORMATION ---- 
// Analysis Phase: DONE
// Design Phase: DONE
// Implementation Phase: DONE
// Testing Phase: DONE
// Deployment Phase: DONE
// Application Type: Android Mobile Application
// Application Architecture: Created architecture for android application.
// Used technologies: [ Xamarin, CSS, JavaScript, HTML,  ]

