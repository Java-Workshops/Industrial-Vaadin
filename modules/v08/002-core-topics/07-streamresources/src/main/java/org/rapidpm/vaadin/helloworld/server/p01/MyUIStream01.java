package org.rapidpm.vaadin.helloworld.server.p01;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.ClassResource;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Component;
import com.vaadin.ui.Image;
import org.rapidpm.vaadin.helloworld.server.CoreUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.function.Supplier;

/**
 *
 */
public class MyUIStream01 extends CoreUI {


  @Override
  public Supplier<Component> componentSupplier() {
    return () -> new Image("Nasa Pic", new ClassResource("/nasa_pic_00085.jpg"));
  }


  @WebServlet("/*")
  @VaadinServletConfiguration(productionMode = false, ui = MyUIStream01.class)
  public static class CoreServlet extends VaadinServlet {
  }

  @Override
  public Class<? extends VaadinServlet> servletClass() {
    return CoreServlet.class;
  }

  public static void main(String[] args) throws ServletException {
    new MyUIStream01().startup();
  }
}
