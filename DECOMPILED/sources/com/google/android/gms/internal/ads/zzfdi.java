package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3369m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p314o2.C6556h;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdi {
    public static C3369m2 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfck zzfckVar = (zzfck) it.next();
            if (zzfckVar.zzc) {
                arrayList.add(C6556h.f24747p);
            } else {
                arrayList.add(new C6556h(zzfckVar.zza, zzfckVar.zzb));
            }
        }
        return new C3369m2(context, (C6556h[]) arrayList.toArray(new C6556h[arrayList.size()]));
    }

    public static zzfck zzb(C3369m2 c3369m2) {
        return c3369m2.f14030t ? new zzfck(-3, 0, true) : new zzfck(c3369m2.f14026e, c3369m2.f14023b, false);
    }
}
