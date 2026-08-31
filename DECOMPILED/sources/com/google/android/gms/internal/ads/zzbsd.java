package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsd extends NativeAd.AbstractC3516a {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsd(zzbfp zzbfpVar) {
        try {
            this.zzb = zzbfpVar.zzb();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbfpVar.zzc()) {
                zzbfw zzbfwVarZzh = obj instanceof IBinder ? zzbfv.zzh((IBinder) obj) : null;
                if (zzbfwVarZzh != null) {
                    this.zza.add(new zzbsf(zzbfwVarZzh));
                }
            }
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
        }
    }

    public final List<NativeAd.AbstractC3517b> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
