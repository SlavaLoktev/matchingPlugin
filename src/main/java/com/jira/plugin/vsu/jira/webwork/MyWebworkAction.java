package com.jira.plugin.vsu.jira.webwork;

import com.atlassian.jira.security.request.RequestMethod;
import com.atlassian.jira.security.request.SupportedMethods;
import com.atlassian.jira.security.xsrf.DoesNotRequireXsrfCheck;
import com.atlassian.sal.api.user.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;
//import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
//import com.atlassian.plugin.
import javax.inject.Inject;

@SupportedMethods({RequestMethod.GET, RequestMethod.POST})
@DoesNotRequireXsrfCheck
public class MyWebworkAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(MyWebworkAction.class);

//    private final UserManager userManager;
//    @Inject
//    public MyWebworkAction(@ComponentImport UserManager userManager) {
//        this.userManager = userManager;
//    }

    @Override
    public String execute() throws Exception {

        return super.execute(); //returns SUCCESS
    }
}
