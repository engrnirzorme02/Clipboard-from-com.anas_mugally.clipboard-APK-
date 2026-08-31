package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawh extends zzaxl {
    private final Activity zzh;
    private final View zzi;

    public zzawh(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, View view, Activity activity) {
        super(zzavxVar, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", zzarwVar, i7, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) C3250D.m17200c().zzd(zzbci.zzcU);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzS(((Long) objArr[0]).longValue());
                zzarwVar.zzT(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzarwVar.zzU((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
