package com.example.pattern.factory.service.impl.ingredient;

import com.example.pattern.factory.service.api.ingredient.Clams;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FreshClams implements Clams {

	public String toString() {
		return "Fresh Clams from Long Island Sound "+this.hashCode();
	}
}
