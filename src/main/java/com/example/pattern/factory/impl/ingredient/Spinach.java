package com.example.pattern.factory.impl.ingredient;

import com.example.pattern.factory.api.ingredient.Veggies;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode = ScopedProxyMode.INTERFACES)
public class Spinach implements Veggies {

	public String toString() {
		return "Spinach";
	}
}
