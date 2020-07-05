
class TemplateStateNode {
	def generateHTML(StateNode sn)'''
	<html>
		<title>Template for State</title>
		<body>
		<p>Name: «sn.label» State.</p>
		
		«IF sn.machine !== null »
		<p>It is a complex state containing: «sn.machine.label».</p>
		«ENDIF»
		
		</body>
	</html>
	'''
}
