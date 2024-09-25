package com.example.Task_17.outsourcedServices;

import com.example.Task_17.model.Book;

import java.util.List;

public interface IEvaluationService {

    Double calculateTotalPrice(List<Book> books);
}
