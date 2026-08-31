package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2636b;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3302U1;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3749d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxr {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final Object zzi = new Object();

    public static final Bundle zzq(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean zzr(Context context) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzaC)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m18222a(context, ModuleDescriptor.MODULE_ID) < ((Integer) C3250D.m17200c().zzd(zzbci.zzaD)).intValue()) {
            return false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaE)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzs(Context context, String str, String str2, Bundle bundle) {
        if (zza(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e7) {
                String strValueOf = String.valueOf(str2);
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Invalid event ID: ".concat(strValueOf), e7);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                ConcurrentMap concurrentMap = this.zzh;
                Method declaredMethod = (Method) concurrentMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final Method zzt(Context context, String str) {
        ConcurrentMap concurrentMap = this.zzh;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method declaredMethod = (Method) concurrentMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzw(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzf.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                AbstractC3490o0.m17545k(sb.toString());
            } catch (Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final Object zzv(String str, Context context) {
        AtomicReference atomicReference = this.zzf;
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final void zzw(String str, boolean z7) {
        AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        String string = sb.toString();
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f(string);
        if (z7) {
            AbstractC7599p.m33331f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z7) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            AbstractC2636b.m12603a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            zzw("getInstance", z7);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final boolean zza(Context context) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzau)).booleanValue() && !this.zza.get()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaF)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.zze;
            if (atomicInteger.get() == -1) {
                C3244B.m17190a();
                if (C7590g.m33271A(context, 12451000)) {
                    atomicInteger.set(1);
                } else {
                    C3244B.m17190a();
                    if (C7590g.m33272B(context)) {
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void zzb(Context context, C3302U1 c3302u1) {
        zzbxs.zzb(context).zza().zzc(c3302u1);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaH)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzc(Context context, C3349h2 c3349h2) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaH)).booleanValue() && zza(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzd(Context context, String str) {
        if (zza(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zze(Context context, String str) {
        if (zza(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final String zzf(Context context) {
        if (zza(context)) {
            AtomicReference atomicReference = this.zzf;
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) zzt(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
                    if (str == null) {
                        str = (String) zzt(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    zzw("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    @Deprecated
    public final void zzg(Context context, String str) {
        if (zza(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method declaredMethod = (Method) concurrentMap.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final String zzh(Context context) {
        if (!zza(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzv("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzi(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!zza(context)) {
            return null;
        }
        long jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzaA)).longValue();
        if (jLongValue < 0) {
            return (String) zzv("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            if (AbstractC3749d.m18158a()) {
                threadPoolExecutor = zzfrn.zza().zza(((Integer) C3250D.m17200c().zzd(zzbci.zzaB)).intValue(), new zzbxp(this), 2);
            } else {
                zzbbz zzbbzVar = zzbci.zzaB;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) C3250D.m17200c().zzd(zzbbzVar)).intValue(), ((Integer) C3250D.m17200c().zzd(zzbbzVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbxp(this));
            }
            AbstractC2636b.m12603a(atomicReference, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbxq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzp(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzj(Context context) {
        Object objZzv;
        if (zza(context) && (objZzv = zzv("generateEventId", context)) != null) {
            return objZzv.toString();
        }
        return null;
    }

    public final void zzk(Context context, String str, Map map) {
        zzs(context, "_ac", str, zzq(map));
    }

    public final void zzl(Context context, String str, Map map) {
        zzs(context, "_ai", str, zzq(map));
    }

    public final void zzm(Context context, String str) {
        zzs(context, "_aq", str, null);
    }

    public final void zzn(Context context, String str) {
        zzs(context, "_aa", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i7) {
        if (zza(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i7);
            zzs(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i7).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i7);
            AbstractC3490o0.m17545k(sb.toString());
        }
    }

    final /* synthetic */ String zzp(Context context) {
        return (String) zzv("getAppInstanceId", context);
    }
}
