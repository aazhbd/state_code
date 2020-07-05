
class TemplateTransition {
	def generateHTML(Transition tn)'''
	<html>
		<title>Template for State</title>
		<body>
		<p>Name: «tn.label» Transition connecting «tn.start.label» state to «tn.end.label» state.</p>
		</body>
	</html>
	'''
}
