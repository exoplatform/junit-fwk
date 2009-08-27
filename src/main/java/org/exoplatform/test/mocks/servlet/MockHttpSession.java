/*
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.exoplatform.test.mocks.servlet;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 * Created by The eXo Platform SARL
 * Author : Mestrallet Benjamin
 *          benjmestrallet@users.sourceforge.net
 * Date: Jul 27, 2003
 * Time: 2:13:09 AM
 */
public class MockHttpSession implements HttpSession
{

   private Map map = new HashMap();

   public long getCreationTime()
   {
      return 0;
   }

   public String getId()
   {
      return "MockSessionId";
   }

   public long getLastAccessedTime()
   {
      return 0;
   }

   public ServletContext getServletContext()
   {
      return null;
   }

   public void setMaxInactiveInterval(int i)
   {
   }

   public int getMaxInactiveInterval()
   {
      return 0;
   }

   public HttpSessionContext getSessionContext()
   {
      return null;
   }

   public Object getAttribute(String s)
   {
      return map.get(s);
   }

   public Object getValue(String s)
   {
      return null;
   }

   public Enumeration getAttributeNames()
   {
      return new Vector(map.keySet()).elements();
   }

   public String[] getValueNames()
   {
      return new String[0];
   }

   public void setAttribute(String s, Object o)
   {
      map.put(s, o);
   }

   public void putValue(String s, Object o)
   {
   }

   public void removeAttribute(String s)
   {
      map.remove(s);
   }

   public void removeValue(String s)
   {
   }

   public void invalidate()
   {
   }

   public boolean isNew()
   {
      return false;
   }

}
