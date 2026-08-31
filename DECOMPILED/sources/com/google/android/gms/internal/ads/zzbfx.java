package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p340r2.AbstractC6886d;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfx extends AbstractC6886d {
    private final zzbfw zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbfx(zzbfw zzbfwVar) {
        Drawable drawable;
        double dZzd;
        int iZze;
        this.zza = zzbfwVar;
        Uri uriZzc = null;
        try {
            InterfaceC3772a interfaceC3772aZzb = zzbfwVar.zzb();
            drawable = interfaceC3772aZzb != null ? (Drawable) BinderC3773b.m18220M0(interfaceC3772aZzb) : null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        this.zzb = drawable;
        try {
            uriZzc = this.zza.zzc();
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
        }
        this.zzc = uriZzc;
        try {
            dZzd = this.zza.zzd();
        } catch (RemoteException e9) {
            AbstractC7599p.m33329d("", e9);
            dZzd = 1.0d;
        }
        this.zzd = dZzd;
        int iZzf = -1;
        try {
            iZze = this.zza.zze();
        } catch (RemoteException e10) {
            AbstractC7599p.m33329d("", e10);
            iZze = -1;
        }
        this.zze = iZze;
        try {
            iZzf = this.zza.zzf();
        } catch (RemoteException e11) {
            AbstractC7599p.m33329d("", e11);
        }
        this.zzf = iZzf;
    }

    @Override // p340r2.AbstractC6886d
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // p340r2.AbstractC6886d
    public final double getScale() {
        return this.zzd;
    }

    @Override // p340r2.AbstractC6886d
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // p340r2.AbstractC6886d
    public final int zza() {
        return this.zze;
    }

    @Override // p340r2.AbstractC6886d
    public final int zzb() {
        return this.zzf;
    }
}
