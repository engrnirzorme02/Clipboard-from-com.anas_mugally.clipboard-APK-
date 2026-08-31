package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3484l0;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzexi implements Callable {
    static final /* synthetic */ zzexi zza = new zzexi();

    private /* synthetic */ zzexi() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        HashMap map = new HashMap();
        String str = (String) C3250D.m17200c().zzd(zzbci.zzac);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) C3250D.m17200c().zzd(zzbci.zzad)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, AbstractC3484l0.m17534a(str2));
                }
            }
        }
        return new zzexk(map);
    }
}
