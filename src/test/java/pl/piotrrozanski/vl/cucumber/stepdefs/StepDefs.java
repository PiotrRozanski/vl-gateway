package pl.piotrrozanski.vl.cucumber.stepdefs;

import pl.piotrrozanski.vl.VlGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = VlGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
