
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addEvent_Scope0 {
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

     object addEvent_Scope1 {
import helper._

class addEvent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Event],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(addEventForm: Form[models.Event],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.60*/("""

"""),_display_(/*5.2*/main("Add Event",user)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
"""),format.raw/*6.1*/("""<!--..CONTENT..-->
<div class="container-fluid" id="content">

<div class="row">
<div class="col-lg-12 well" id="addEvent">
<!-- Start of add event up form-->
		"""),_display_(/*12.4*/form(action = routes.HomeController.addEventSubmit(), 'class -> "form=horizontal", 'role->"form")/*12.101*/{_display_(Seq[Any](format.raw/*12.102*/("""

				"""),_display_(/*14.6*/inputText(addEventForm("eventName"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.87*/("""
				"""),_display_(/*15.6*/inputText(addEventForm("time"), '_label -> "Time", 'class -> "form-control")),format.raw/*15.82*/("""
				"""),_display_(/*16.6*/inputText(addEventForm("location"), '_label -> "Location", 'class -> "form-control")),format.raw/*16.90*/("""
				"""),_display_(/*17.6*/inputText(addEventForm("date"), '_label -> "Date", 'class -> "form-control")),format.raw/*17.82*/("""
				"""),_display_(/*18.6*/inputText(addEventForm("title"), '_label -> "Title", 'class -> "form-control")),format.raw/*18.84*/("""
				"""),_display_(/*19.6*/inputText(addEventForm("eventID"), '_label -> "", 'hidden -> "hidden")),format.raw/*19.76*/("""

			    """),_display_(/*21.9*/select(
					addEventForm("category.catID"), options(Category.options), '_label -> "Category", '_default -> ".. Choose a category .. ",
					'_showConstraints -> false, 'class -> "form-control"
				)),format.raw/*24.6*/("""

				"""),format.raw/*26.5*/("""<br>

				<div class="actions">
					<input type="submit" value="Add Event" class="btn btn-success">
					<a href=""""),_display_(/*30.16*/routes/*30.22*/.HomeController.events()),format.raw/*30.46*/("""" class="btn btn-danger">Cancel</a>
				</div>
			</div>
		</div>
	</div>
<!--END CONTENT-->

""")))}),format.raw/*37.2*/("""
""")))}))
      }
    }
  }

  def render(addEventForm:Form[models.Event],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addEventForm,user)

  def f:((Form[models.Event],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addEventForm,user) => apply(addEventForm,user)

  def ref: this.type = this

}


}
}

/**/
object addEvent extends addEvent_Scope0.addEvent_Scope1.addEvent
              /*
                  -- GENERATED --
                  DATE: Fri Apr 07 10:35:21 BST 2017
                  SOURCE: C:/Users/Eileen/Desktop/TicketStore/app/views/addEvent.scala.html
                  HASH: fd81a5d89d2afef649b878941640456bff191010
                  MATRIX: 828->21|981->79|1011->84|1041->106|1080->108|1108->110|1302->278|1409->375|1449->376|1484->385|1586->466|1619->473|1716->549|1749->556|1854->640|1887->647|1984->723|2017->730|2116->808|2149->815|2240->885|2278->897|2500->1099|2535->1107|2682->1227|2697->1233|2742->1257|2874->1359
                  LINES: 30->3|35->3|37->5|37->5|37->5|38->6|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|53->21|56->24|58->26|62->30|62->30|62->30|69->37
                  -- GENERATED --
              */
          