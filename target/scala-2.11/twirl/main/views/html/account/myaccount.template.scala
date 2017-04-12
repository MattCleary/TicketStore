
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myaccount_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class myaccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("My Orders", user)/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""


    """),format.raw/*5.5*/("""<div class="container text-center" id="content">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="user-order-display">
            <div class="row">
                <h1>My Account</h1>
                <a href = """"),_display_(/*9.29*/routes/*9.35*/.HomeController.myOrders()),format.raw/*9.61*/("""" class="btn btn-success btn-lg" id="user-order-button">
                    <span class="glyphicon glyphicon-calendar"></span>My Orders
                </a>

                <a href = """"),_display_(/*13.29*/routes/*13.35*/.HomeController.updateDetails()),format.raw/*13.66*/("""" class="btn btn-success btn-lg" id="user-account-button">
                    <span class="glyphicon glyphicon-user"></span>Change Password
                </a>


                <a href = """"),_display_(/*18.29*/routes/*18.35*/.LoginController.deleteAccountPage()),format.raw/*18.71*/("""" type="button" class="btn btn-success btn-lg" id="user-delete-button">
                    <span class="glyphicon glyphicon-trash"></span>Delete Account
                </a>

                <a href = """"),_display_(/*22.29*/routes/*22.35*/.HomeController.reportProblem()),format.raw/*22.66*/("""" type="button" class="btn btn-success btn-lg" id="user-problem-button">
                    <span class="glyphicon glyphicon-envelope"></span>Report problem
                </a>

                <hr>
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object myaccount extends myaccount_Scope0.myaccount
              /*
                  -- GENERATED --
                  DATE: Wed Apr 12 13:31:40 IST 2017
                  SOURCE: /home/wdd/webapps/TicketStore/app/views/account/myaccount.scala.html
                  HASH: c5c0423f0bc9a098eaab79bfe691ba4ed825eec2
                  MATRIX: 772->1|892->26|919->28|950->51|989->53|1022->60|1277->289|1291->295|1337->321|1551->508|1566->514|1618->545|1837->737|1852->743|1909->779|2140->983|2155->989|2207->1020
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|40->9|40->9|40->9|44->13|44->13|44->13|49->18|49->18|49->18|53->22|53->22|53->22
                  -- GENERATED --
              */
          