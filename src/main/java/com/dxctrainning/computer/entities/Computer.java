package com.dxctrainning.computer.entities;

import javax.persistence.Entity;

import javax.persistence.Table;

import com.dxctrainning.item.entities.*;
import com.dxctrainning.supplier.entities.*;

@Entity

@Table(name = "computers")

public class Computer extends Item {
	private int discSize;

	public Computer(int id, String name, Supplier supplier, int discSize) {

		super(id, name, supplier);

		this.discSize = discSize;

	}

	public int getDiscSize() {

		return discSize;

	}

	public void setDiskSize(int diskSize) {

		this.discSize = discSize;

	}

}