package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.AbstractC2380c;
import androidx.browser.customtabs.AbstractServiceConnectionC2382e;
import androidx.browser.customtabs.C2383f;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdj {
    private C2383f zza;
    private AbstractC2380c zzb;
    private AbstractServiceConnectionC2382e zzc;
    private zzbdi zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i7 = 0; i7 < listQueryIntentActivities.size(); i7++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i7).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzhqn.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        AbstractServiceConnectionC2382e abstractServiceConnectionC2382e = this.zzc;
        if (abstractServiceConnectionC2382e == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC2382e);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final C2383f zzc() {
        AbstractC2380c abstractC2380c = this.zzb;
        if (abstractC2380c == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = abstractC2380c.m10188e(null);
        }
        return this.zza;
    }

    public final void zzd(zzbdi zzbdiVar) {
        this.zzd = zzbdiVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzhqn.zza(activity)) != null) {
            zzhqo zzhqoVar = new zzhqo(this);
            this.zzc = zzhqoVar;
            AbstractC2380c.m10183a(activity, strZza, zzhqoVar);
        }
    }

    public final void zzf(AbstractC2380c abstractC2380c) {
        this.zzb = abstractC2380c;
        abstractC2380c.m10189g(0L);
        zzbdi zzbdiVar = this.zzd;
        if (zzbdiVar != null) {
            zzbdiVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
