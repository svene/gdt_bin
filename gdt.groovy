@GrabResolver(name='sven-github', root='http://svene.github.com/maven2/releases')
@Grab(group='org.svenehrke', module='directory_template', version='0.0.14')
import org.svenehrke.directorytemplate.tool.GdtMain


if (args.size() == 1 && args[0] == 'selfupdate') {
	String userHome = System.properties['user.home']
	String gdtHome = "${userHome}/.gdt"
	run (new File("$gdtHome/bin/gdt_update.groovy"), [] as String[])
}
else {
	new GdtMain().run(args)
}
