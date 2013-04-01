@GrabResolver(name='sven-github', root='http://svene.github.com/maven2/releases')
@Grab(group='org.svenehrke', module='directory_template', version='0.0.9')
import org.svenehrke.directorytemplate.tool.GdtMain

if (args.size() == 1 && args[0] == 'selfupdate') {
	new gdt_update().run() 
}
else {
	new GdtMain().run(args)
}
