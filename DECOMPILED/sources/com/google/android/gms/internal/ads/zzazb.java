package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzazb implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private final AtomicBoolean zzd = new AtomicBoolean(true);
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    zzazb() {
    }

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.zza = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzdpu) it.next()).zzg(activity);
                    } catch (Exception e7) {
                        C7351t.m32354l().zzg(e7, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdpu) it.next()).zzf(activity);
                } catch (Exception e7) {
                    C7351t.m32354l().zzg(e7, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("", e7);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            C3431F0.f14180l.removeCallbacks(runnable);
        }
        zzfro zzfroVar = C3431F0.f14180l;
        zzaza zzazaVar = new zzaza(this);
        this.zzh = zzazaVar;
        zzfroVar.postDelayed(zzazaVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean andSet = this.zzd.getAndSet(true);
        Runnable runnable = this.zzh;
        if (runnable != null) {
            C3431F0.f14180l.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdpu) it.next()).zze(activity);
                } catch (Exception e7) {
                    C7351t.m32354l().zzg(e7, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("", e7);
                }
            }
            if (andSet) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzazc) it2.next()).zza(true);
                    } catch (Exception e8) {
                        int i9 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("", e8);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) C3250D.m17200c().zzd(zzbci.zzbh)).longValue();
        this.zzi = true;
    }

    public final void zzb(zzazc zzazcVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzazcVar);
        }
    }

    public final void zzc(zzazc zzazcVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzazcVar);
        }
    }

    public final Activity zzd() {
        return this.zza;
    }

    public final Context zze() {
        return this.zzb;
    }

    final /* synthetic */ Object zzf() {
        return this.zzc;
    }

    final /* synthetic */ AtomicBoolean zzg() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    final /* synthetic */ List zzi() {
        return this.zzf;
    }

    public final void zzj(zzdpu zzdpuVar) {
        synchronized (this.zzc) {
            this.zzg.add(zzdpuVar);
        }
    }
}
