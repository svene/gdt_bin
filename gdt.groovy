@GrabResolver(name='sven-github', root='http://svene.github.com/maven2/releases')
@Grab(group='org.svenehrke', module='directory_template', version='0.0.11')
import org.svenehrke.directorytemplate.tool.GdtMain

if (args.size() == 1 && args[0] == 'selfupdate') {
	File f = new File("${getClass().protectionDomain.codeSource.location.path}")
	String scriptFolder = f.parentFile.absolutePath
	run (new File("$scriptFolder/gdt_update.groovy"), [] as String[])
}
else {
	new GdtMain().run(args)
}
