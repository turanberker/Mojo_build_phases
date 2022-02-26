package build;

import com.maventest.Action;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.reflections.Reflections;


import java.util.Set;

/**
 * This goal will say a message.
 *
 * @goal howdy-world
 */
public class HowdyMojo extends AbstractMojo
{
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        Reflections reflections = new Reflections("com.maventest");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(Action.class);
       for(Class sinif:annotated){
           getLog().info( sinif.getName() );
       }
        getLog().info( "Hi There Berker" );
    }
}
