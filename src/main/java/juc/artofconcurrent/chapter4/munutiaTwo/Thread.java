//package juc.artofconcurrent.chapter4.munutiaTwo;
//
//import java.security.AccessControlContext;
//import java.security.AccessController;
//
///**
// * 线程的构造
// * Created by manji on 2018/5/28.
// */
//public class Thread extends java.lang.Thread{
//
//    private static final RuntimePermission SUBCLASS_IMPLEMENTATION_PERMISSION =
//            new RuntimePermission("enableContextClassLoaderOverride");
//
//    public static void main(String[] args) {
//
//    }
//
//
////    public java.lang.Thread init(ThreadGroup group, Runnable target,
////                                 String name, long stackSize, AccessControlContext acc) {
////
////        if (name ==  null){
////            throw new NullPointerException("Thread name cannot be null");
////        }
////        /**
////         * 当前线程是该线程的父线程
////         */
////        java.lang.Thread thread = new java.lang.Thread();
////        java.lang.Thread parent = thread.currentThread();
////        group = thread.getThreadGroup();
////        /**
////         * 将daemon 、 priority 属性设置成父线程的对应属性
////         */
////        thread.setDaemon(parent.isDaemon());
////        thread.setPriority(parent.getPriority());
////        thread.setName(name);
////        //setTarget
//
////        if (){
////        }
////    }
//
//
//
//    private void init(ThreadGroup g, Runnable target, String name,
//                      long stackSize, AccessControlContext acc) {
//        if (name == null) {
//            throw new NullPointerException("name cannot be null");
//        }
//
//        this.name = name;
//
//        java.lang.Thread parent = currentThread();
//        SecurityManager security = System.getSecurityManager();
//        if (g == null) {
//            /* Determine if it's an applet or not */
//
//            /* If there is a security manager, ask the security manager
//               what to do. */
//            if (security != null) {
//                g = security.getThreadGroup();
//            }
//
//            /* If the security doesn't have a strong opinion of the matter
//               use the parent thread group. */
//            if (g == null) {
//                g = parent.getThreadGroup();
//            }
//        }
//
//        /* checkAccess regardless of whether or not threadgroup is
//           explicitly passed in. */
//        g.checkAccess();
//
//        /*
//         * Do we have the required permissions?
//         */
//        if (security != null) {
//            if (isCCLOverridden(getClass())) {
//                security.checkPermission(SUBCLASS_IMPLEMENTATION_PERMISSION);
//            }
//        }
//
//        g.addUnstarted();
//
//        this.group = g;
//        this.daemon = parent.isDaemon();
//        this.priority = parent.getPriority();
//        if (security == null || isCCLOverridden(parent.getClass()))
//            this.contextClassLoader = parent.getContextClassLoader();
//        else
//            this.contextClassLoader = parent.contextClassLoader;
//        this.inheritedAccessControlContext =
//                acc != null ? acc : AccessController.getContext();
//        this.target = target;
//        setPriority(priority);
//        if (parent.inheritableThreadLocals != null)
//            this.inheritableThreadLocals =
//                    ThreadLocal.createInheritedMap(parent.inheritableThreadLocals);
//        /* Stash the specified stack size in case the VM cares */
//        this.stackSize = stackSize;
//
//        /* Set thread ID */
//        tid = nextThreadID();
//    }
//
//    /**
//     * Verifies that this (possibly subclass) instance can be constructed
//     * without violating security constraints: the subclass must not override
//     * security-sensitive non-final methods, or else the
//     * "enableContextClassLoaderOverride" RuntimePermission is checked.
//     */
//    private static boolean isCCLOverridden(Class<?> cl) {
//        if (cl == java.lang.Thread.class)
//            return false;
//
//        processQueue(Caches.subclassAuditsQueue, Caches.subclassAudits);
//        WeakClassKey key = new WeakClassKey(cl, Caches.subclassAuditsQueue);
//        Boolean result = Caches.subclassAudits.get(key);
//        if (result == null) {
//            result = Boolean.valueOf(auditSubclass(cl));
//            Caches.subclassAudits.putIfAbsent(key, result);
//        }
//
//        return result.booleanValue();
//    }
//}
