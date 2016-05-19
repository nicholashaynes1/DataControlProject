package data.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import data.model.Customer;
import data.model.Dish;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;

	public void start()
	{
		doStackStuff();
		doQueueStuff();
		
	}

	private void doStackStuff()
	{
		dishes = new Stack<Dish>();
		dishes.add(new Dish(false, java.awt.Color.BLACK, 8));
		System.out.println(dishes.size());
		dishes.pop();
		System.out.println(dishes.size());
		dishes.push(new Dish(true, java.awt.Color.BLUE, 45));
		
	}

	private void doQueueStuff()
	{
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(true, "Jon", 13));
		customerQueue.add(new Customer(true, "nick", 50));
		customerQueue.remove();
		
	}

}
