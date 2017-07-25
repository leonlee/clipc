/*******************************************************************************
 * Copyright 2009, Clark N. Hobbie
 * 
 * This file is part of the CLIPC library.
 * 
 * The CLIPC library is free software; you can redistribute it and/or modify it
 * under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 * 
 * The CLIPC library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the Lesser GNU General Public
 * License for more details.
 * 
 * You should have received a copy of the Lesser GNU General Public License
 * along with the CLIP library; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 * 
 *******************************************************************************/
package com.lts.swing.table.rowmodel.tablemodel;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import com.lts.swing.table.TableModelHelper;
import com.lts.swing.table.rowmodel.RowModel;

/**
 * A TableModel that uses a RowModel to access the underlying column data.
 * 
 * <H3>Description</H3>
 * Subclasses need to implement getRowCount
 * @author cnh
 *
 */
abstract public class SimpleRowModelTableModel implements TableModel
{
	abstract public int getRowCount();
	abstract public Object getRowData(int rowIndex);
	abstract public void deleteRow(int rowIndex);
	abstract public void insertRow(int rowIndex, Object rowData);
	
	public void append (Object o)
	{
		int index = getRowCount();
		insertRow(index, o);
	}
	
	private RowModel myRowModel;
	protected TableModelHelper myHelper;
	protected boolean[] myEditable;
	
	
	public void setRowModel(RowModel rowModel)
	{
		myRowModel = rowModel;
	}
	
	public RowModel getRowModel()
	{
		return myRowModel;
	}
	
	protected void initialize()
	{
		myHelper = new TableModelHelper(this);
	}
	
	protected void initializeRowModel (RowModel rowModel)
	{
		myRowModel = rowModel;
		int columns = myRowModel.getColumnCount();
		myEditable = new boolean[columns];
		for (int i = 0; i < columns; i++)
		{
			myEditable[i] = false;
		}
	}


	public void addTableModelListener(TableModelListener l)
	{
		myHelper.addListener(l);
	}


	public Class<?> getColumnClass(int columnIndex)
	{
		return myRowModel.getColumnClass(columnIndex);
	}


	public int getColumnCount()
	{
		return myRowModel.getColumnCount();
	}


	public String getColumnName(int columnIndex)
	{
		return myRowModel.getColumnName(columnIndex);
	}


	public Object getValueAt(int rowIndex, int columnIndex)
	{
		Object row = getRowData(rowIndex);
		return myRowModel.getValueAt(columnIndex, row);
	}


	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
		return myEditable[columnIndex];
	}


	public void removeTableModelListener(TableModelListener l)
	{
		myHelper.removeListener(l);
	}


	public void setValueAt(Object aValue, int rowIndex, int columnIndex)
	{
		throw new UnsupportedOperationException();
	}
	
	public Object[] copyRowData(int row)
	{
		Object[] rowData = new Object[getColumnCount()];
		for (int i = 0; i < rowData.length; i++)
		{
			rowData[i] = getValueAt(row,i);
		}
		
		return rowData;
	}
	
}
