import org.apache.ws.commons.tcpmon.TCPMon

includeTargets << grailsScript('_GrailsInit')

target(tcpmon: 'Runs TCPMon') {
	depends(classpath, checkVersion, configureProxy)

	argsList = argsMap.params

	int listenPort = (argsMap.listen ?: '8888') as int
	int targetPort = (argsMap.target ?: '8080') as int
	String targetHost = argsMap.host ?: 'localhost'

	new TCPMon(listenPort, targetHost, targetPort, false)

	while (true) {
		sleep 100
	}
}

setDefaultTarget tcpmon
