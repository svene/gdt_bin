
@Grab(group='org.eclipse.jgit', module='org.eclipse.jgit', version='2.3.1.201302201838-r')
import org.eclipse.jgit.api.CloneCommand
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.lib.Repository
import org.eclipse.jgit.storage.file.FileRepositoryBuilder

String userHome = System.properties['user.home']
String gdtBinHome = "${userHome}/.gdtbin"

String remoteUrl = "https://github.com/sven/gdt_bin.git"
String localRepoLocation = "${gdtBinHome}"

FileRepositoryBuilder builder = new FileRepositoryBuilder();
Repository repository = builder.setWorkTree(new File(gdtBinHome)).build()
Git git = new Git(repository);
CloneCommand clone = git.cloneRepository();
clone.setBare(false);
clone.setCloneAllBranches(true);
clone.setDirectory(new File(localRepoLocation)).setURI(remoteUrl);
clone.call();


