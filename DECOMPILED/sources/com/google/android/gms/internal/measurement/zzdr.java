package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;
import p283k3.AbstractC6044o;

/* JADX INFO: loaded from: classes2.dex */
final class zzdr extends zzeq {
    final /* synthetic */ Context zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdr(zzfb zzfbVar, Context context, Bundle bundle) {
        super(zzfbVar, true);
        this.zza = context;
        this.zzb = bundle;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        try {
            Context context = this.zza;
            AbstractC3718s.m18083l(context);
            String strM27050a = AbstractC6044o.m27050a(context);
            AbstractC3718s.m18083l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strM27050a)) {
                strM27050a = AbstractC6044o.m27050a(context);
            }
            Boolean boolM27052c = AbstractC6044o.m27052c("google_analytics_force_disable_updates", resources, strM27050a);
            zzfb zzfbVar = this.zzc;
            zzfbVar.zzR(zzfbVar.zzc(context, boolM27052c == null || !boolM27052c.booleanValue()));
            if (zzfbVar.zzQ() == null) {
                Log.w(zzfbVar.zzO(), "Failed to connect to measurement client.");
                return;
            }
            int iM18222a = DynamiteModule.m18222a(context, ModuleDescriptor.MODULE_ID);
            int iM18223c = DynamiteModule.m18223c(context, ModuleDescriptor.MODULE_ID);
            ((zzcr) AbstractC3718s.m18083l(zzfbVar.zzQ())).initialize(BinderC3773b.m18221N0(context), new zzdd(133005L, Math.max(iM18222a, iM18223c), Boolean.TRUE.equals(boolM27052c) || iM18223c < iM18222a, this.zzb, AbstractC6044o.m27050a(context)), this.zzh);
        } catch (Exception e7) {
            this.zzc.zzN(e7, true, false);
        }
    }
}
