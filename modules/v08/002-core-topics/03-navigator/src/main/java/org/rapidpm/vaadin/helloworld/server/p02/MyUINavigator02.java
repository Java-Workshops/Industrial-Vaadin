package org.rapidpm.vaadin.helloworld.server.p02;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import org.rapidpm.vaadin.helloworld.server.CoreUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.function.Supplier;

/**
 * will crash on OSX and OpenJDK8 (9 and 10 is ok) -> Linkage error
 *
 * Build a CustomerForm with i18n support
 */
@PreserveOnRefresh
public class MyUINavigator02 extends CoreUI {


  @Override
  public Supplier<Component> componentSupplier() {
    return () -> new Label("not yet implemented...");
  }


  @WebServlet("/*")
  @VaadinServletConfiguration(productionMode = false, ui = MyUINavigator02.class)
  public static class CoreServlet extends VaadinServlet {
  }

  @Override
  public Class<? extends VaadinServlet> servletClass() {
    return CoreServlet.class;
  }

  public static void main(String[] args) throws ServletException {
    new MyUINavigator02().startup();
  }

}
