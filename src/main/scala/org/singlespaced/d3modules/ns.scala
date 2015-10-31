package org.singlespaced.d3modules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSBracketAccess, JSName}

@JSName("d3.ns")
@js.native
trait NsObject extends js.Object {

  import nsModule._

  def qualify(name: String): Qualified | String = js.native

  def prefix: PrefixObject = js.native

}
package nsModule {

@js.native
trait Qualified extends js.Object {
  var space: String = js.native
  var local: String = js.native
}

@js.native
@JSName("d3.ns.prefix")
trait PrefixObject extends js.Object {
  @JSBracketAccess
  def apply(key: String): String = js.native

  @JSBracketAccess
  def update(key: String, v: String): Unit = js.native
}

}

