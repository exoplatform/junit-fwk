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

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import javax.portlet.ActionResponse;
import javax.portlet.PortletMode;
import javax.portlet.PortletModeException;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.xml.namespace.QName;

/**
 * Created by The eXo Platform SARL
 * Author : Mestrallet Benjamin
 *          benjmestrallet@users.sourceforge.net
 * Date: Sep 11, 2003
 * Time: 8:26:13 PM
 */
public class MockActionResponse extends MockPortletResponse implements ActionResponse
{

   public void setWindowState(WindowState windowState) throws WindowStateException
   {
   }

   public void setPortletMode(PortletMode portletMode) throws PortletModeException
   {
   }

   public void sendRedirect(String s) throws IOException
   {
   }

   public void sendRedirect(String location, String renderUrlParamName) throws IOException
   {
   }

   public void setRenderParameters(Map map)
   {
   }

   public void setRenderParameter(String s, String s1)
   {
   }

   public void setRenderParameter(String s, String[] strings)
   {
   }

   public PortletMode getPortletMode()
   {
      return null;
   }

   public Map<String, String[]> getRenderParameterMap()
   {
      return null;
   }

   public WindowState getWindowState()
   {
      return null;
   }

   public void removePublicRenderParameter(String arg0)
   {
   }

   public void setEvent(QName arg0, Serializable arg1)
   {
   }

   public void setEvent(String arg0, Serializable arg1)
   {
   }

}
