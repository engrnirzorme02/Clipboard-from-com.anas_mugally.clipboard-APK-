package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p170W2.C1841f;
import p227d3.C5228d;
import p404z2.AbstractC7599p;
import p404z2.C7584a;
import p404z2.C7590g;
import p404z2.C7605v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbtt implements zzbtv {
    public static zzbtv zza;
    static zzbtv zzb;
    static zzbtv zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final C7584a zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    protected zzbtt(Context context, C7584a c7584a) {
        PackageInfo packageInfoM24152f;
        String country;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzfrn.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = c7584a;
        String string = null;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zziy)).booleanValue()) {
            Handler handler = C7590g.f30239b;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoM24152f = null;
            } else {
                try {
                    packageInfoM24152f = C5228d.m24155a(context).m24152f(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoM24152f = null;
                }
            }
        } else {
            packageInfoM24152f = null;
        }
        this.zzk = packageInfoM24152f;
        zzbbz zzbbzVar = zzbci.zzim;
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            Handler handler2 = C7590g.f30239b;
            country = Locale.getDefault().getCountry();
        } else {
            country = "unknown";
        }
        this.zzl = country;
        if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
            Context context2 = this.zzg;
            Handler handler3 = C7590g.f30239b;
            if (context2 != null) {
                try {
                    PackageInfo packageInfoM24152f2 = C5228d.m24155a(context2).m24152f("com.android.vending", 128);
                    if (packageInfoM24152f2 != null) {
                        string = Integer.toString(packageInfoM24152f2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.zzm = string;
        if (((Integer) C3250D.m17200c().zzd(zzbci.zzii)).intValue() > 0) {
            this.zzp = new HashSet();
        }
    }

    public static zzbtv zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzj(context)) {
                        zza = new zzbtt(context, C7584a.m33270T());
                    } else {
                        zza = new zzbtu();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbtv zzb(Context context, C7584a c7584a) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z7 = false;
                    if (((Boolean) zzbea.zzc.zze()).booleanValue()) {
                        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzig)).booleanValue() || ((Boolean) zzbea.zza.zze()).booleanValue()) {
                            z7 = true;
                        }
                    }
                    if (zzj(context)) {
                        zzbtt zzbttVar = new zzbtt(context, c7584a);
                        zzbttVar.zzl();
                        zzbttVar.zzk();
                        zzc = zzbttVar;
                    } else if (!z7 || context == null) {
                        zzc = new zzbtu();
                    } else {
                        zzbtt zzbttVar2 = new zzbtt(context, c7584a, true);
                        zzbttVar2.zzl();
                        zzbttVar2.zzk();
                        zzc = zzbttVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    public static zzbtv zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzih)).booleanValue()) {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzig)).booleanValue()) {
                            zzb = new zzbtu();
                        } else {
                            zzb = new zzbtt(context, C7584a.m33270T());
                        }
                    } else {
                        zzb = new zzbtu();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    public static zzbtv zzd(Context context, C7584a c7584a) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzih)).booleanValue()) {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzig)).booleanValue()) {
                            zzb = new zzbtu();
                        } else {
                            zzb = new zzbtt(context, c7584a);
                        }
                    } else {
                        zzb = new zzbtu();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzghs.zza(C7590g.m33286p(zze(th)));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(C3244B.m17194e().nextInt(100) < ((Integer) C3250D.m17200c().zzd(zzbci.zznz)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzig)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbtq(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbtr(this, thread.getUncaughtExceptionHandler()));
    }

    protected final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean zM33288w = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM33288w |= C7590g.m33288w(stackTraceElement.getClassName());
                    zEquals |= zzbtt.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzii)).intValue();
            if (iIntValue > 0) {
                if (this.zzp.size() >= iIntValue) {
                    return;
                }
                String strZzf = zzf(th);
                if (this.zzp.contains(strZzf)) {
                    return;
                } else {
                    this.zzp.add(strZzf);
                }
            }
            if (!zM33288w || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbea.zzc.zze()).booleanValue()) {
                return;
            }
            zzbbt.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzi(Throwable th, String str, float f7) {
        Throwable th2;
        String packageName;
        ActivityManager.MemoryInfo memoryInfoM33284n;
        if (this.zzo) {
            return;
        }
        Handler handler = C7590g.f30239b;
        boolean zM24153g = false;
        if (((Boolean) zzber.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z7 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcD)).booleanValue() && stackTrace != null && stackTrace.length == 0 && C7590g.m33288w(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (C7590g.m33288w(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z7 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z7) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strZze = zze(th);
            String strZzf = ((Boolean) C3250D.m17200c().zzd(zzbci.zzjC)).booleanValue() ? zzf(th) : "";
            double d7 = f7;
            double dRandom = Math.random();
            int i7 = f7 > 0.0f ? (int) (1.0f / f7) : 1;
            if (dRandom < d7) {
                ArrayList<String> arrayList2 = new ArrayList();
                try {
                    zM24153g = C5228d.m24155a(this.zzg).m24153g();
                } catch (Throwable th4) {
                    AbstractC7599p.m33329d("Error fetching instant app info", th4);
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    AbstractC7599p.m33331f("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zM24153g)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str2 = Build.MANUFACTURER;
                String string = Build.MODEL;
                if (!string.startsWith(str2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + string.length());
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(string);
                    string = sb.toString();
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", string);
                C7584a c7584a = this.zzj;
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("js", c7584a.f30226a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze).appendQueryParameter("eids", TextUtils.join(",", C3250D.m17199b().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "798351165").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i7)).appendQueryParameter("pb_tm", String.valueOf(zzber.zzc.zze()));
                Context context = this.zzg;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("gmscv", String.valueOf(C1841f.m7623f().m7624a(context))).appendQueryParameter("lite", true != c7584a.f30230e ? "0" : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter4.appendQueryParameter("hash", strZzf);
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzin)).booleanValue() && (memoryInfoM33284n = C7590g.m33284n(context)) != null) {
                    builderAppendQueryParameter4.appendQueryParameter("available_memory", Long.toString(memoryInfoM33284n.availMem));
                    builderAppendQueryParameter4.appendQueryParameter("total_memory", Long.toString(memoryInfoM33284n.totalMem));
                    builderAppendQueryParameter4.appendQueryParameter("is_low_memory", true != memoryInfoM33284n.lowMemory ? "0" : "1");
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzim)).booleanValue()) {
                    String str3 = this.zzl;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter4.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = this.zzm;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter4.appendQueryParameter("psv", str4);
                    }
                    PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage != null) {
                        builderAppendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(currentWebViewPackage.versionCode));
                        builderAppendQueryParameter4.appendQueryParameter("wvvn", currentWebViewPackage.versionName);
                        builderAppendQueryParameter4.appendQueryParameter("wvpn", currentWebViewPackage.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    builderAppendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter4.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter4.toString());
                for (final String str5 : arrayList2) {
                    final C7605v c7605v = new C7605v(this.zzg, null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbts
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            c7605v.zza(str5);
                        }
                    });
                }
            }
        }
    }

    protected zzbtt(Context context, C7584a c7584a, boolean z7) {
        this(context, c7584a);
        this.zzo = true;
    }
}
