package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.view.IView;

public class Controller {
	private IModel model;
	private IView view;
	
	public Controller(IModel model2, IView view2) {
		model = model2;
		view = view2;
	}
	
	public void run() {
		view.display(model.getMessage());
	}
}


