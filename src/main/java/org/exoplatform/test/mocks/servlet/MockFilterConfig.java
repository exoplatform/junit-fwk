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

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;

/**
 * Created by The eXo Platform SAS        .
 * @author Gennady Azarenkov
 * @version $Id: $
 */

public class MockFilterConfig implements FilterConfig
{

   private ServletContext servletContext;

   public MockFilterConfig(ServletContext servletContext)
   {
      super();
      this.servletContext = servletContext;
   }

   public String getFilterName()
   {
      return "mock-filter";
   }

   public String getInitParameter(String arg0)
   {
      // TODO Auto-generated method stub
      return null;
   }

   public Enumeration getInitParameterNames()
   {
      // TODO Auto-generated method stub
      return null;
   }

   public ServletContext getServletContext()
   {
      return servletContext;
   }

}
