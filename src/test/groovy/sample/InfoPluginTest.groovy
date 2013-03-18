package sample

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

/**
 * Created with IntelliJ IDEA.
 * User: kaakaa_hoe
 * Date: 13/03/16
 * Time: 0:12
 * To change this template use File | Settings | File Templates.
 */
class InfoPluginTest {
    @Test
    void infoTaskIsAddedToProject(){
        final Project project = ProjectBuilder.builder().build()
        project.apply plugin: sample.InfoPlugin
        assert project.tasks.findByName('info')
    }

    @Test
    void configurePrefix(){
        final Project project = ProjectBuilder.builder().build()
        project.apply plugin: sample.InfoPlugin
        project.info.prefix = 'Sample'
        assert project.info.prefix == 'Sample'
    }
}
