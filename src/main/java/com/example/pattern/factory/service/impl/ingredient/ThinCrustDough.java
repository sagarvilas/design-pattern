package com.example.pattern.factory.service.impl.ingredient;

import com.example.pattern.factory.service.api.ingredient.Dough;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ThinCrustDough implements Dough {
    public String toString() {
        return "Thin Crust Dough " + this.hashCode();
    }
}
