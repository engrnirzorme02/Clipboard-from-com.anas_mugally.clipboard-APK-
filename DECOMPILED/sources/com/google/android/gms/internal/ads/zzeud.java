package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p227d3.C5228d;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeud implements zzeup {
    private final zzgpd zza;
    private final Context zzb;
    private final C7584a zzc;
    private final String zzd;

    zzeud(zzgpd zzgpdVar, Context context, C7584a c7584a, String str) {
        this.zza = zzgpdVar;
        this.zzb = context;
        this.zzc = c7584a;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 35;
    }

    final /* synthetic */ zzeue zzc() {
        Context context = this.zzb;
        boolean zM24153g = C5228d.m24155a(context).m24153g();
        C7351t.m32349g();
        boolean zM17416i = C3431F0.m17416i(context);
        String str = this.zzc.f30226a;
        C7351t.m32349g();
        boolean zM17418j = C3431F0.m17418j();
        C7351t.m32349g();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzeue(zM24153g, zM17416i, str, zM17418j, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.m18223c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.m18222a(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
