
def method = request.method

if (!session) {
  session = request.getSession(true)
}

if (!session.groovlet) {
  session.groovlet = 'Groovlets rock!'
  session.object = [name:"Brandon"]
}

html.html {
  head {
    title 'Groovlet info'
  }
  body {
    h1 'Saludo'
    ul {
      li "Luis Wey"
      li "${session.object} this my object or map"
    }

    h1 'Headers'
    ul {
      "Hola Papu mundo"
      }
    }
}
