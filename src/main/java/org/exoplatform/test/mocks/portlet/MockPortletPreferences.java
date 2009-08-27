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

import java.util.Hashtable;

import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

/**
 * Created by The eXo Platform SARL
 * Author : Tuan Nguyen
 *          tuan08@users.sourceforge.net
 * Date: Jul 27, 2003
 * Time: 2:13:09 AM
 */
public class MockPortletPreferences implements PortletPreferences
{
   private Hashtable map_;

   public MockPortletPreferences()
   {
      map_ = new Hashtable();
   }

   public boolean isReadOnly(String key)
   {
      return true;
   }

   public String getValue(String key, String def)
   {
      String value = (String)map_.get(key);
      if (value == null)
         value = def;
      return value;
   }

   public String[] getValues(String key, String[] def)
   {
      String[] values = (String[])map_.get(key);
      if (values == null)
         values = def;
      return values;
   }

   public void setValue(String key, String value) throws ReadOnlyException
   {
      map_.put(key, value);
   }

   public void setValues(String key, String[] values) throws ReadOnlyException
   {
      map_.put(key, values);
   }

   public java.util.Enumeration getNames()
   {
      return map_.keys();
   }

   public java.util.Map getMap()
   {
      return map_;
   }

   public void reset(String key) throws ReadOnlyException
   {
      map_.remove(key);
   }

   public void store() throws java.io.IOException, ValidatorException
   {

   }
}
