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

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.xml.namespace.QName;

/**
 * Created by The eXo Platform SARL
 * Author : Tuan Nguyen
 *          tuan08@users.sourceforge.net
 * Date: Jul 27, 2003
 * Time: 2:13:09 AM
 */
public class MockPortletConfig implements PortletConfig
{

   String portletName_;

   PortletContext context_ = null;

   Hashtable parameters_ = new Hashtable();

   ResourceBundle res_;

   public MockPortletConfig(PortletContext context)
   {
      parameters_ = new Hashtable();
      context_ = context;
      parameters_.put("template-location", "/WEB-INF/templates/html");
   }

   public String getPortletName()
   {
      return portletName_;
   }

   public void setPortletName(String name)
   {
      portletName_ = name;
   }

   public PortletContext getPortletContext()
   {
      return context_;
   }

   public void setResourceBundle(ResourceBundle res)
   {
      res_ = res;
   }

   public java.util.ResourceBundle getResourceBundle(java.util.Locale locale)
   {
      return res_;
   }

   public String getInitParameter(java.lang.String name)
   {
      return (String)parameters_.get(name);
   }

   public void setInitParameter(String name, String value)
   {
      parameters_.put(name, value);
   }

   public java.util.Enumeration getInitParameterNames()
   {
      return null;
   }

   public java.util.Enumeration getSupportedLocales()
   {
      return Collections.enumeration(Arrays.asList(new Locale("en")));
   }

   public String getDefaultNamespace()
   {
      return null;
   }

   public Enumeration<QName> getProcessingEventQNames()
   {
      return null;
   }

   public Enumeration<String> getPublicRenderParameterNames()
   {
      return null;
   }

   public Enumeration<QName> getPublishingEventQNames()
   {
      return null;
   }

   public java.util.Map<String, String[]> getContainerRuntimeOptions()
   {
      return java.util.Collections.emptyMap();
   }

}
