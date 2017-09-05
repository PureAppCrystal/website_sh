package com.sh.mysite.action.main;

import com.sh.web.Action;
import com.sh.web.ActionFactory;

public class MainActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		return new MainAction();
	}

}
