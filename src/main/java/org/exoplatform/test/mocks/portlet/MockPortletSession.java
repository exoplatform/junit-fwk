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
package org.exoplatform.test.mocks.portlet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.PortletContext;
import javax.portlet.PortletSession;

/**
 * Created by The eXo Platform SARL
 * Author : Tuan Nguyen
 *          tuan08@users.sourceforge.net
 * Date: Jul 27, 2003
 * Time: 2:13:09 AM
 */
public class MockPortletSession implements PortletSession
{
   HashMap attributes_;

   HashMap appAttributes_;

   public MockPortletSession()
   {
      super();
      attributes_ = new HashMap();
      appAttributes_ = new HashMap();
   }

   public Object getAttribute(String name)
   {
      return attributes_.get(name);
   }

   public Object getAttribute(String name, int scope)
   {
      if (scope == PortletSession.APPLICATION_SCOPE)
      {
         return appAttributes_.get(name);
      }
      else
      {
         return attributes_.get(name);
      }
   }

   public void setAttribute(String name, Object obj)
   {
      attributes_.put(name, obj);
   }

   public void setAttribute(String name, Object obj, int scope)
   {
      if (scope == PortletSession.APPLICATION_SCOPE)
      {
         appAttributes_.put(name, obj);
      }
      else
      {
         attributes_.put(name, obj);
      }
   }

   public void removeAttribute(String name)
   {
      attributes_.remove(name);
   }

   public void removeAttribute(String name, int scope)
   {
      if (scope == PortletSession.APPLICATION_SCOPE)
      {
         appAttributes_.remove(name);
      }
      else
      {
         attributes_.remove(name);
      }
   }

   public Map getAttributeMap()
   {
      return getAttributeMap(PortletSession.PORTLET_SCOPE);
   }

   public Map getAttributeMap(int scope)
   {
      if (scope == PortletSession.APPLICATION_SCOPE)
      {
         return Collections.unmodifiableMap(appAttributes_);
      }
      else
      {
         return Collections.unmodifiableMap(attributes_);
      }
   }

   public java.util.Enumeration getAttributeNames()
   {
      return null;
   }

   public java.util.Enumeration getAttributeNames(int scope)
   {
      return null;
   }

   public long getCreationTime()
   {
      return 0;
   }

   public java.lang.String getId()
   {
      return new String(Integer.toString(this.hashCode()));
   }

   public long getLastAccessedTime()
   {
      return 0;
   }

   public int getMaxInactiveInterval()
   {
      return 0;
   }

   public void invalidate()
   {
   }

   public boolean isNew()
   {
      return false;
   }

   public void setMaxInactiveInterval(int interval)
   {

   }

   public PortletContext getPortletContext()
   {
      return null;
   }

}
