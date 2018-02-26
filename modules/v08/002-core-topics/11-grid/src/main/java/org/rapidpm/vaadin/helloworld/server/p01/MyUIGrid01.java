package org.rapidpm.vaadin.helloworld.server.p01;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.ValueProvider;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Component;
import com.vaadin.ui.DescriptionGenerator;
import com.vaadin.ui.Grid;
import org.rapidpm.vaadin.helloworld.server.CoreUI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Stream.of;

/**
 *
 */
public class MyUIGrid01 extends CoreUI {


  public Stream<DataHolder> values() {
    return of(
        new DataHolder("AF", "AL"),
        new DataHolder("BF", "BL"),
        new DataHolder("CF", "CL"),
        new DataHolder("DF", "DL")
    );
  }


  @Override
  public Supplier<Component> componentSupplier() {
    return () -> {
      final Grid<DataHolder> grid = new Grid<>();
      grid.addColumn(DataHolder::getFirstName).setCaption("First Name");
      grid.addColumn(DataHolder::getLastName).setCaption("Last Name");
      grid.setSelectionMode(Grid.SelectionMode.SINGLE);
      grid.setFooterVisible(true);
      grid.setDescriptionGenerator(dataHolder -> "Description of " + dataHolder.getFirstName());
      grid.setItems(values());
      return grid;
    };
  }


  @WebServlet("/*")
  @VaadinServletConfiguration(productionMode = false, ui = MyUIGrid01.class)
  public static class CoreServlet extends VaadinServlet {
  }

  @Override
  public Class<? extends VaadinServlet> servletClass() {
    return CoreServlet.class;
  }

  public static void main(String[] args) throws ServletException {
    new MyUIGrid01().startup();
  }
}
