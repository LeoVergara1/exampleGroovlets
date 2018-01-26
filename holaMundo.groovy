
def method = request.method

if (!session) {
  session = request.getSession(true)
}

if (!session.groovlet) {
  session.groovlet = 'Groovlets rock!'
}

html.html {
  head {
    title 'Groovlet info'
  }
  body {
    h1 'Saludo'
    ul {
      li "Luis Wey"
    }

    h1 'Headers'
    ul {
      "Hola Papu mundo"
      }
    }
}
