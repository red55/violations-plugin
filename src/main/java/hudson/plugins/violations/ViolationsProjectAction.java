package hudson.plugins.violations;

import hudson.model.AbstractProject;
import hudson.model.Job;
import hudson.plugins.violations.hudson.AbstractViolationsProjectAction;

/**
 * Project level action.
 */
public class ViolationsProjectAction
    extends AbstractViolationsProjectAction {

    /**
     * Create a project action for the violations.
     * @param project the current project.
     */
    public  ViolationsProjectAction(Job<?, ?> project) {
        super(project);
    }

}

