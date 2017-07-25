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
package com.lts.xml.simple;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import com.lts.util.StringUtils;

/**
 * This class signals a problem of some kind during the conversion process.
 * 
 * @author cnh
 *
 */
@SuppressWarnings("serial")
public class ConversionException extends Exception
{
	public enum ConversionDirection
	{
		/**
		 * when converting org.w3c.dom Elements to SimpleElements
		 */
		FromOwdToSimple, 
		
		/**
		 * when converting SimpleElements to org.w3c.dom.Elements
		 */
		FromSimpleToOwd  
	}

	/**
	 * Indicates if this was from an OWD element to a SimpleElement or the other way
	 * around.
	 */
	private ConversionDirection myDirection;
	
	private Node myNode;
	
	public ConversionException(ConversionDirection direction)
	{
		super();
		myDirection = direction;
	}
	
	public ConversionException(ConversionDirection direction, String message)
	{
		super(message);
		myDirection = direction;
	}
	
	public ConversionException(
			ConversionDirection direction, 
			Node node,
			String string)
	{
		super(string);
		myDirection = direction;
		myNode = node; 
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append (myDirection);
		String s = StringUtils.trim(getMessage());
		if (null != s)
		{
			sb.append (", ");
			sb.append(s);
		}
		
		return sb.toString();		
	}

	public ConversionDirection getDirection()
	{
		return myDirection;
	}

	public void setDirection(ConversionDirection direction)
	{
		myDirection = direction;
	}

	public Node getNode()
	{
		return myNode;
	}

	public void setNode(Node node)
	{
		myNode = node;
	}
	
	public List<Node> getNodeChain()
	{
		List<Node> list = new ArrayList<Node>();
		addToChain(list);
		return list;
	}
	
	
	protected void addToChain(List<Node> list)
	{
		Throwable t = getCause();
		if (null != t && t instanceof ConversionException)
		{
			ConversionException cex = (ConversionException) t;
			cex.addToChain(list);
			
			if (null != getNode())
			{
				list.add(getNode());
			}
		}
	}
}
