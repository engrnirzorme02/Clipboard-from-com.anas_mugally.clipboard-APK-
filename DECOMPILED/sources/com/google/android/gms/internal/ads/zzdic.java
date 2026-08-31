package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdic extends zzbfs {
    private final zzdiu zza;
    private InterfaceC3772a zzb;

    public zzdic(zzdiu zzdiuVar) {
        this.zza = zzdiuVar;
    }

    private static float zzb(InterfaceC3772a interfaceC3772a) {
        Drawable drawable;
        if (interfaceC3772a == null || (drawable = (Drawable) BinderC3773b.m18220M0(interfaceC3772a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zze() {
        zzcgt zzcgtVarZzN;
        int i7;
        int i8;
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzab() != 0.0f) {
            return zzdiuVar.zzab();
        }
        if (zzdiuVar.zzy() != null) {
            try {
                return zzdiuVar.zzy().zzm();
            } catch (RemoteException e7) {
                int i9 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Remote exception getting video controller aspect ratio.", e7);
                return 0.0f;
            }
        }
        InterfaceC3772a interfaceC3772a = this.zzb;
        if (interfaceC3772a != null) {
            return zzb(interfaceC3772a);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzng)).booleanValue() && zzdiuVar.zzU() != null && (zzcgtVarZzN = zzdiuVar.zzU().zzN()) != null && (i7 = zzcgtVarZzN.zzb) >= 0 && (i8 = zzcgtVarZzN.zza) > 0) {
            return i7 / i8;
        }
        zzbfw zzbfwVarZzD = zzdiuVar.zzD();
        if (zzbfwVarZzD == null) {
            return 0.0f;
        }
        float fZze = (zzbfwVarZzD.zze() == -1 || zzbfwVarZzD.zzf() == -1) ? 0.0f : zzbfwVarZzD.zze() / zzbfwVarZzD.zzf();
        return fZze == 0.0f ? zzb(zzbfwVarZzD.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzf(InterfaceC3772a interfaceC3772a) {
        this.zzb = interfaceC3772a;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final InterfaceC3772a zzg() {
        InterfaceC3772a interfaceC3772a = this.zzb;
        if (interfaceC3772a != null) {
            return interfaceC3772a;
        }
        zzbfw zzbfwVarZzD = this.zza.zzD();
        if (zzbfwVarZzD == null) {
            return null;
        }
        return zzbfwVarZzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzh() {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzy() != null) {
            return zzdiuVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzi() {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzy() != null) {
            return zzdiuVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final InterfaceC3340f1 zzj() {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbheVar) {
        zzdiu zzdiuVar = this.zza;
        if (zzdiuVar.zzy() instanceof zzcfq) {
            ((zzcfq) zzdiuVar.zzy()).zzv(zzbheVar);
        }
    }
}
