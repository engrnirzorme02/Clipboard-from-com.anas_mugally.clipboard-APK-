package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3424C;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzeaa implements zzgoq {
    final /* synthetic */ zzbuv zza;
    final /* synthetic */ zzbun zzb;

    zzeaa(zzeap zzeapVar, zzbuv zzbuvVar, zzbun zzbunVar) {
        this.zza = zzbuvVar;
        this.zzb = zzbunVar;
        Objects.requireNonNull(zzeapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(C3424C.m17380T(th));
        } catch (RemoteException e7) {
            AbstractC3490o0.m17546l("Service can't call client", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue()) {
                this.zzb.zze(parcelFileDescriptor);
                return;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcs)).booleanValue() && (bundle = this.zza.zzm) != null) {
                bundle.putLong(zzdru.BINDER_CALL_START.zza(), C7351t.m32357o().mo18159a());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e7) {
            AbstractC3490o0.m17546l("Service can't call client", e7);
        }
    }
}
