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
import java.util.Locale;
import java.util.Map;

import javax.portlet.PortalContext;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.WindowState;
import javax.servlet.http.Cookie;

public class MockPortletRequest implements PortletRequest
{
   private Map parameters_;

   private Map attributes_;

   private PortletSession session_;

   private PortletMode portletMode_;

   private String role_ = "none";

   private String remoteUser_;

   private PortletPreferences prefs_;

   public MockPortletRequest()
   {
      parameters_ = new Hashtable();
      attributes_ = new Hashtable();
      session_ = new MockPortletSession();
      portletMode_ = PortletMode.VIEW;
      prefs_ = new MockPortletPreferences();

   }

   public boolean isWindowStateAllowed(WindowState state)
   {
      return true;
   }

   public boolean isPortletModeAllowed(PortletMode mode)
   {
      return true;
   }

   public PortletMode getPortletMode()
   {
      return portletMode_;
   }

   public void setPortletMode(PortletMode mode)
   {
      portletMode_ = mode;
   }

   public WindowState getWindowState()
   {
      return WindowState.NORMAL;
   }

   public void setPreferences(PortletPreferences prefs)
   {
      prefs_ = prefs;
   }

   public PortletPreferences getPreferences()
   {
      return prefs_;
   }

   public PortletSession getPortletSession()
   {
      return session_;
   }

   public PortletSession getPortletSession(boolean create)
   {
      return session_;
   }

   public String getProperty(String name)
   {
      return "not support";
   }

   public java.util.Enumeration getProperties(String name)
   {
      return null;
   }

   public java.util.Enumeration getPropertyNames()
   {
      return null;
   }

   public PortalContext getPortalContext()
   {
      return null;
   }

   public java.lang.String getAuthType()
   {
      return null;
   }

   public String getContextPath()
   {
      return null;
   }

   public void setRemoteUser(String user)
   {
      remoteUser_ = user;
   }

   public java.lang.String getRemoteUser()
   {
      return remoteUser_;
   }

   public java.security.Principal getUserPrincipal()
   {
      return null;
   }

   public void setUserInRole(String role)
   {
      role_ = role;
   }

   public boolean isUserInRole(java.lang.String role)
   {
      return role_.equals(role);
   }

   public Object getAttribute(String name)
   {
      return attributes_.get(name);
   }

   public java.util.Enumeration getAttributeNames()
   {
      return null;
   }

   public String getParameter(String name)
   {
      return (String)parameters_.get(name);
   }

   public void setParameter(String name, Object value)
   {
      parameters_.put(name, value);
   }

   public java.util.Enumeration getParameterNames()
   {
      return null;
   }

   public String[] getParameterValues(String name)
   {
      return (String[])parameters_.get(name);
   }

   public java.util.Map getParameterMap()
   {
      return parameters_;
   }

   public java.util.Map getPublicParameterMap()
   {
      return parameters_;
   }

   public boolean isSecure()
   {
      return false;
   }

   public void setAttribute(String name, Object o)
   {
      attributes_.put(name, o);
   }

   public void removeAttribute(String name)
   {
      attributes_.remove(name);
   }

   public String getRequestedSessionId()
   {
      return session_.getId();
   }

   public boolean isRequestedSessionIdValid()
   {
      return true;
   }

   public String getResponseContentType()
   {
      return "txt/html";
   }

   public java.util.Enumeration getResponseContentTypes()
   {
      return null;
   }

   public java.util.Locale getLocale()
   {
      return Locale.US;
   }

   public java.util.Enumeration getLocales()
   {
      return null;
   }

   public String getScheme()
   {
      return "http://";
   }

   public String getServerName()
   {
      return "localhost";
   }

   public int getServerPort()
   {
      return 8080;
   }

   public Cookie[] getCookies()
   {
      return null;
   }

   public Map<String, String[]> getPrivateParameterMap()
   {
      return null;
   }

   public String getWindowID()
   {
      return null;
   }
}