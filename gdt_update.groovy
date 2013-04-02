
@Grab(group='org.eclipse.jgit', module='org.eclipse.jgit', version='2.3.1.201302201838-r')
import org.eclipse.jgit.api.PullCommand
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.lib.Repository
import org.eclipse.jgit.storage.file.FileRepositoryBuilder

String userHome = System.properties['user.home']
String gdtHome = "${userHome}/.gdt"

String localRepoLocation = "${gdtHome}/bin"

FileRepositoryBuilder builder = new FileRepositoryBuilder();
Repository repository = builder.setWorkTree(new File(localRepoLocation)).build()
Git git = new Git(repository)
PullCommand pull = git.pull()
pull.call();

println "gdt updated to latest version"
