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
package org.exoplatform.test.jvm15;

/**
 * Apr 22, 2004
 * @author: Tuan Nguyen
 * @email:   tuan08@users.sourceforge.net
 * @version: $Id: Dummy.java 5799 2006-05-28 17:55:42Z geaz $
 **/
public class Dummy
{
   private String str;

   public Dummy()
   {
      this.str = new String("test");
   }

   public void setter(String str)
   {
      this.str = str;
   }

   public String getter()
   {
      return this.str;
   }

   synchronized public String getterSynchronized()
   {
      return str;
   }

   synchronized public void setterSynchronized(String s)
   {
      str = s;
   }

   public void empty()
   {
   }
}