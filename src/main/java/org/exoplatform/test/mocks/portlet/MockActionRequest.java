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

import javax.portlet.ActionRequest;

/**
 * Created by The eXo Platform SARL
 * Author : Tuan Nguyen
 *          tuan08@users.sourceforge.net
 * Date: Jul 27, 2003
 * Time: 2:13:09 AM
 */
public class MockActionRequest extends MockPortletRequest implements ActionRequest
{

   public MockActionRequest()
   {
      super();
   }

   public java.io.InputStream getPortletInputStream() throws java.io.IOException
   {
      return null;
   }

   public void setCharacterEncoding(String enc) throws java.io.UnsupportedEncodingException
   {

   }

   public java.io.BufferedReader getReader() throws java.io.UnsupportedEncodingException, java.io.IOException
   {
      return null;
   }

   public java.lang.String getCharacterEncoding()
   {
      return "default";
   }

   public java.lang.String getContentType()
   {
      return "text/html";
   }

   public int getContentLength()
   {
      return 0;
   }

   public String getMethod()
   {
      return "POST";
   }

}