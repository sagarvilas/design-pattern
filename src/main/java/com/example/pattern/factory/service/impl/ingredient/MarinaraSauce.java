package com.example.pattern.factory.service.impl.ingredient;

import com.example.pattern.factory.service.api.ingredient.Sauce;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MarinaraSauce implements Sauce {
	public String toString() {
		return "Marinara Sauce "+this.hashCode();
	}
}
