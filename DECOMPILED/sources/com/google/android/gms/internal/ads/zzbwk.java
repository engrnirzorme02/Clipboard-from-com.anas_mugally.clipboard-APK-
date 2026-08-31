package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p068I2.InterfaceC0607b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwk implements InterfaceC0607b {
    private final zzbvx zza;

    public zzbwk(zzbvx zzbvxVar) {
        this.zza = zzbvxVar;
    }

    @Override // p068I2.InterfaceC0607b
    public final int getAmount() {
        zzbvx zzbvxVar = this.zza;
        if (zzbvxVar != null) {
            try {
                return zzbvxVar.zzf();
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Could not forward getAmount to RewardItem", e7);
            }
        }
        return 0;
    }

    @Override // p068I2.InterfaceC0607b
    public final String getType() {
        zzbvx zzbvxVar = this.zza;
        if (zzbvxVar != null) {
            try {
                return zzbvxVar.zze();
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Could not forward getType to RewardItem", e7);
            }
        }
        return null;
    }
}
