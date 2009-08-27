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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Locale;

import javax.portlet.CacheControl;
import javax.portlet.PortletMode;
import javax.portlet.PortletURL;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceURL;

/**
 * @author  Mestrallet Benjamin
 *          benjmestrallet@users.sourceforge.net
 * Date: 10 feb. 2004
 * Time: 19:58:17
 */
public class MockRenderResponse extends MockPortletResponse implements RenderResponse
{

   public String getContentType()
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public PortletURL createRenderURL()
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public PortletURL createActionURL()
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public String getNamespace()
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setTitle(String string)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setContentType(String string)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public String getCharacterEncoding()
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public PrintWriter getWriter() throws IOException
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public Locale getLocale()
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setBufferSize(int i)
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public int getBufferSize()
   {
      return 0; //To change body of implemented methods use File | Settings | File Templates.
   }

   public void flushBuffer() throws IOException
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public void resetBuffer()
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public boolean isCommitted()
   {
      return false; //To change body of implemented methods use File | Settings | File Templates.
   }

   public void reset()
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }

   public OutputStream getPortletOutputStream() throws IOException
   {
      return null; //To change body of implemented methods use File | Settings | File Templates.
   }

   public void setNextPossiblePortletModes(java.util.Collection<PortletMode> portletModes)
   {
   }

   public ResourceURL createResourceURL() throws IllegalStateException
   {
      // TODO Auto-generated method stub
      return null;
   }

   public CacheControl getCacheControl()
   {
      // TODO Auto-generated method stub
      return null;
   }

}