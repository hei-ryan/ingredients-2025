package com.ingredients.validator;

import org.springframework.stereotype.Component;

@Component
public class IngredientValidator {

    public void validateStockParams(String at, String unit) {

        if (at == null || unit == null) {
            throw new IllegalArgumentException(
                    "Either mandatory query parameter 'at' or 'unit' is not provided."
            );
        }

        if (!unit.equals("KG") && !unit.equals("L") && !unit.equals("PCS")) {
            throw new IllegalArgumentException("Invalid unit value");
        }
    }
}