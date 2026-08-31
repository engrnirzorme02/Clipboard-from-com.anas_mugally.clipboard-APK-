package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzaph;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzfqm;
import java.io.File;
import java.util.regex.Pattern;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3511z extends zzapw {

    /* JADX INFO: renamed from: a */
    private final Context f14357a;

    private C3511z(Context context, zzapv zzapvVar) {
        super(zzapvVar);
        this.f14357a = context;
    }

    /* JADX INFO: renamed from: a */
    public static zzapk m17600a(Context context) {
        zzapk zzapkVar = new zzapk(new zzaqd(new File(zzfqm.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new C3511z(context, new zzaqi(null, null)), 4);
        zzapkVar.zza();
        return zzapkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapw, com.google.android.gms.internal.ads.zzapa
    public final zzapd zza(zzaph zzaphVar) throws zzapq {
        if (zzaphVar.zza() == 0) {
            if (Pattern.matches((String) C3250D.m17200c().zzd(zzbci.zzeU), zzaphVar.zzh())) {
                Context context = this.f14357a;
                C3244B.m17190a();
                if (C7590g.m33271A(context, 13400000)) {
                    zzapd zzapdVarZza = new zzblj(context).zza(zzaphVar);
                    if (zzapdVarZza != null) {
                        AbstractC3490o0.m17545k("Got gmscore asset response: ".concat(String.valueOf(zzaphVar.zzh())));
                        return zzapdVarZza;
                    }
                    AbstractC3490o0.m17545k("Failed to get gmscore asset response: ".concat(String.valueOf(zzaphVar.zzh())));
                }
            }
        }
        return super.zza(zzaphVar);
    }
}
