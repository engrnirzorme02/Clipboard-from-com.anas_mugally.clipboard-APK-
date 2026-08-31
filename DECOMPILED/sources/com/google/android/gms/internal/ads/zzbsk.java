package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3255E1;
import com.google.android.gms.ads.nativead.InterfaceC3522c;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import p314o2.InterfaceC6562n;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsk implements InterfaceC3522c {
    private final zzbgq zza;
    private InterfaceC3522c.a zzb;

    public zzbsk(zzbgq zzbgqVar) {
        this.zza = zzbgqVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final InterfaceC3522c.a getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null) {
                zzbgq zzbgqVar = this.zza;
                if (zzbgqVar.zzo()) {
                    this.zzb = new zzbse(zzbgqVar);
                }
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
        return this.zzb;
    }

    public final NativeAd.AbstractC3517b getImage(String str) {
        try {
            zzbfw zzbfwVarZzf = this.zza.zzf(str);
            if (zzbfwVarZzf != null) {
                return new zzbsf(zzbfwVarZzf);
            }
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final InterfaceC6562n getMediaContent() {
        try {
            zzbgq zzbgqVar = this.zza;
            if (zzbgqVar.zzs() != null) {
                return new C3255E1(zzbgqVar.zzs(), zzbgqVar);
            }
            return null;
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zze(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzi(str);
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
        }
    }
}
