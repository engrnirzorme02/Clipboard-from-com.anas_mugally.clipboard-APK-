package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqd {
    final zzfqg zza;
    final boolean zzb;

    private zzfqd(zzfqg zzfqgVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfqgVar != null;
    }

    public static zzfqd zzb(Context context, String str, String str2) {
        zzfqg zzfqeVar;
        try {
            try {
                try {
                    IBinder iBinderM18233d = DynamiteModule.m18224e(context, DynamiteModule.f14923b, ModuleDescriptor.MODULE_ID).m18233d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderM18233d == null) {
                        zzfqeVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM18233d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfqeVar = iInterfaceQueryLocalInterface instanceof zzfqg ? (zzfqg) iInterfaceQueryLocalInterface : new zzfqe(iBinderM18233d);
                    }
                    zzfqeVar.zzj(BinderC3773b.m18221N0(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfqd(zzfqeVar);
                } catch (Exception e7) {
                    throw new zzfpg(e7);
                }
            } catch (RemoteException | zzfpg | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfqd(new zzfqh());
            }
        } catch (Exception e8) {
            throw new zzfpg(e8);
        }
    }

    public static zzfqd zzc() {
        zzfqh zzfqhVar = new zzfqh();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfqd(zzfqhVar);
    }

    public final zzfqc zza(byte[] bArr) {
        return new zzfqc(this, bArr, null);
    }
}
