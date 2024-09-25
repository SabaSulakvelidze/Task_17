package com.example.Task_17.outsourcedServices;

import com.example.Task_17.model.Book;

import java.util.List;
import java.util.Random;

public class SecondEvaluationService implements IEvaluationService{
    @Override
    public Double calculateTotalPrice(List<Book> books) {
        Double result = 0.0;
        for (Book book : books) {
            result+=book.getPrice();
        }
        return result;
    }
}
