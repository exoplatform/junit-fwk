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

import junit.framework.TestCase;
import net.sf.cglib.reflect.FastClass;
import net.sf.cglib.reflect.FastMethod;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Apr 22, 2004
 * @author: Tuan Nguyen
 * @email:   tuan08@users.sourceforge.net
 * @version: $Id: TestMemthodInvokation.java 5799 2006-05-28 17:55:42Z geaz $
 **/
public class TestMemthodInvokation extends TestCase
{
   private ThreadMXBean threadBean_;

   public TestMemthodInvokation()
   {
      threadBean_ = ManagementFactory.getThreadMXBean();
   }

   public void testBenchMark() throws Exception
   {
      for (int i = 0; i < 2; i++)
      {
         int loop = i * 5 + 10;
         singleInstruction(loop);
         emptyMethodCall(loop);
         directCall(loop);
         directSynchronizedCall(loop);
         newObject(loop);
         reflectionCall("setter", loop);
         reflectionCall("setterSynchronized", loop);
         reflectionMethodCall("setter", loop);
         reflectionMethodCall("setterSynchronized", loop);
         reflectionMethodCallCache("setter", loop);
         reflectionMethodCallCache("setterSynchronized", loop);
         reflectionMethodCallCGLIB("getter", loop);
         reflectionFastMethod("getter", loop);
         System.out.println("===========================================================");
      }
   }

   private void singleInstruction(int numOfCall)
   {
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         int a = i;
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("singleInstruction()", numOfCall, start, end);
   }

   private void emptyMethodCall(int numOfCall)
   {
      Dummy dummy = new Dummy();
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         dummy.empty();
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("emptyMethodCall()", numOfCall, start, end);
   }

   private void directCall(int numOfCall)
   {
      Dummy dummy = new Dummy();
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         dummy.setter("dummy");
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("directCall()", numOfCall, start, end);
   }

   private void newObject(int numOfCall)
   {
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         Dummy dummy = new Dummy();
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("newObject()", numOfCall, start, end);
   }

   private void directSynchronizedCall(int numOfCall)
   {
      Dummy dummy = new Dummy();
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         dummy.setterSynchronized("dummy");
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("directSynchronizedCall()", numOfCall, start, end);
   }

   private void reflectionCall(String methodName, int numOfCall) throws Exception
   {
      Object dummy = new Dummy();
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      Class[] types = {String.class};
      Object[] args = {"dummy"};
      for (int i = 0; i < numOfCall; i++)
      {
         Method method = dummy.getClass().getMethod(methodName, types);
         method.invoke(dummy, args);
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("reflectionCall(), method: " + methodName, numOfCall, start, end);
   }

   private void reflectionMethodCall(String methodName, int numOfCall) throws Exception
   {
      Dummy dummy = new Dummy();
      Method method = dummy.getClass().getMethod(methodName, new Class[]{String.class});
      Class[] types = {String.class};
      Object[] args = {"dummy"};
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         method.invoke(dummy, args);
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("reflectionMethodCall(), method: " + methodName, numOfCall, start, end);
   }

   private void reflectionMethodCallCache(String methodName, int numOfCall) throws Exception
   {
      Dummy dummy = new Dummy();
      Map map = new HashMap();
      Method method = dummy.getClass().getMethod(methodName, new Class[]{String.class});
      map.put(methodName, method);
      Object[] args = {"dummy"};
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         Method m = (Method)map.get(methodName);
         m.invoke(dummy, args);
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("reflectionCallMethodCache(), method: " + methodName, numOfCall, start, end);
   }

   private void reflectionMethodCallCGLIB(String methodName, int numOfCall) throws Exception
   {
      FastClass fc = FastClass.create(Dummy.class);
      Dummy dummy = new Dummy();
      Object[] args = {"dummy"};
      Class[] emptyType = {};
      Object[] emptyArgs = {};
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         fc.invoke(methodName, emptyType, dummy, emptyArgs);
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("reflectionCallMethodCGLIB(), method: " + methodName, numOfCall, start, end);
   }

   private void reflectionFastMethod(String methodName, int numOfCall) throws Exception
   {
      Class[] emptyType = {};
      Object[] emptyArgs = {};
      FastClass fc = FastClass.create(Dummy.class);
      FastMethod fm = fc.getMethod(methodName, emptyType);
      Dummy dummy = new Dummy();
      Object[] args = {"dummy"};
      long start = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      for (int i = 0; i < numOfCall; i++)
      {
         Object o = fm.invoke(dummy, null);
      }
      long end = threadBean_.getThreadCpuTime(Thread.currentThread().getId());
      printInfo("reflectionFastMethod(), method: " + methodName, numOfCall, start, end);
   }

   private void printInfo(String method, int numOfCall, long start, long end)
   {
      System.out.println("Call method " + method + " " + numOfCall + " times in " + ((double)(end - start))
         / (1000 * 1000) + "ms");
   }
}
