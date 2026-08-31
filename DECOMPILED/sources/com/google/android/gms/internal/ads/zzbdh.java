package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.AbstractC2380c;
import androidx.browser.customtabs.AbstractServiceConnectionC2382e;
import androidx.browser.customtabs.C2383f;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdh extends AbstractServiceConnectionC2382e {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdsm zzd;
    private C2383f zze;
    private AbstractC2380c zzf;

    private final void zzf(Context context) {
        String strM10185c;
        if (this.zzf != null || context == null || (strM10185c = AbstractC2380c.m10185c(context, null)) == null || strM10185c.equals(context.getPackageName())) {
            return;
        }
        AbstractC2380c.m10183a(context, strM10185c, this);
    }

    @Override // androidx.browser.customtabs.AbstractServiceConnectionC2382e
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2380c abstractC2380c) {
        this.zzf = abstractC2380c;
        abstractC2380c.m10189g(0L);
        this.zze = abstractC2380c.m10188e(new zzbde(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdsm zzdsmVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdsmVar;
        zzf(context);
    }

    public final C2383f zzb() {
        if (this.zze == null) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i7) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfc)).booleanValue() || this.zzd == null) {
            return;
        }
        zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i7);
            }
        });
    }

    final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zze(int i7) {
        zzdsm zzdsmVar = this.zzd;
        if (zzdsmVar != null) {
            zzdsl zzdslVarZza = zzdsmVar.zza();
            zzdslVarZza.zzc("action", "cct_nav");
            zzdslVarZza.zzc("cct_navs", String.valueOf(i7));
            zzdslVarZza.zzd();
        }
    }
}
