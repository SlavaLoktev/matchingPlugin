package com.jira.plugin.vsu.jira.webwork;

import com.atlassian.jira.security.request.RequestMethod;
import com.atlassian.jira.security.request.SupportedMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;
@SupportedMethods(RequestMethod.GET)
public class MyWebworkAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(MyWebworkAction.class);

    @Override
    public String execute() throws Exception {

        return super.execute(); //returns SUCCESS
    }
}
