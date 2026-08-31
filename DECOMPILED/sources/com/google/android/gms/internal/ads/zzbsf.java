package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsf extends NativeAd.AbstractC3517b {
    private final zzbfw zzb;
    private final Drawable zzc;
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    public zzbsf(zzbfw zzbfwVar) {
        Drawable drawable;
        Uri uriZzc;
        double dZzd;
        int iZze;
        this.zzb = zzbfwVar;
        Map mapZzg = null;
        try {
            InterfaceC3772a interfaceC3772aZzb = zzbfwVar.zzb();
            drawable = interfaceC3772aZzb != null ? (Drawable) BinderC3773b.m18220M0(interfaceC3772aZzb) : null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        this.zzc = drawable;
        try {
            uriZzc = this.zzb.zzc();
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
            uriZzc = null;
        }
        this.zzd = uriZzc;
        try {
            dZzd = this.zzb.zzd();
        } catch (RemoteException e9) {
            AbstractC7599p.m33329d("", e9);
            dZzd = 1.0d;
        }
        this.zze = dZzd;
        int iZzf = -1;
        try {
            iZze = this.zzb.zze();
        } catch (RemoteException e10) {
            AbstractC7599p.m33329d("", e10);
            iZze = -1;
        }
        this.zzf = iZze;
        try {
            iZzf = this.zzb.zzf();
        } catch (RemoteException e11) {
            AbstractC7599p.m33329d("", e11);
        }
        this.zzg = iZzf;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzes)).booleanValue()) {
            try {
                mapZzg = this.zzb.zzg();
            } catch (RemoteException unused) {
            }
        }
        this.zza = mapZzg;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AbstractC3517b
    public final Drawable getDrawable() {
        return this.zzc;
    }

    public final double getScale() {
        return this.zze;
    }

    public final Uri getUri() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzg;
    }
}
