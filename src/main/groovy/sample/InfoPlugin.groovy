package sample

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created with IntelliJ IDEA.
 * User: kaakaa_hoe
 * Date: 13/03/15
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */
class InfoPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
        project.extensions.create('info', InfoPluginExtension)

        project.task('info')<<{
            println "$project.info.prefix: $project.gradle.gradleVersion"
        }
    }
}
