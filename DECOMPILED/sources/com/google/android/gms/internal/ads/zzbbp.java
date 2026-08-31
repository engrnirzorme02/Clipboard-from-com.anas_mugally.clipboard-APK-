package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.AbstractC3472f0;
import com.google.android.gms.common.internal.AbstractC3718s;
import p227d3.C5228d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbp {
    private final Context zza;

    public zzbbp(Context context) {
        AbstractC3718s.m18084m(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza() {
        Context context = this.zza;
        return ((Boolean) AbstractC3472f0.m17526a(context, zzbbo.zza)).booleanValue() && C5228d.m24155a(context).m24147a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean zzb() {
        return zzc(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc(Intent intent) {
        AbstractC3718s.m18084m(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
