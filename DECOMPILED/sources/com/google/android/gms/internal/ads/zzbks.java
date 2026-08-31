package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.internal.AbstractC3718s;
import p348s2.InterfaceC7004b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbks {
    private final Context zza;
    private final InterfaceC7004b zzb;
    private zzbko zzc;

    public zzbks(Context context, InterfaceC7004b interfaceC7004b) {
        AbstractC3718s.m18087p(true, "Android version must be Lollipop or higher");
        AbstractC3718s.m18083l(context);
        AbstractC3718s.m18083l(interfaceC7004b);
        this.zza = context;
        this.zzb = interfaceC7004b;
        zzbci.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzkK)).booleanValue()) {
            return false;
        }
        AbstractC3718s.m18083l(str);
        if (str.length() > ((Integer) C3250D.m17200c().zzd(zzbci.zzkM)).intValue()) {
            AbstractC7599p.m33326a("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri = Uri.parse(str);
        return "gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = C3244B.m17191b().m17355k(this.zza, new zzbot(), this.zzb);
    }

    public final boolean zza(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbko zzbkoVar = this.zzc;
        if (zzbkoVar == null) {
            return false;
        }
        try {
            zzbkoVar.zze(str);
            return true;
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return true;
        }
    }

    public final void zzb() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkK)).booleanValue()) {
            zzd();
            zzbko zzbkoVar = this.zzc;
            if (zzbkoVar != null) {
                try {
                    zzbkoVar.zzf();
                } catch (RemoteException e7) {
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                }
            }
        }
    }
}
