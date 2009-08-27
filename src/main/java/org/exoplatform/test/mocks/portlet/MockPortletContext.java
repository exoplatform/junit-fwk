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

import org.exoplatform.test.mocks.servlet.MockServletContext;

import javax.portlet.PortletContext;
import javax.portlet.PortletRequestDispatcher;

/**
 * Created by The eXo Platform SARL
 * Author : Tuan Nguyen
 *          tuan08@users.sourceforge.net
 * Date: Jul 27, 2003
 * Time: 2:13:09 AM
 */
public class MockPortletContext implements PortletContext
{

   private String realPath_ = "./";

   private String contextName_;

   public String getServerInfo()
   {
      return null;
   }

   public PortletRequestDispatcher getRequestDispatcher(String path)
   {
      return null;
   }

   public PortletRequestDispatcher getNamedDispatcher(String name)
   {
      return null;
   }

   public java.io.InputStream getResourceAsStream(String path)
   {
      return null;
   }

   public int getMajorVersion()
   {
      return 1;
   }

   public int getMinorVersion()
   {
      return 0;
   }

   public String getMimeType(String file)
   {
      return null;
   }

   public String getRealPath(String path)
   {
      return realPath_;
   }

   public java.util.Set getResourcePaths(String path)
   {
      return null;
   }

   public java.net.URL getResource(String path) throws java.net.MalformedURLException
   {
      return null;
   }

   public java.lang.Object getAttribute(java.lang.String name)
   {
      return null;
   }

   public java.util.Enumeration getAttributeNames()
   {
      return null;
   }

   public java.lang.String getInitParameter(java.lang.String name)
   {
      return null;
   }

   public java.util.Enumeration getInitParameterNames()
   {
      return null;
   }

   public void log(java.lang.String msg)
   {
      System.out.println(msg);
   }

   public void log(java.lang.String message, java.lang.Throwable throwable)
   {
      System.out.println(message);
      throwable.printStackTrace();
   }

   public void removeAttribute(java.lang.String name)
   {
   }

   public void setAttribute(java.lang.String name, java.lang.Object object)
   {
   }

   public String getPortletContextName()
   {
      return contextName_;
   }

   public void setPortletContextName(String name)
   {
      contextName_ = name;
   }

   public MockServletContext getWrappedServletContext()
   {
      return new MockServletContext(contextName_);
   }

   public java.util.Enumeration<String> getContainerRuntimeOptions()
   {
      return java.util.Collections.enumeration(new java.util.ArrayList<java.lang.String>());
   }

}
