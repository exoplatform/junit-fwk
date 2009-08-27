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
package org.exoplatform.test.mocks.portlet;import javax.portlet.PortletResponse;import javax.servlet.http.Cookie;/** * Created by The eXo Platform SARL * Author : Tuan Nguyen *          tuan08@users.sourceforge.net * Date: Jul 27, 2003 * Time: 2:13:09 AM */public class MockPortletResponse implements PortletResponse{   public void addProperty(String key, String value)   {   }   public void setProperty(String key, String value)   {   }   public String encodeURL(String path)   {      return path;   }   public void addProperty(String key, org.w3c.dom.Element element)   {   }   public void addProperty(Cookie arg0)   {   }   public String getNamespace()   {      return null;   }   public org.w3c.dom.Element createElement(String tagName) throws org.w3c.dom.DOMException   {      return null;   }}