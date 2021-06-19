package com.example.pattern.factory.impl.ingredient;

import com.example.pattern.factory.api.ingredient.Cheese;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;


@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode = ScopedProxyMode.INTERFACES)
public class ReggianoCheese implements Cheese {

	public String toString() {
		return "Reggiano Cheese";
	}
}
