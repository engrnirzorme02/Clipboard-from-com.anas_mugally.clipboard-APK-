package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p340r2.AbstractC6885c;
import p340r2.AbstractC6886d;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfq extends AbstractC6885c {
    private final zzbfp zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbfq(zzbfp zzbfpVar) {
        IBinder iBinder;
        this.zza = zzbfpVar;
        try {
            this.zzc = zzbfpVar.zzb();
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("", e7);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbfpVar.zzc()) {
                zzbfw zzbfuVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(iBinder);
                }
                if (zzbfuVar != null) {
                    this.zzb.add(new zzbfx(zzbfuVar));
                }
            }
        } catch (RemoteException e8) {
            AbstractC7599p.m33329d("", e8);
        }
    }

    public final List<AbstractC6886d> getImages() {
        return this.zzb;
    }

    public final CharSequence getText() {
        return this.zzc;
    }
}
