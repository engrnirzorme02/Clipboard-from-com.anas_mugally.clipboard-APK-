package p235e3;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: e3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5342d {

    /* JADX INFO: renamed from: a */
    private static ClassLoader f20446a;

    /* JADX INFO: renamed from: b */
    private static Thread f20447b;

    /* JADX WARN: Code duplicated, block: B:52:0x00aa A[Catch: all -> 0x00a6, PHI: r1
      0x00aa: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:46:0x00a3] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x00a1, B:60:0x00d0, B:12:0x001f, B:51:0x00a9, B:52:0x00aa, B:63:0x00d4, B:64:0x00d5, B:53:0x00ab, B:59:0x00cf, B:58:0x00b5, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:42:0x0085, B:43:0x009f, B:18:0x003c), top: B:74:0x0003, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static synchronized ClassLoader m24334a() {
        SecurityException e7;
        Thread thread;
        ThreadGroup threadGroup;
        if (f20446a == null) {
            Thread thread2 = f20447b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f20447b.getContextClassLoader();
                    } catch (SecurityException e8) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e8.getMessage());
                    }
                }
                f20446a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i8];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i8++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i7 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i7];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i7++;
                                }
                                if (thread == null) {
                                    try {
                                        C5341c c5341c = new C5341c(threadGroup, "GmsDynamite");
                                        try {
                                            c5341c.setContextClassLoader(null);
                                            c5341c.start();
                                            thread = c5341c;
                                        } catch (SecurityException e9) {
                                            e7 = e9;
                                            thread = c5341c;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e7.getMessage());
                                        }
                                    } catch (SecurityException e10) {
                                        e7 = e10;
                                    }
                                }
                            } catch (SecurityException e11) {
                                e7 = e11;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f20447b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f20447b.getContextClassLoader();
                    }
                }
                f20446a = contextClassLoader;
            }
        }
        return f20446a;
    }
}
