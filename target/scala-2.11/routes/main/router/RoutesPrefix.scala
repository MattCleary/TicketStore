
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Eileen/Desktop/TicketStore/conf/routes
// @DATE:Tue Apr 18 11:33:33 BST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
