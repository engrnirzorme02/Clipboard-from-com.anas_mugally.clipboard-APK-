package com.anas_mugally.clipboard;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p166V5.AbstractC1792a;
import p220c6.AbstractC3026b;
import p220c6.AbstractC3028d;
import p238e6.InterfaceC5367l;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3069s {

    /* JADX INFO: renamed from: a */
    public static final C3069s f12637a = new C3069s();

    /* JADX INFO: renamed from: b */
    private static final String f12638b = "crash_log_";

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.s$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1792a.m7503a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }

    private C3069s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final boolean m15180e(File file) {
        if (file.isFile()) {
            String name = file.getName();
            AbstractC6118n.m27186d(name, "getName(...)");
            if (AbstractC6406h.m27557K(name, f12638b, false, 2, null)) {
                String name2 = file.getName();
                AbstractC6118n.m27186d(name2, "getName(...)");
                if (AbstractC6406h.m27563v(name2, ".txt", false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m15181i(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        C3069s c3069s = f12637a;
        AbstractC6118n.m27184b(thread);
        AbstractC6118n.m27184b(th);
        c3069s.m15182j(context, thread, th);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m15182j(Context context, Thread thread, Throwable th) {
        FileWriter fileWriter;
        Throwable th2;
        Throwable th3;
        Object objValueOf;
        String typeName;
        String extraInfo;
        try {
            Object systemService = context.getSystemService("power");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager powerManager = (PowerManager) systemService;
            boolean zIsInteractive = powerManager.isInteractive();
            File externalFilesDir = context.getExternalFilesDir(null);
            File file = zIsInteractive ? new File(externalFilesDir, "ScreenOn") : new File(externalFilesDir, "ScreenOff");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, f12638b + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".txt");
            FileWriter fileWriter2 = new FileWriter(file2);
            try {
                try {
                    PrintWriter printWriter = new PrintWriter(fileWriter2);
                    try {
                        printWriter.println("===== Crash Report =====");
                        printWriter.println();
                        printWriter.println("Crash Date and Time:");
                        printWriter.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
                        printWriter.println();
                        printWriter.println("Application Information:");
                        boolean z7 = false;
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        printWriter.println("App Name: " + ((Object) context.getApplicationInfo().loadLabel(context.getPackageManager())));
                        printWriter.println("Package Name: " + context.getPackageName());
                        printWriter.println("Version Name: " + packageInfo.versionName);
                        printWriter.println("Version Code: " + packageInfo.versionCode);
                        printWriter.println();
                        printWriter.println("Device Information:");
                        printWriter.println("Manufacturer: " + Build.MANUFACTURER);
                        printWriter.println("Model: " + Build.MODEL);
                        printWriter.println("Android Version: " + Build.VERSION.RELEASE);
                        printWriter.println("API Level: " + Build.VERSION.SDK_INT);
                        printWriter.println("Board: " + Build.BOARD);
                        printWriter.println("Device: " + Build.DEVICE);
                        printWriter.println("Product: " + Build.PRODUCT);
                        printWriter.println();
                        printWriter.println("Network Status:");
                        Object systemService2 = context.getSystemService("connectivity");
                        AbstractC6118n.m27185c(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Connected: ");
                        if (activeNetworkInfo != null) {
                            try {
                                objValueOf = Boolean.valueOf(activeNetworkInfo.isConnected());
                            } catch (Throwable th4) {
                                th3 = th4;
                                fileWriter = fileWriter2;
                                try {
                                    throw th3;
                                } catch (Throwable th5) {
                                    AbstractC3026b.m14999a(printWriter, th3);
                                    throw th5;
                                }
                            }
                        } else {
                            objValueOf = "No network info";
                        }
                        sb.append(objValueOf);
                        printWriter.println(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Type: ");
                        if (activeNetworkInfo == null || (typeName = activeNetworkInfo.getTypeName()) == null) {
                            typeName = "Unknown";
                        }
                        sb2.append(typeName);
                        printWriter.println(sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Details: ");
                        if (activeNetworkInfo == null || (extraInfo = activeNetworkInfo.getExtraInfo()) == null) {
                            extraInfo = "N/A";
                        }
                        sb3.append(extraInfo);
                        printWriter.println(sb3.toString());
                        printWriter.println();
                        printWriter.println("Battery Status:");
                        Object systemService3 = context.getSystemService("batterymanager");
                        AbstractC6118n.m27185c(systemService3, "null cannot be cast to non-null type android.os.BatteryManager");
                        BatteryManager batteryManager = (BatteryManager) systemService3;
                        int intProperty = batteryManager.getIntProperty(4);
                        boolean zIsCharging = batteryManager.isCharging();
                        printWriter.println("Level: " + intProperty + '%');
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Charging: ");
                        sb4.append(zIsCharging);
                        printWriter.println(sb4.toString());
                        printWriter.println();
                        printWriter.println("System Information:");
                        Runtime runtime = Runtime.getRuntime();
                        fileWriter = fileWriter2;
                        long j7 = 1024;
                        try {
                            long jFreeMemory = (runtime.freeMemory() / j7) / j7;
                            long j8 = (runtime.totalMemory() / j7) / j7;
                            printWriter.println("Free Memory: " + jFreeMemory + " MB");
                            printWriter.println("Total Memory: " + j8 + " MB");
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Thread Name: ");
                            sb5.append(thread.getName());
                            printWriter.println(sb5.toString());
                            printWriter.println("Thread ID: " + thread.getId());
                            printWriter.println("Process ID: " + Process.myPid());
                            printWriter.println();
                            printWriter.println("Screen Status:");
                            Object systemService4 = context.getSystemService("keyguard");
                            AbstractC6118n.m27185c(systemService4, "null cannot be cast to non-null type android.app.KeyguardManager");
                            printWriter.println("Screen On: " + zIsInteractive);
                            printWriter.println("Screen Locked: " + ((KeyguardManager) systemService4).isKeyguardLocked());
                            printWriter.println("Device Idle: " + powerManager.isDeviceIdleMode());
                            printWriter.println();
                            printWriter.println("Accessibility Service Status:");
                            Object systemService5 = context.getSystemService("accessibility");
                            AbstractC6118n.m27185c(systemService5, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) systemService5).getEnabledAccessibilityServiceList(-1);
                            AbstractC6118n.m27184b(enabledAccessibilityServiceList);
                            if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                                Iterator<T> it = enabledAccessibilityServiceList.iterator();
                                while (it.hasNext()) {
                                    String id = ((AccessibilityServiceInfo) it.next()).getId();
                                    AbstractC6118n.m27186d(id, "getId(...)");
                                    String packageName = context.getPackageName();
                                    AbstractC6118n.m27186d(packageName, "getPackageName(...)");
                                    if (AbstractC6406h.m27589Q(id, packageName, false, 2, null)) {
                                        z7 = true;
                                        break;
                                    }
                                }
                            }
                            printWriter.println("Service Enabled: " + z7);
                            if (z7) {
                                printWriter.println("Enabled Services: " + AbstractC1638q.m6578R(enabledAccessibilityServiceList, null, null, null, 0, null, new InterfaceC5367l() { // from class: com.anas_mugally.clipboard.q
                                    @Override // p238e6.InterfaceC5367l
                                    public final Object invoke(Object obj) {
                                        return C3069s.m15183k((AccessibilityServiceInfo) obj);
                                    }
                                }, 31, null));
                            } else {
                                printWriter.println("Enabled Services: None");
                            }
                            printWriter.println();
                            printWriter.println("Exception Details:");
                            printWriter.println("Type: " + th.getClass().getName());
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Message: ");
                            String message = th.getMessage();
                            if (message == null) {
                                message = "No message provided";
                            }
                            sb6.append(message);
                            printWriter.println(sb6.toString());
                            printWriter.println();
                            printWriter.println("Stack Trace:");
                            th.printStackTrace(printWriter);
                            printWriter.println();
                            printWriter.println("===== End of Report =====");
                            C1444v c1444v = C1444v.f4971a;
                            AbstractC3026b.m14999a(printWriter, null);
                            AbstractC3026b.m14999a(fileWriter, null);
                            Log.i("ExceptionHandler", "Crash log saved to: " + file2.getAbsolutePath());
                        } catch (Throwable th6) {
                            th = th6;
                            th3 = th;
                            throw th3;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        fileWriter = fileWriter2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    fileWriter = fileWriter2;
                    th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th9) {
                        AbstractC3026b.m14999a(fileWriter, th2);
                        throw th9;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                th2 = th;
                throw th2;
            }
        } catch (Exception e7) {
            Log.e("ExceptionHandler", "Failed to write crash log: " + e7.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final CharSequence m15183k(AccessibilityServiceInfo accessibilityServiceInfo) {
        String id = accessibilityServiceInfo.getId();
        AbstractC6118n.m27186d(id, "getId(...)");
        return id;
    }

    /* JADX INFO: renamed from: d */
    public final List m15184d(Context context, String folderName, int i7) {
        List listJ;
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(folderName, "folderName");
        try {
            File file = new File(context.getExternalFilesDir(null), folderName);
            if (!file.exists()) {
                return AbstractC1638q.m6765j();
            }
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.anas_mugally.clipboard.r
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return C3069s.m15180e(file2);
                }
            });
            if (fileArrListFiles == null || (listJ = AbstractC1631j.m6727X(fileArrListFiles, new a())) == null) {
                listJ = AbstractC1638q.m6765j();
            }
            return AbstractC1638q.m6589c0(listJ, i7);
        } catch (Exception e7) {
            Log.e("ExceptionHandler", "Failed to get last " + i7 + " errors from " + folderName + ": " + e7.getMessage());
            return AbstractC1638q.m6765j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final File m15185f(Context context, List errorFiles, String folderName) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(errorFiles, "errorFiles");
        AbstractC6118n.m27187e(folderName, "folderName");
        try {
            if (errorFiles.isEmpty()) {
                return null;
            }
            File file = new File(context.getExternalFilesDir(null), "merged_" + folderName + "_errors_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".txt");
            FileWriter fileWriter = new FileWriter(file);
            try {
                PrintWriter printWriter = new PrintWriter(fileWriter);
                try {
                    printWriter.println("===== Merged Error Report for " + folderName + " =====");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Generated on: ");
                    sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
                    printWriter.println(sb.toString());
                    printWriter.println("Total errors included: " + errorFiles.size());
                    printWriter.println();
                    int i7 = 0;
                    for (Object obj : errorFiles) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            AbstractC1638q.m6773r();
                        }
                        File file2 = (File) obj;
                        printWriter.println("===== Error " + i8 + " - File: " + file2.getName() + " =====");
                        printWriter.println();
                        try {
                            printWriter.println(AbstractC3028d.m15003c(file2, null, 1, null));
                        } catch (Exception e7) {
                            printWriter.println("Error reading file: " + e7.getMessage());
                        }
                        printWriter.println();
                        printWriter.println(AbstractC6406h.m27547A("=", 40));
                        printWriter.println();
                        i7 = i8;
                    }
                    printWriter.println("===== End of Merged Report =====");
                    C1444v c1444v = C1444v.f4971a;
                    AbstractC3026b.m14999a(printWriter, null);
                    AbstractC3026b.m14999a(fileWriter, null);
                    return file;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3026b.m14999a(printWriter, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC3026b.m14999a(fileWriter, th3);
                    throw th4;
                }
            }
        } catch (Exception e8) {
            Log.e("ExceptionHandler", "Failed to merge error files: " + e8.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15186g(Context context, int i7, InterfaceC5367l sendEmailFunction) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(sendEmailFunction, "sendEmailFunction");
        try {
            List listM15184d = m15184d(context, "ScreenOn", i7);
            File fileM15185f = !listM15184d.isEmpty() ? m15185f(context, listM15184d, "ScreenOn") : null;
            List listM15184d2 = m15184d(context, "ScreenOff", i7);
            File fileM15185f2 = listM15184d2.isEmpty() ? null : m15185f(context, listM15184d2, "ScreenOff");
            ArrayList arrayList = new ArrayList();
            if (fileM15185f != null) {
                arrayList.add(fileM15185f);
            }
            if (fileM15185f2 != null) {
                arrayList.add(fileM15185f2);
            }
            sendEmailFunction.invoke(arrayList);
        } catch (Exception e7) {
            Log.e("ExceptionHandler", "Failed to send last " + i7 + " errors via email: " + e7.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15187h(final Context context) {
        AbstractC6118n.m27187e(context, "context");
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.anas_mugally.clipboard.p
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                C3069s.m15181i(context, defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }
}
